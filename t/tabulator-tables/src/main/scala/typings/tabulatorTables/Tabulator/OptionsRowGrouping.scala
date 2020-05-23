package typings.tabulatorTables.Tabulator

import typings.std.UIEvent
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import typings.tabulatorTables.tabulatorTablesStrings.arrow
import typings.tabulatorTables.tabulatorTablesStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsRowGrouping extends js.Object {
  /** The dataGrouping callback is triggered whenever a data grouping event occurs, after grouping happens. */
  var dataGrouped: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** The dataGrouping callback is triggered whenever a data grouping event occurs, before grouping happens. */
  var dataGrouping: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** String/function to select field to group rows by     */
  var groupBy: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.undefined
  /** The groupClick callback is triggered when a user clicks on a group header. */
  var groupClick: js.UndefOr[GroupEventCallback] = js.undefined
  /** show/hide column calculations when group is closed     */
  var groupClosedShowCalcs: js.UndefOr[Boolean] = js.undefined
  /** The groupContext callback is triggered when a user right clicks on a group header.
    If you want to prevent the browsers context menu being triggered in this event you will need to include the preventDefault() function in your callback. */
  var groupContext: js.UndefOr[GroupEventCallback] = js.undefined
  /** The groupDblClick callback is triggered when a user double clicks on a group header. */
  var groupDblClick: js.UndefOr[GroupEventCallback] = js.undefined
  /** The groupDblTap callback is triggered when a user taps on a group header on a touch display twice in under 300ms. */
  var groupDblTap: js.UndefOr[GroupEventCallback] = js.undefined
  /** You can use the setGroupHeader function to change the header generation function for each group. This function has one argument and takes the same values as passed to the groupHeader setup option.     */
  var groupHeader: js.UndefOr[
    (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      String
    ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
  ] = js.undefined
  /** You can set the default open state of groups using the groupStartOpen property* * This can take one of three possible values:
    true - all groups start open (default value)
    false - all groups start closed
    function() - a callback to decide if a group should start open or closed
    Group Open Function
    If you want to decide on a group by group basis which should start open or closed then you can pass a function to the groupStartOpen property. This should return true if the group should start open or false if the group should start closed.
    */
  var groupStartOpen: js.UndefOr[
    Boolean | (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      Boolean
    ])
  ] = js.undefined
  /** The groupTap callback is triggered when a user taps on a group header on a touch display. */
  var groupTap: js.UndefOr[GroupEventCallback] = js.undefined
  /** The groupTapHold callback is triggered when a user taps on a group header on a touch display and holds their finger down for over 1 second */
  var groupTapHold: js.UndefOr[GroupEventCallback] = js.undefined
  /** By default Tabulator allows users to toggle a group open or closed by clicking on the arrow icon in the left of the group header. If you would prefer a different behaviour you can use the groupToggleElement option to choose a different option:* * The option can take one of three values:
    arrow - togggle group on arrow element click
    header - toggle group on click anywhere on the group header element
    false - prevent clicking anywhere in the group toggling the group
    */
  var groupToggleElement: js.UndefOr[arrow | header | `false`] = js.undefined
  /** By default Tabulator will create groups for rows based on the values contained in the row data. if you want to explicitly define which field values groups should be created for at each level, you can use the groupValues option.
    This option takes an array of value arrays, each item in the first array should be a list of acceptable field values for groups at that level     */
  var groupValues: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
  /** The groupVisibilityChanged callback is triggered whenever a group changes between hidden and visible states. */
  var groupVisibilityChanged: js.UndefOr[js.Function2[/* group */ GroupComponent, /* visible */ Boolean, Unit]] = js.undefined
}

object OptionsRowGrouping {
  @scala.inline
  def apply(
    dataGrouped: () => Unit = null,
    dataGrouping: () => Unit = null,
    groupBy: String | (js.Function1[/* data */ js.Any, _]) = null,
    groupClick: (/* e */ UIEvent, /* group */ GroupComponent) => Unit = null,
    groupClosedShowCalcs: js.UndefOr[Boolean] = js.undefined,
    groupContext: (/* e */ UIEvent, /* group */ GroupComponent) => Unit = null,
    groupDblClick: (/* e */ UIEvent, /* group */ GroupComponent) => Unit = null,
    groupDblTap: (/* e */ UIEvent, /* group */ GroupComponent) => Unit = null,
    groupHeader: (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      String
    ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]]) = null,
    groupStartOpen: Boolean | (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      Boolean
    ]) = null,
    groupTap: (/* e */ UIEvent, /* group */ GroupComponent) => Unit = null,
    groupTapHold: (/* e */ UIEvent, /* group */ GroupComponent) => Unit = null,
    groupToggleElement: arrow | header | `false` = null,
    groupValues: js.Array[js.Array[_]] = null,
    groupVisibilityChanged: (/* group */ GroupComponent, /* visible */ Boolean) => Unit = null
  ): OptionsRowGrouping = {
    val __obj = js.Dynamic.literal()
    if (dataGrouped != null) __obj.updateDynamic("dataGrouped")(js.Any.fromFunction0(dataGrouped))
    if (dataGrouping != null) __obj.updateDynamic("dataGrouping")(js.Any.fromFunction0(dataGrouping))
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (groupClick != null) __obj.updateDynamic("groupClick")(js.Any.fromFunction2(groupClick))
    if (!js.isUndefined(groupClosedShowCalcs)) __obj.updateDynamic("groupClosedShowCalcs")(groupClosedShowCalcs.get.asInstanceOf[js.Any])
    if (groupContext != null) __obj.updateDynamic("groupContext")(js.Any.fromFunction2(groupContext))
    if (groupDblClick != null) __obj.updateDynamic("groupDblClick")(js.Any.fromFunction2(groupDblClick))
    if (groupDblTap != null) __obj.updateDynamic("groupDblTap")(js.Any.fromFunction2(groupDblTap))
    if (groupHeader != null) __obj.updateDynamic("groupHeader")(groupHeader.asInstanceOf[js.Any])
    if (groupStartOpen != null) __obj.updateDynamic("groupStartOpen")(groupStartOpen.asInstanceOf[js.Any])
    if (groupTap != null) __obj.updateDynamic("groupTap")(js.Any.fromFunction2(groupTap))
    if (groupTapHold != null) __obj.updateDynamic("groupTapHold")(js.Any.fromFunction2(groupTapHold))
    if (groupToggleElement != null) __obj.updateDynamic("groupToggleElement")(groupToggleElement.asInstanceOf[js.Any])
    if (groupValues != null) __obj.updateDynamic("groupValues")(groupValues.asInstanceOf[js.Any])
    if (groupVisibilityChanged != null) __obj.updateDynamic("groupVisibilityChanged")(js.Any.fromFunction2(groupVisibilityChanged))
    __obj.asInstanceOf[OptionsRowGrouping]
  }
}


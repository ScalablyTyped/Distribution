package typings.tabulatorTables.Tabulator

import typings.std.UIEvent
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import typings.tabulatorTables.tabulatorTablesStrings.arrow
import typings.tabulatorTables.tabulatorTablesStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsRowGrouping extends js.Object {
  
  /** The dataGrouping callback is triggered whenever a data grouping event occurs, after grouping happens. */
  var dataGrouped: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** The dataGrouping callback is triggered whenever a data grouping event occurs, before grouping happens. */
  var dataGrouping: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** String/function to select field to group rows by     */
  var groupBy: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  
  /** The groupClick callback is triggered when a user clicks on a group header. */
  var groupClick: js.UndefOr[GroupEventCallback] = js.native
  
  /** show/hide column calculations when group is closed     */
  var groupClosedShowCalcs: js.UndefOr[Boolean] = js.native
  
  /** The groupContext callback is triggered when a user right clicks on a group header.
    If you want to prevent the browsers context menu being triggered in this event you will need to include the preventDefault() function in your callback. */
  var groupContext: js.UndefOr[GroupEventCallback] = js.native
  
  /** The groupDblClick callback is triggered when a user double clicks on a group header. */
  var groupDblClick: js.UndefOr[GroupEventCallback] = js.native
  
  /** The groupDblTap callback is triggered when a user taps on a group header on a touch display twice in under 300ms. */
  var groupDblTap: js.UndefOr[GroupEventCallback] = js.native
  
  /** You can use the setGroupHeader function to change the header generation function for each group. This function has one argument and takes the same values as passed to the groupHeader setup option.     */
  var groupHeader: js.UndefOr[
    (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      String
    ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
  ] = js.native
  
  /**When printing you may want to apply a different group header from the one usualy used in the table. You can now do this using the groupHeaderPrint table option, which takes the same inputs as the standard groupHeader property. */
  var groupHeaderPrint: js.UndefOr[
    (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      String
    ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
  ] = js.native
  
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
  ] = js.native
  
  /** The groupTap callback is triggered when a user taps on a group header on a touch display. */
  var groupTap: js.UndefOr[GroupEventCallback] = js.native
  
  /** The groupTapHold callback is triggered when a user taps on a group header on a touch display and holds their finger down for over 1 second */
  var groupTapHold: js.UndefOr[GroupEventCallback] = js.native
  
  /** By default Tabulator allows users to toggle a group open or closed by clicking on the arrow icon in the left of the group header. If you would prefer a different behaviour you can use the groupToggleElement option to choose a different option:* * The option can take one of three values:
    arrow - togggle group on arrow element click
    header - toggle group on click anywhere on the group header element
    false - prevent clicking anywhere in the group toggling the group
    */
  var groupToggleElement: js.UndefOr[arrow | header | `false`] = js.native
  
  var groupUpdateOnCellEdit: js.UndefOr[Boolean] = js.native
  
  /** By default Tabulator will create groups for rows based on the values contained in the row data. if you want to explicitly define which field values groups should be created for at each level, you can use the groupValues option.
    This option takes an array of value arrays, each item in the first array should be a list of acceptable field values for groups at that level     */
  var groupValues: js.UndefOr[GroupValuesArg] = js.native
  
  /** The groupVisibilityChanged callback is triggered whenever a group changes between hidden and visible states. */
  var groupVisibilityChanged: js.UndefOr[js.Function2[/* group */ GroupComponent, /* visible */ Boolean, Unit]] = js.native
}
object OptionsRowGrouping {
  
  @scala.inline
  def apply(): OptionsRowGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsRowGrouping]
  }
  
  @scala.inline
  implicit class OptionsRowGroupingOps[Self <: OptionsRowGrouping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataGrouped(value: () => Unit): Self = this.set("dataGrouped", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDataGrouped: Self = this.set("dataGrouped", js.undefined)
    
    @scala.inline
    def setDataGrouping(value: () => Unit): Self = this.set("dataGrouping", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDataGrouping: Self = this.set("dataGrouping", js.undefined)
    
    @scala.inline
    def setGroupByFunction1(value: /* data */ js.Any => _): Self = this.set("groupBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGroupBy(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
    
    @scala.inline
    def setGroupClick(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = this.set("groupClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGroupClick: Self = this.set("groupClick", js.undefined)
    
    @scala.inline
    def setGroupClosedShowCalcs(value: Boolean): Self = this.set("groupClosedShowCalcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupClosedShowCalcs: Self = this.set("groupClosedShowCalcs", js.undefined)
    
    @scala.inline
    def setGroupContext(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = this.set("groupContext", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGroupContext: Self = this.set("groupContext", js.undefined)
    
    @scala.inline
    def setGroupDblClick(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = this.set("groupDblClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGroupDblClick: Self = this.set("groupDblClick", js.undefined)
    
    @scala.inline
    def setGroupDblTap(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = this.set("groupDblTap", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGroupDblTap: Self = this.set("groupDblTap", js.undefined)
    
    @scala.inline
    def setGroupHeaderVarargs(value: (js.Function3[js.Any, /* count */ Double, js.Any, String])*): Self = this.set("groupHeader", js.Array(value :_*))
    
    @scala.inline
    def setGroupHeaderFunction4(
      value: (/* value */ js.Any, /* count */ Double, /* data */ js.Any, /* group */ GroupComponent) => String
    ): Self = this.set("groupHeader", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGroupHeader(
      value: (js.Function4[
          /* value */ js.Any, 
          /* count */ Double, 
          /* data */ js.Any, 
          /* group */ GroupComponent, 
          String
        ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
    ): Self = this.set("groupHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupHeader: Self = this.set("groupHeader", js.undefined)
    
    @scala.inline
    def setGroupHeaderPrintVarargs(value: (js.Function3[js.Any, /* count */ Double, js.Any, String])*): Self = this.set("groupHeaderPrint", js.Array(value :_*))
    
    @scala.inline
    def setGroupHeaderPrintFunction4(
      value: (/* value */ js.Any, /* count */ Double, /* data */ js.Any, /* group */ GroupComponent) => String
    ): Self = this.set("groupHeaderPrint", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGroupHeaderPrint(
      value: (js.Function4[
          /* value */ js.Any, 
          /* count */ Double, 
          /* data */ js.Any, 
          /* group */ GroupComponent, 
          String
        ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]])
    ): Self = this.set("groupHeaderPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupHeaderPrint: Self = this.set("groupHeaderPrint", js.undefined)
    
    @scala.inline
    def setGroupStartOpenFunction4(
      value: (/* value */ js.Any, /* count */ Double, /* data */ js.Any, /* group */ GroupComponent) => Boolean
    ): Self = this.set("groupStartOpen", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGroupStartOpen(
      value: Boolean | (js.Function4[
          /* value */ js.Any, 
          /* count */ Double, 
          /* data */ js.Any, 
          /* group */ GroupComponent, 
          Boolean
        ])
    ): Self = this.set("groupStartOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupStartOpen: Self = this.set("groupStartOpen", js.undefined)
    
    @scala.inline
    def setGroupTap(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = this.set("groupTap", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGroupTap: Self = this.set("groupTap", js.undefined)
    
    @scala.inline
    def setGroupTapHold(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = this.set("groupTapHold", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGroupTapHold: Self = this.set("groupTapHold", js.undefined)
    
    @scala.inline
    def setGroupToggleElement(value: arrow | header | `false`): Self = this.set("groupToggleElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupToggleElement: Self = this.set("groupToggleElement", js.undefined)
    
    @scala.inline
    def setGroupUpdateOnCellEdit(value: Boolean): Self = this.set("groupUpdateOnCellEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupUpdateOnCellEdit: Self = this.set("groupUpdateOnCellEdit", js.undefined)
    
    @scala.inline
    def setGroupValuesVarargs(value: js.Array[js.Any]*): Self = this.set("groupValues", js.Array(value :_*))
    
    @scala.inline
    def setGroupValues(value: GroupValuesArg): Self = this.set("groupValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupValues: Self = this.set("groupValues", js.undefined)
    
    @scala.inline
    def setGroupVisibilityChanged(value: (/* group */ GroupComponent, /* visible */ Boolean) => Unit): Self = this.set("groupVisibilityChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGroupVisibilityChanged: Self = this.set("groupVisibilityChanged", js.undefined)
  }
}

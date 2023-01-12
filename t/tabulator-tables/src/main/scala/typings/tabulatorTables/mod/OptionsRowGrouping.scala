package typings.tabulatorTables.mod

import typings.std.UIEvent
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import typings.tabulatorTables.tabulatorTablesStrings.arrow
import typings.tabulatorTables.tabulatorTablesStrings.header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsRowGrouping extends StObject {
  
  /** The dataGrouping callback is triggered whenever a data grouping event occurs, after grouping happens. */
  var dataGrouped: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** The dataGrouping callback is triggered whenever a data grouping event occurs, before grouping happens. */
  var dataGrouping: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** String/function to select field to group rows by */
  var groupBy: js.UndefOr[GroupArg] = js.undefined
  
  /** The groupClick callback is triggered when a user clicks on a group header. */
  var groupClick: js.UndefOr[GroupEventCallback] = js.undefined
  
  /** show/hide column calculations when group is closed. */
  var groupClosedShowCalcs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The groupContext callback is triggered when a user right clicks on a group header.
    *
    * If you want to prevent the browsers context menu being triggered in this event you will need to include the preventDefault() function in your callback.
    */
  var groupContext: js.UndefOr[GroupEventCallback] = js.undefined
  
  /** The groupDblClick callback is triggered when a user double clicks on a group header. */
  var groupDblClick: js.UndefOr[GroupEventCallback] = js.undefined
  
  /** The groupDblTap callback is triggered when a user taps on a group header on a touch display twice in under 300ms. */
  var groupDblTap: js.UndefOr[GroupEventCallback] = js.undefined
  
  /** You can use the setGroupHeader function to change the header generation function for each group. This function has one argument and takes the same values as passed to the groupHeader setup option. */
  var groupHeader: js.UndefOr[
    (js.Function4[/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent, String]) | (js.Array[js.Function3[/* value */ Any, /* count */ Double, /* data */ Any, String]])
  ] = js.undefined
  
  /** When printing you may want to apply a different group header from the one usually used in the table. You can now do this using the groupHeaderPrint table option, which takes the same inputs as the standard groupHeader property. */
  var groupHeaderPrint: js.UndefOr[
    (js.Function4[/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent, String]) | (js.Array[js.Function3[/* value */ Any, /* count */ Double, /* data */ Any, String]])
  ] = js.undefined
  
  /**
    * You can set the default open state of groups using the groupStartOpen property* * This can take one of three possible values:
    *
    * true - all groups start open (default value)
    * false - all groups start closed
    * function() - a callback to decide if a group should start open or closed
    * Group Open Function
    * If you want to decide on a group by group basis which should start open or closed then you can pass a function to the groupStartOpen property. This should return true if the group should start open or false if the group should start closed.
    */
  var groupStartOpen: js.UndefOr[
    Boolean | (js.Function4[/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent, Boolean])
  ] = js.undefined
  
  /** The groupTap callback is triggered when a user taps on a group header on a touch display. */
  var groupTap: js.UndefOr[GroupEventCallback] = js.undefined
  
  /** The groupTapHold callback is triggered when a user taps on a group header on a touch display and holds their finger down for over 1 second. */
  var groupTapHold: js.UndefOr[GroupEventCallback] = js.undefined
  
  /**
    * By default Tabulator allows users to toggle a group open or closed by clicking on the arrow icon in the left of the group header. If you would prefer a different behavior you can use the groupToggleElement option to choose a different option:* * The option can take one of three values:
    * arrow - toggle group on arrow element click
    * header - toggle group on click anywhere on the group header element
    * false - prevent clicking anywhere in the group toggling the group
    */
  var groupToggleElement: js.UndefOr[arrow | header | `false`] = js.undefined
  
  var groupUpdateOnCellEdit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default Tabulator will create groups for rows based on the values contained in the row data. if you want to explicitly define which field values groups should be created for at each level, you can use the groupValues option.
    *
    * This option takes an array of value arrays, each item in the first array should be a list of acceptable field values for groups at that level
    */
  var groupValues: js.UndefOr[GroupValuesArg] = js.undefined
  
  /** The groupVisibilityChanged callback is triggered whenever a group changes between hidden and visible states. */
  var groupVisibilityChanged: js.UndefOr[js.Function2[/* group */ GroupComponent, /* visible */ Boolean, Unit]] = js.undefined
}
object OptionsRowGrouping {
  
  inline def apply(): OptionsRowGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsRowGrouping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsRowGrouping] (val x: Self) extends AnyVal {
    
    inline def setDataGrouped(value: () => Unit): Self = StObject.set(x, "dataGrouped", js.Any.fromFunction0(value))
    
    inline def setDataGroupedUndefined: Self = StObject.set(x, "dataGrouped", js.undefined)
    
    inline def setDataGrouping(value: () => Unit): Self = StObject.set(x, "dataGrouping", js.Any.fromFunction0(value))
    
    inline def setDataGroupingUndefined: Self = StObject.set(x, "dataGrouping", js.undefined)
    
    inline def setGroupBy(value: GroupArg): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByFunction1(value: /* data */ Any => Any): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
    
    inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
    
    inline def setGroupByVarargs(value: String*): Self = StObject.set(x, "groupBy", js.Array(value*))
    
    inline def setGroupClick(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = StObject.set(x, "groupClick", js.Any.fromFunction2(value))
    
    inline def setGroupClickUndefined: Self = StObject.set(x, "groupClick", js.undefined)
    
    inline def setGroupClosedShowCalcs(value: Boolean): Self = StObject.set(x, "groupClosedShowCalcs", value.asInstanceOf[js.Any])
    
    inline def setGroupClosedShowCalcsUndefined: Self = StObject.set(x, "groupClosedShowCalcs", js.undefined)
    
    inline def setGroupContext(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = StObject.set(x, "groupContext", js.Any.fromFunction2(value))
    
    inline def setGroupContextUndefined: Self = StObject.set(x, "groupContext", js.undefined)
    
    inline def setGroupDblClick(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = StObject.set(x, "groupDblClick", js.Any.fromFunction2(value))
    
    inline def setGroupDblClickUndefined: Self = StObject.set(x, "groupDblClick", js.undefined)
    
    inline def setGroupDblTap(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = StObject.set(x, "groupDblTap", js.Any.fromFunction2(value))
    
    inline def setGroupDblTapUndefined: Self = StObject.set(x, "groupDblTap", js.undefined)
    
    inline def setGroupHeader(
      value: (js.Function4[/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent, String]) | (js.Array[js.Function3[/* value */ Any, /* count */ Double, /* data */ Any, String]])
    ): Self = StObject.set(x, "groupHeader", value.asInstanceOf[js.Any])
    
    inline def setGroupHeaderFunction4(value: (/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent) => String): Self = StObject.set(x, "groupHeader", js.Any.fromFunction4(value))
    
    inline def setGroupHeaderPrint(
      value: (js.Function4[/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent, String]) | (js.Array[js.Function3[/* value */ Any, /* count */ Double, /* data */ Any, String]])
    ): Self = StObject.set(x, "groupHeaderPrint", value.asInstanceOf[js.Any])
    
    inline def setGroupHeaderPrintFunction4(value: (/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent) => String): Self = StObject.set(x, "groupHeaderPrint", js.Any.fromFunction4(value))
    
    inline def setGroupHeaderPrintUndefined: Self = StObject.set(x, "groupHeaderPrint", js.undefined)
    
    inline def setGroupHeaderPrintVarargs(value: (js.Function3[/* value */ Any, /* count */ Double, /* data */ Any, String])*): Self = StObject.set(x, "groupHeaderPrint", js.Array(value*))
    
    inline def setGroupHeaderUndefined: Self = StObject.set(x, "groupHeader", js.undefined)
    
    inline def setGroupHeaderVarargs(value: (js.Function3[/* value */ Any, /* count */ Double, /* data */ Any, String])*): Self = StObject.set(x, "groupHeader", js.Array(value*))
    
    inline def setGroupStartOpen(
      value: Boolean | (js.Function4[/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent, Boolean])
    ): Self = StObject.set(x, "groupStartOpen", value.asInstanceOf[js.Any])
    
    inline def setGroupStartOpenFunction4(
      value: (/* value */ Any, /* count */ Double, /* data */ Any, /* group */ GroupComponent) => Boolean
    ): Self = StObject.set(x, "groupStartOpen", js.Any.fromFunction4(value))
    
    inline def setGroupStartOpenUndefined: Self = StObject.set(x, "groupStartOpen", js.undefined)
    
    inline def setGroupTap(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = StObject.set(x, "groupTap", js.Any.fromFunction2(value))
    
    inline def setGroupTapHold(value: (/* e */ UIEvent, /* group */ GroupComponent) => Unit): Self = StObject.set(x, "groupTapHold", js.Any.fromFunction2(value))
    
    inline def setGroupTapHoldUndefined: Self = StObject.set(x, "groupTapHold", js.undefined)
    
    inline def setGroupTapUndefined: Self = StObject.set(x, "groupTap", js.undefined)
    
    inline def setGroupToggleElement(value: arrow | header | `false`): Self = StObject.set(x, "groupToggleElement", value.asInstanceOf[js.Any])
    
    inline def setGroupToggleElementUndefined: Self = StObject.set(x, "groupToggleElement", js.undefined)
    
    inline def setGroupUpdateOnCellEdit(value: Boolean): Self = StObject.set(x, "groupUpdateOnCellEdit", value.asInstanceOf[js.Any])
    
    inline def setGroupUpdateOnCellEditUndefined: Self = StObject.set(x, "groupUpdateOnCellEdit", js.undefined)
    
    inline def setGroupValues(value: GroupValuesArg): Self = StObject.set(x, "groupValues", value.asInstanceOf[js.Any])
    
    inline def setGroupValuesUndefined: Self = StObject.set(x, "groupValues", js.undefined)
    
    inline def setGroupValuesVarargs(value: js.Array[Any]*): Self = StObject.set(x, "groupValues", js.Array(value*))
    
    inline def setGroupVisibilityChanged(value: (/* group */ GroupComponent, /* visible */ Boolean) => Unit): Self = StObject.set(x, "groupVisibilityChanged", js.Any.fromFunction2(value))
    
    inline def setGroupVisibilityChangedUndefined: Self = StObject.set(x, "groupVisibilityChanged", js.undefined)
  }
}

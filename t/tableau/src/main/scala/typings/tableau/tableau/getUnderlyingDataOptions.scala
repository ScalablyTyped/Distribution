package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait getUnderlyingDataOptions extends StObject {
  
  /** Do not use aliases specified in the data source in Tableau. Default is false. */
  var ignoreAliases: js.UndefOr[Boolean] = js.undefined
  
  /** Return all the columns for the data source. Default is false. */
  var ignoreAllColumns: js.UndefOr[Boolean] = js.undefined
  
  /** Only return data for the currently selected marks. Default is false. */
  var ignoreSelection: js.UndefOr[Boolean] = js.undefined
  
  /** The number of rows of data that you want to return. Enter 0 to return all rows. */
  var maxRows: Double
}
object getUnderlyingDataOptions {
  
  @scala.inline
  def apply(maxRows: Double): getUnderlyingDataOptions = {
    val __obj = js.Dynamic.literal(maxRows = maxRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[getUnderlyingDataOptions]
  }
  
  @scala.inline
  implicit class getUnderlyingDataOptionsMutableBuilder[Self <: getUnderlyingDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreAliases(value: Boolean): Self = StObject.set(x, "ignoreAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreAliasesUndefined: Self = StObject.set(x, "ignoreAliases", js.undefined)
    
    @scala.inline
    def setIgnoreAllColumns(value: Boolean): Self = StObject.set(x, "ignoreAllColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreAllColumnsUndefined: Self = StObject.set(x, "ignoreAllColumns", js.undefined)
    
    @scala.inline
    def setIgnoreSelection(value: Boolean): Self = StObject.set(x, "ignoreSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreSelectionUndefined: Self = StObject.set(x, "ignoreSelection", js.undefined)
    
    @scala.inline
    def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
  }
}

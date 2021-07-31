package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait getSummaryDataOptions extends StObject {
  
  /** Do not use aliases specified in the data source in Tableau. Default is false. */
  var ignoreAliases: js.UndefOr[Boolean] = js.undefined
  
  /** Only return data for the currently selected marks. Default is false. */
  var ignoreSelection: js.UndefOr[Boolean] = js.undefined
  
  /** The number of rows of data that you want to return. Enter 0 to return all rows. */
  var maxRows: Double
}
object getSummaryDataOptions {
  
  @scala.inline
  def apply(maxRows: Double): getSummaryDataOptions = {
    val __obj = js.Dynamic.literal(maxRows = maxRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[getSummaryDataOptions]
  }
  
  @scala.inline
  implicit class getSummaryDataOptionsMutableBuilder[Self <: getSummaryDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreAliases(value: Boolean): Self = StObject.set(x, "ignoreAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreAliasesUndefined: Self = StObject.set(x, "ignoreAliases", js.undefined)
    
    @scala.inline
    def setIgnoreSelection(value: Boolean): Self = StObject.set(x, "ignoreSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreSelectionUndefined: Self = StObject.set(x, "ignoreSelection", js.undefined)
    
    @scala.inline
    def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
  }
}

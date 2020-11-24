package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait getUnderlyingDataOptions extends js.Object {
  
  /** Do not use aliases specified in the data source in Tableau. Default is false. */
  var ignoreAliases: js.UndefOr[Boolean] = js.native
  
  /** Return all the columns for the data source. Default is false. */
  var ignoreAllColumns: js.UndefOr[Boolean] = js.native
  
  /** Only return data for the currently selected marks. Default is false. */
  var ignoreSelection: js.UndefOr[Boolean] = js.native
  
  /** The number of rows of data that you want to return. Enter 0 to return all rows. */
  var maxRows: Double = js.native
}
object getUnderlyingDataOptions {
  
  @scala.inline
  def apply(maxRows: Double): getUnderlyingDataOptions = {
    val __obj = js.Dynamic.literal(maxRows = maxRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[getUnderlyingDataOptions]
  }
  
  @scala.inline
  implicit class getUnderlyingDataOptionsOps[Self <: getUnderlyingDataOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxRows(value: Double): Self = this.set("maxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreAliases(value: Boolean): Self = this.set("ignoreAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreAliases: Self = this.set("ignoreAliases", js.undefined)
    
    @scala.inline
    def setIgnoreAllColumns(value: Boolean): Self = this.set("ignoreAllColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreAllColumns: Self = this.set("ignoreAllColumns", js.undefined)
    
    @scala.inline
    def setIgnoreSelection(value: Boolean): Self = this.set("ignoreSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreSelection: Self = this.set("ignoreSelection", js.undefined)
  }
}

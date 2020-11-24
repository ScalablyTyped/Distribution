package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Filtering
@js.native
trait FilterOptions extends js.Object {
  
  /**
    * Determines whether the filter will apply in exclude mode or include mode.
    * The default is include, which means that you use the fields as part of a filter.
    * Exclude mode means that you include everything else except the specified fields.
    */
  var isExcludeMode: Boolean = js.native
}
object FilterOptions {
  
  @scala.inline
  def apply(isExcludeMode: Boolean): FilterOptions = {
    val __obj = js.Dynamic.literal(isExcludeMode = isExcludeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions]
  }
  
  @scala.inline
  implicit class FilterOptionsOps[Self <: FilterOptions] (val x: Self) extends AnyVal {
    
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
    def setIsExcludeMode(value: Boolean): Self = this.set("isExcludeMode", value.asInstanceOf[js.Any])
  }
}

package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckboxParams
  extends SharedEditorParams
     with _EditorParams {
  
  var indeterminateValue: js.UndefOr[String] = js.native
  
  // tick
  var tristate: js.UndefOr[Boolean] = js.native
}
object CheckboxParams {
  
  @scala.inline
  def apply(): CheckboxParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxParams]
  }
  
  @scala.inline
  implicit class CheckboxParamsOps[Self <: CheckboxParams] (val x: Self) extends AnyVal {
    
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
    def setIndeterminateValue(value: String): Self = this.set("indeterminateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndeterminateValue: Self = this.set("indeterminateValue", js.undefined)
    
    @scala.inline
    def setTristate(value: Boolean): Self = this.set("tristate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTristate: Self = this.set("tristate", js.undefined)
  }
}

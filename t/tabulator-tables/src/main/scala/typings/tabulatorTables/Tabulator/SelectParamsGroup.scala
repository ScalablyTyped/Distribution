package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectParamsGroup extends js.Object {
  
  var elementAttributes: js.UndefOr[js.Object] = js.native
  
  var label: String = js.native
  
  var options: js.UndefOr[js.Array[SelectLabelValue]] = js.native
  
  var value: js.UndefOr[String | Double | Boolean] = js.native
}
object SelectParamsGroup {
  
  @scala.inline
  def apply(label: String): SelectParamsGroup = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectParamsGroup]
  }
  
  @scala.inline
  implicit class SelectParamsGroupOps[Self <: SelectParamsGroup] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementAttributes(value: js.Object): Self = this.set("elementAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementAttributes: Self = this.set("elementAttributes", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: SelectLabelValue*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[SelectLabelValue]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double | Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}

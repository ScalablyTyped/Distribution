package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sheet2HTMLOpts extends js.Object {
  
  /** Add contenteditable to every cell */
  var editable: js.UndefOr[Boolean] = js.native
  
  /** Footer HTML */
  var footer: js.UndefOr[String] = js.native
  
  /** Header HTML */
  var header: js.UndefOr[String] = js.native
  
  /** TABLE element id attribute */
  var id: js.UndefOr[String] = js.native
}
object Sheet2HTMLOpts {
  
  @scala.inline
  def apply(): Sheet2HTMLOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet2HTMLOpts]
  }
  
  @scala.inline
  implicit class Sheet2HTMLOptsOps[Self <: Sheet2HTMLOpts] (val x: Self) extends AnyVal {
    
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
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setFooter(value: String): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}

package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sheet2HTMLOpts extends StObject {
  
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
  implicit class Sheet2HTMLOptsMutableBuilder[Self <: Sheet2HTMLOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}

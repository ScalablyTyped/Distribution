package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemableDecorationAttachmentRenderOptions extends js.Object {
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var backgroundColor: js.UndefOr[String | ThemeColor] = js.native
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var border: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to text enclosed by a decoration.
    */
  var borderColor: js.UndefOr[String | ThemeColor] = js.native
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var color: js.UndefOr[String | ThemeColor] = js.native
  
  /**
    * An **absolute path** or an URI to an image to be rendered in the attachment. Either an icon
    * or a text can be shown, but not both.
    */
  var contentIconPath: js.UndefOr[String | Uri] = js.native
  
  /**
    * Defines a text content that is shown in the attachment. Either an icon or a text can be shown, but not both.
    */
  var contentText: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var fontStyle: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var fontWeight: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var margin: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var textDecoration: js.UndefOr[String] = js.native
  
  /**
    * CSS styling property that will be applied to the decoration attachment.
    */
  var width: js.UndefOr[String] = js.native
}
object ThemableDecorationAttachmentRenderOptions {
  
  @scala.inline
  def apply(): ThemableDecorationAttachmentRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemableDecorationAttachmentRenderOptions]
  }
  
  @scala.inline
  implicit class ThemableDecorationAttachmentRenderOptionsOps[Self <: ThemableDecorationAttachmentRenderOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String | ThemeColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorder(value: String): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String | ThemeColor): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setColor(value: String | ThemeColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setContentIconPath(value: String | Uri): Self = this.set("contentIconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentIconPath: Self = this.set("contentIconPath", js.undefined)
    
    @scala.inline
    def setContentText(value: String): Self = this.set("contentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentText: Self = this.set("contentText", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMargin(value: String): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}

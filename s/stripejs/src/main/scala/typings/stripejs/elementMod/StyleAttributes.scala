package typings.stripejs.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleAttributes extends js.Object {
  
  @JSName(":-webkit-autofill")
  var `Colon-webkit-autofill`: js.UndefOr[StyleAttributes] = js.native
  
  @JSName("::-ms-clear")
  var `ColonColon-ms-clear`: js.UndefOr[MSClearAttributes] = js.native
  
  @JSName("::placeholder")
  var ColonColonplaceholder: js.UndefOr[StyleAttributes] = js.native
  
  @JSName("::selection")
  var ColonColonselection: js.UndefOr[StyleAttributes] = js.native
  
  @JSName(":disabled")
  var Colondisabled: js.UndefOr[StyleAttributes] = js.native
  
  @JSName(":focus")
  var Colonfocus: js.UndefOr[StyleAttributes] = js.native
  
  @JSName(":hover")
  var Colonhover: js.UndefOr[StyleAttributes] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[String] = js.native
  
  var fontSmoothing: js.UndefOr[String] = js.native
  
  var fontStyle: js.UndefOr[String] = js.native
  
  var fontVariant: js.UndefOr[js.Any] = js.native
  
  var iconColor: js.UndefOr[String] = js.native
  
  var letterSpacing: js.UndefOr[String] = js.native
  
  var lineHeight: js.UndefOr[String] = js.native
  
  /**
    * Add padding to the element
    * NOTE: Only available for the `idealBank` Element
    */
  var padding: js.UndefOr[String] = js.native
  
  /**
    * Align text inside the element
    * NOTE: Only available for the `cardNumber`, `cardExpiry`, and `cardCvc` Elements
    */
  var textAlign: js.UndefOr[String] = js.native
  
  var textDecoration: js.UndefOr[String] = js.native
  
  var textShadow: js.UndefOr[String] = js.native
  
  var textTransform: js.UndefOr[String] = js.native
}
object StyleAttributes {
  
  @scala.inline
  def apply(): StyleAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleAttributes]
  }
  
  @scala.inline
  implicit class StyleAttributesOps[Self <: StyleAttributes] (val x: Self) extends AnyVal {
    
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
    def `setColon-webkit-autofill`(value: StyleAttributes): Self = this.set(":-webkit-autofill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteColon-webkit-autofill`: Self = this.set(":-webkit-autofill", js.undefined)
    
    @scala.inline
    def `setColonColon-ms-clear`(value: MSClearAttributes): Self = this.set("::-ms-clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteColonColon-ms-clear`: Self = this.set("::-ms-clear", js.undefined)
    
    @scala.inline
    def setColonColonplaceholder(value: StyleAttributes): Self = this.set("::placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColonColonplaceholder: Self = this.set("::placeholder", js.undefined)
    
    @scala.inline
    def setColonColonselection(value: StyleAttributes): Self = this.set("::selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColonColonselection: Self = this.set("::selection", js.undefined)
    
    @scala.inline
    def setColondisabled(value: StyleAttributes): Self = this.set(":disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColondisabled: Self = this.set(":disabled", js.undefined)
    
    @scala.inline
    def setColonfocus(value: StyleAttributes): Self = this.set(":focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColonfocus: Self = this.set(":focus", js.undefined)
    
    @scala.inline
    def setColonhover(value: StyleAttributes): Self = this.set(":hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColonhover: Self = this.set(":hover", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontSmoothing(value: String): Self = this.set("fontSmoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSmoothing: Self = this.set("fontSmoothing", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontVariant(value: js.Any): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: String): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setLineHeight(value: String): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    
    @scala.inline
    def setTextShadow(value: String): Self = this.set("textShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextShadow: Self = this.set("textShadow", js.undefined)
    
    @scala.inline
    def setTextTransform(value: String): Self = this.set("textTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextTransform: Self = this.set("textTransform", js.undefined)
  }
}

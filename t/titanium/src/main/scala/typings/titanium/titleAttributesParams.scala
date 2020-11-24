package typings.titanium

import typings.titanium.Titanium.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for the <Titanium.UI.Window.titleAttributes> property.
  */
@js.native
trait titleAttributesParams extends js.Object {
  
  /**
    * Color of the window title, as a color name or hex triplet.
    */
  var color: js.UndefOr[String | Color] = js.native
  
  /**
    * Font to use for the window title.
    */
  var font: js.UndefOr[Font] = js.native
  
  /**
    * Shadow color and offset for the window title.
    */
  var shadow: js.UndefOr[shadowDict] = js.native
}
object titleAttributesParams {
  
  @scala.inline
  def apply(): titleAttributesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[titleAttributesParams]
  }
  
  @scala.inline
  implicit class titleAttributesParamsOps[Self <: titleAttributesParams] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String | Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setShadow(value: shadowDict): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
  }
}

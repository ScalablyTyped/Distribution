package typings.titanium

import typings.titanium.Titanium.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for the <Titanium.UI.Window.titleAttributes> property.
  */
@js.native
trait titleAttributesParams extends StObject {
  
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
  implicit class titleAttributesParamsMutableBuilder[Self <: titleAttributesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String | Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setShadow(value: shadowDict): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
  }
}

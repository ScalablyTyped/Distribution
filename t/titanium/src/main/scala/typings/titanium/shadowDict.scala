package typings.titanium

import typings.titanium.Titanium.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary describing the shadow effect for text.
  */
@js.native
trait shadowDict extends StObject {
  
  /**
    * Specifies the blur radius of the shadow.
    */
  var blurRadius: js.UndefOr[Double] = js.native
  
  /**
    * Color name or hex triplet specifying the color of the shadow.
    */
  var color: js.UndefOr[String | Color] = js.native
  
  /**
    * <Size> with the properties `width` and `height` used as the horizontal
    * and vertical offset of the shadow, respectively.
    */
  var offset: js.UndefOr[Size] = js.native
}
object shadowDict {
  
  @scala.inline
  def apply(): shadowDict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[shadowDict]
  }
  
  @scala.inline
  implicit class shadowDictMutableBuilder[Self <: shadowDict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlurRadius(value: Double): Self = StObject.set(x, "blurRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurRadiusUndefined: Self = StObject.set(x, "blurRadius", js.undefined)
    
    @scala.inline
    def setColor(value: String | Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOffset(value: Size): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}

package typings.vhtml.mod.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoHTMLAttributes
  extends StObject
     with MediaHTMLAttributes {
  
  var disablepictureinpicture: js.UndefOr[Boolean] = js.undefined
  
  var disableremoteplayback: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var poster: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object VideoHTMLAttributes {
  
  inline def apply(): VideoHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoHTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoHTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setDisablepictureinpicture(value: Boolean): Self = StObject.set(x, "disablepictureinpicture", value.asInstanceOf[js.Any])
    
    inline def setDisablepictureinpictureUndefined: Self = StObject.set(x, "disablepictureinpicture", js.undefined)
    
    inline def setDisableremoteplayback(value: Boolean): Self = StObject.set(x, "disableremoteplayback", value.asInstanceOf[js.Any])
    
    inline def setDisableremoteplaybackUndefined: Self = StObject.set(x, "disableremoteplayback", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

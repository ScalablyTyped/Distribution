package typings.trimblemapsTrimblemapsJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelRatio extends StObject {
  
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  var sdf: js.UndefOr[Boolean] = js.undefined
}
object PixelRatio {
  
  inline def apply(): PixelRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PixelRatio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PixelRatio] (val x: Self) extends AnyVal {
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setSdf(value: Boolean): Self = StObject.set(x, "sdf", value.asInstanceOf[js.Any])
    
    inline def setSdfUndefined: Self = StObject.set(x, "sdf", js.undefined)
  }
}

package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrokeWidth extends StObject {
  
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object StrokeWidth {
  
  inline def apply(): StrokeWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrokeWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StrokeWidth] (val x: Self) extends AnyVal {
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}

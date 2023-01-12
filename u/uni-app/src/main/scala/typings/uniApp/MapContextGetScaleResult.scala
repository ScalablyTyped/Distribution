package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapContextGetScaleResult extends StObject {
  
  /**
    * 地图缩放级别
    */
  var scale: js.UndefOr[Double] = js.undefined
}
object MapContextGetScaleResult {
  
  inline def apply(): MapContextGetScaleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapContextGetScaleResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapContextGetScaleResult] (val x: Self) extends AnyVal {
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}

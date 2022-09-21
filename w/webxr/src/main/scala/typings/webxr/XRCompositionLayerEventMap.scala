package typings.webxr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRCompositionLayerEventMap extends StObject {
  
  var redraw: XRLayerEvent
}
object XRCompositionLayerEventMap {
  
  inline def apply(redraw: XRLayerEvent): XRCompositionLayerEventMap = {
    val __obj = js.Dynamic.literal(redraw = redraw.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRCompositionLayerEventMap]
  }
  
  extension [Self <: XRCompositionLayerEventMap](x: Self) {
    
    inline def setRedraw(value: XRLayerEvent): Self = StObject.set(x, "redraw", value.asInstanceOf[js.Any])
  }
}

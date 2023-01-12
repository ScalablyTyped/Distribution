package typings.wonderJs.distEs2015DeviceDeviceManagerMod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasMapData extends StObject {
  
  var canvas: HTMLCanvasElement
  
  var context: CanvasRenderingContext2D
}
object CanvasMapData {
  
  inline def apply(canvas: HTMLCanvasElement, context: CanvasRenderingContext2D): CanvasMapData = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasMapData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasMapData] (val x: Self) extends AnyVal {
    
    inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}

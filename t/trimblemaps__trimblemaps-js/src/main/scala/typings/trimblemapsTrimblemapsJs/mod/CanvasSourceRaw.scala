package typings.trimblemapsTrimblemapsJs.mod

import typings.std.HTMLCanvasElement
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.canvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasSourceRaw
  extends StObject
     with Source
     with CanvasSourceOptions
     with AnySourceData {
  
  @JSName("type")
  var type_CanvasSourceRaw: canvas
}
object CanvasSourceRaw {
  
  inline def apply(canvas: String | HTMLCanvasElement, coordinates: js.Array[js.Array[Double]]): CanvasSourceRaw = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("canvas")
    __obj.asInstanceOf[CanvasSourceRaw]
  }
  
  extension [Self <: CanvasSourceRaw](x: Self) {
    
    inline def setType(value: canvas): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

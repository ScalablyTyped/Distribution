package typings.tabris

import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents pixel data of a `Canvas` widget.
  */
trait ImageData extends StObject {
  
  /**
    * A one-dimensional array containing the data in RGBA order, with integer values between 0 and 255 (inclusive).
    */
  val data: Uint8ClampedArray
  
  /**
    * The actual height of the ImageData, in pixels.
    */
  val height: Double
  
  /**
    * The actual height of the ImageData, in pixels.
    */
  val width: Double
}
object ImageData {
  
  inline def apply(data: Uint8ClampedArray, height: Double, width: Double): ImageData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageData]
  }
  
  extension [Self <: ImageData](x: Self) {
    
    inline def setData(value: Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

package typings.webgl2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageBitmap extends StObject {
  
  def close(): Unit
  
  val height: Double
  
  val width: Double
}
object ImageBitmap {
  
  @scala.inline
  def apply(close: () => Unit, height: Double, width: Double): ImageBitmap = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBitmap]
  }
  
  @scala.inline
  implicit class ImageBitmapMutableBuilder[Self <: ImageBitmap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

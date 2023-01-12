package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameBuffer extends StObject {
  
  var frameBuffer: js.typedarray.ArrayBuffer
  
  var isLastFrame: Boolean
}
object FrameBuffer {
  
  inline def apply(frameBuffer: js.typedarray.ArrayBuffer, isLastFrame: Boolean): FrameBuffer = {
    val __obj = js.Dynamic.literal(frameBuffer = frameBuffer.asInstanceOf[js.Any], isLastFrame = isLastFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameBuffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameBuffer] (val x: Self) extends AnyVal {
    
    inline def setFrameBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "frameBuffer", value.asInstanceOf[js.Any])
    
    inline def setIsLastFrame(value: Boolean): Self = StObject.set(x, "isLastFrame", value.asInstanceOf[js.Any])
  }
}

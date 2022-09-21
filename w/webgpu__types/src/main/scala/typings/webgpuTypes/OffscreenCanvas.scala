package typings.webgpuTypes

import typings.webgpuTypes.webgpuTypesStrings.webgpu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffscreenCanvas extends StObject {
  
  @JSName("getContext")
  def getContext_webgpu(contextId: webgpu): GPUCanvasContext | Null
}
object OffscreenCanvas {
  
  inline def apply(getContext: webgpu => GPUCanvasContext | Null): OffscreenCanvas = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction1(getContext))
    __obj.asInstanceOf[OffscreenCanvas]
  }
  
  extension [Self <: OffscreenCanvas](x: Self) {
    
    inline def setGetContext(value: webgpu => GPUCanvasContext | Null): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
  }
}

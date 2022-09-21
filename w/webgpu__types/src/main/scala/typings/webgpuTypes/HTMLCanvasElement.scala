package typings.webgpuTypes

import typings.webgpuTypes.webgpuTypesStrings.webgpu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLCanvasElement extends StObject {
  
  @JSName("getContext")
  def getContext_webgpu(contextId: webgpu): GPUCanvasContext | Null
}
object HTMLCanvasElement {
  
  inline def apply(getContext: webgpu => GPUCanvasContext | Null): HTMLCanvasElement = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction1(getContext))
    __obj.asInstanceOf[HTMLCanvasElement]
  }
  
  extension [Self <: HTMLCanvasElement](x: Self) {
    
    inline def setGetContext(value: webgpu => GPUCanvasContext | Null): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
  }
}

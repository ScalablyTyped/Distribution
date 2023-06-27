package typings.webgpuTypes

import typings.webgpuTypes.webgpuTypesStrings.webgpu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _GPUImageCopyExternalImageSource extends StObject
object _GPUImageCopyExternalImageSource {
  
  inline def HTMLCanvasElement(getContext: webgpu => GPUCanvasContext | Null): typings.webgpuTypes.HTMLCanvasElement = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction1(getContext))
    __obj.asInstanceOf[typings.webgpuTypes.HTMLCanvasElement]
  }
  
  inline def OffscreenCanvas(getContext: webgpu => GPUCanvasContext | Null): typings.webgpuTypes.OffscreenCanvas = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction1(getContext))
    __obj.asInstanceOf[typings.webgpuTypes.OffscreenCanvas]
  }
}

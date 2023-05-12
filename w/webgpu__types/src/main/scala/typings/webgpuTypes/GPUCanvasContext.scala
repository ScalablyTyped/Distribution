package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUCanvasContext extends StObject {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUCanvasContext
  
  /**
    * The canvas this context was created from.
    */
  val canvas: HTMLCanvasElement | OffscreenCanvas
  
  /**
    * Configures the context for this canvas.
    * This clears the drawing buffer to transparent black (in [$Replace the drawing buffer$]).
    * @param configuration - Desired configuration for the context.
    */
  def configure(configuration: GPUCanvasConfiguration): Unit
  
  /**
    * Get the {@link GPUTexture} that will be composited to the document by the {@link GPUCanvasContext}
    * next.
    * Note: The same {@link GPUTexture} object will be returned by every
    * call to {@link GPUCanvasContext#getCurrentTexture} until "[$Expire the current texture$]"
    * runs, even if that {@link GPUTexture} is destroyed, failed validation, or failed to allocate.
    */
  def getCurrentTexture(): GPUTexture
  
  /**
    * Removes the context configuration. Destroys any textures produced while configured.
    */
  def unconfigure(): Unit
}
object GPUCanvasContext {
  
  inline def apply(
    canvas: HTMLCanvasElement | OffscreenCanvas,
    configure: GPUCanvasConfiguration => Unit,
    getCurrentTexture: () => GPUTexture,
    unconfigure: () => Unit
  ): GPUCanvasContext = {
    val __obj = js.Dynamic.literal(__brand = "GPUCanvasContext", canvas = canvas.asInstanceOf[js.Any], configure = js.Any.fromFunction1(configure), getCurrentTexture = js.Any.fromFunction0(getCurrentTexture), unconfigure = js.Any.fromFunction0(unconfigure))
    __obj.asInstanceOf[GPUCanvasContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUCanvasContext] (val x: Self) extends AnyVal {
    
    inline def setCanvas(value: HTMLCanvasElement | OffscreenCanvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setConfigure(value: GPUCanvasConfiguration => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
    
    inline def setGetCurrentTexture(value: () => GPUTexture): Self = StObject.set(x, "getCurrentTexture", js.Any.fromFunction0(value))
    
    inline def setUnconfigure(value: () => Unit): Self = StObject.set(x, "unconfigure", js.Any.fromFunction0(value))
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUCanvasContext): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}

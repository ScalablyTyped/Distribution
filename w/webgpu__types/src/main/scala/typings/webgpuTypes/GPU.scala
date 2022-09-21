package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPU extends StObject {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPU = js.native
  
  /**
    * Returns an optimal {@link GPUTextureFormat} for displaying 8-bit depth, standard dynamic range
    * content on this system. Must only return {@link GPUTextureFormat#"rgba8unorm"} or
    * {@link GPUTextureFormat#"bgra8unorm"}.
    * The returned value can be passed as the {@link GPUCanvasConfiguration#format} to
    * {@link GPUCanvasContext#configure} calls on a {@link GPUCanvasContext} to ensure the associated
    * canvas is able to display its contents efficiently.
    * Note: Canvases which are not displayed to the screen may or may not benefit from using this
    * format.
    */
  def getPreferredCanvasFormat(): GPUTextureFormat = js.native
  
  /**
    * Requests an adapter from the user agent.
    * The user agent chooses whether to return an adapter, and, if so,
    * chooses according to the provided options.
    * @param options - Criteria used to select the adapter.
    */
  def requestAdapter(): js.Promise[GPUAdapter | Null] = js.native
  def requestAdapter(options: GPURequestAdapterOptions): js.Promise[GPUAdapter | Null] = js.native
}

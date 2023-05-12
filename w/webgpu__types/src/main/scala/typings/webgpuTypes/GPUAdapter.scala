package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUAdapter extends StObject {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUAdapter = js.native
  
  /**
    * The set of values in `this`.{@link GPUAdapter#[[adapter]]}.{@link adapter#[[features]]}.
    */
  val features: GPUSupportedFeatures = js.native
  
  /**
    * Returns the value of {@link GPUAdapter#[[adapter]]}.{@link adapter#[[fallback]]}.
    */
  val isFallbackAdapter: Boolean = js.native
  
  /**
    * The limits in `this`.{@link GPUAdapter#[[adapter]]}.{@link adapter#[[limits]]}.
    */
  val limits: GPUSupportedLimits = js.native
  
  /**
    * Requests the {@link GPUAdapterInfo} for this {@link GPUAdapter}.
    * Note: Adapter info values are returned with a Promise to give user agents an
    * opportunity to perform potentially long-running checks when requesting unmasked values,
    * such as asking for user consent before returning. If no `unmaskHints` are specified,
    * however, no dialogs should be displayed to the user.
    * @param unmaskHints - A list of {@link GPUAdapterInfo} attribute names for which unmasked
    * 	values are desired if available.
    */
  def requestAdapterInfo(): js.Promise[GPUAdapterInfo] = js.native
  def requestAdapterInfo(unmaskHints: js.Array[String]): js.Promise[GPUAdapterInfo] = js.native
  
  /**
    * Requests a device from the adapter.
    * This is a one-time action: if a device is returned successfully,
    * the adapter becomes invalid.
    * @param descriptor - Description of the {@link GPUDevice} to request.
    */
  def requestDevice(): js.Promise[GPUDevice] = js.native
  def requestDevice(descriptor: GPUDeviceDescriptor): js.Promise[GPUDevice] = js.native
}

package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURequestAdapterOptions extends StObject {
  
  /**
    * When set to `true` indicates that only a fallback adapter may be returned. If the user
    * agent does not support a fallback adapter, will cause {@link GPU#requestAdapter} to
    * resolve to `null`.
    * Note:
    * {@link GPU#requestAdapter} may still return a fallback adapter if
    * {@link GPURequestAdapterOptions#forceFallbackAdapter} is set to `false` and either no
    * other appropriate adapter is available or the user agent chooses to return a
    * fallback adapter. Developers that wish to prevent their applications from running on
    * fallback adapters should check the {@link GPUAdapter}.{@link GPUAdapter#isFallbackAdapter}
    * attribute prior to requesting a {@link GPUDevice}.
    */
  var forceFallbackAdapter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optionally provides a hint indicating what class of adapter should be selected from
    * the system's available adapters.
    * The value of this hint may influence which adapter is chosen, but it must not
    * influence whether an adapter is returned or not.
    * Note:
    * The primary utility of this hint is to influence which GPU is used in a multi-GPU system.
    * For instance, some laptops have a low-power integrated GPU and a high-performance
    * discrete GPU. This hint may also affect the power configuration of the selected GPU to
    * match the requested power preference.
    * Note:
    * Depending on the exact hardware configuration, such as battery status and attached displays
    * or removable GPUs, the user agent may select different adapters given the same power
    * preference.
    * Typically, given the same hardware configuration and state and
    * `powerPreference`, the user agent is likely to select the same adapter.
    */
  var powerPreference: js.UndefOr[GPUPowerPreference] = js.undefined
}
object GPURequestAdapterOptions {
  
  inline def apply(): GPURequestAdapterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPURequestAdapterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPURequestAdapterOptions] (val x: Self) extends AnyVal {
    
    inline def setForceFallbackAdapter(value: Boolean): Self = StObject.set(x, "forceFallbackAdapter", value.asInstanceOf[js.Any])
    
    inline def setForceFallbackAdapterUndefined: Self = StObject.set(x, "forceFallbackAdapter", js.undefined)
    
    inline def setPowerPreference(value: GPUPowerPreference): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
    
    inline def setPowerPreferenceUndefined: Self = StObject.set(x, "powerPreference", js.undefined)
  }
}

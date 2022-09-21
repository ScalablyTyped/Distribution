package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUAdapterInfo extends StObject {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUAdapterInfo
  
  /**
    * The name of the family or class of GPUs the adapter belongs to, if available. Empty
    * string otherwise.
    */
  val architecture: String
  
  /**
    * A human readable string describing the adapter as reported by the driver, if available.
    * Empty string otherwise.
    * Note: Because no formatting is applied to {@link GPUAdapterInfo#description} attempting to parse
    * this value is not recommended. Applications which change their behavior based on the
    * {@link GPUAdapterInfo}, such as applying workarounds for known driver issues, should rely on the
    * other fields when possible.
    */
  val description: String
  
  /**
    * A vendor-specific identifier for the adapter, if available. Empty string otherwise.
    * Note: This is a value that represents the type of adapter. For example, it may be a
    * [PCI device ID](https://pcisig.com/). It does not uniquely identify a given piece of
    * hardware like a serial number.
    */
  val device: String
  
  /**
    * The name of the vendor of the adapter, if available. Empty string otherwise.
    */
  val vendor: String
}
object GPUAdapterInfo {
  
  inline def apply(architecture: String, description: String, device: String, vendor: String): GPUAdapterInfo = {
    val __obj = js.Dynamic.literal(__brand = "GPUAdapterInfo", architecture = architecture.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUAdapterInfo]
  }
  
  extension [Self <: GPUAdapterInfo](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUAdapterInfo): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}

package typings.webgpuTypes

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUDeviceDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  /**
    * The descriptor for the default {@link GPUQueue}.
    */
  var defaultQueue: js.UndefOr[GPUQueueDescriptor] = js.undefined
  
  /**
    * Specifies the features that are required by the device request.
    * The request will fail if the adapter cannot provide these features.
    * Exactly the specified set of features, and no more or less, will be allowed in validation
    * of API calls on the resulting device.
    */
  var requiredFeatures: js.UndefOr[js.Iterable[GPUFeatureName]] = js.undefined
  
  /**
    * Specifies the limits that are required by the device request.
    * The request will fail if the adapter cannot provide these limits.
    * Each key must be the name of a member of supported limits.
    * Exactly the specified limits, and no limit/better or worse,
    * will be allowed in validation of API calls on the resulting device.
    * <!-- If we ever need limit types other than GPUSize32/GPUSize64, we can change the value
    * type to `double` or `any` in the future and write out the type conversion explicitly (by
    * reference to WebIDL spec). Or change the entire type to `any` and add back a `dictionary
    * GPULimits` and define the conversion of the whole object by reference to WebIDL. -->
    */
  var requiredLimits: js.UndefOr[Record[String, GPUSize64]] = js.undefined
}
object GPUDeviceDescriptor {
  
  inline def apply(): GPUDeviceDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUDeviceDescriptor]
  }
  
  extension [Self <: GPUDeviceDescriptor](x: Self) {
    
    inline def setDefaultQueue(value: GPUQueueDescriptor): Self = StObject.set(x, "defaultQueue", value.asInstanceOf[js.Any])
    
    inline def setDefaultQueueUndefined: Self = StObject.set(x, "defaultQueue", js.undefined)
    
    inline def setRequiredFeatures(value: js.Iterable[GPUFeatureName]): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    inline def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
    
    inline def setRequiredLimits(value: Record[String, GPUSize64]): Self = StObject.set(x, "requiredLimits", value.asInstanceOf[js.Any])
    
    inline def setRequiredLimitsUndefined: Self = StObject.set(x, "requiredLimits", js.undefined)
  }
}

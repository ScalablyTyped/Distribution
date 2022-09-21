package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUStorageTextureBindingLayout extends StObject {
  
  /**
    * Indicates whether texture views bound to this binding will be bound for read-only or
    * write-only access.
    */
  var access: js.UndefOr[GPUStorageTextureAccess] = js.undefined
  
  /**
    * The required {@link GPUTextureViewDescriptor#format} of texture views bound to this binding.
    */
  var format: GPUTextureFormat
  
  /**
    * Indicates the required {@link GPUTextureViewDescriptor#dimension} for texture views bound to
    * this binding.
    */
  var viewDimension: js.UndefOr[GPUTextureViewDimension] = js.undefined
}
object GPUStorageTextureBindingLayout {
  
  inline def apply(format: GPUTextureFormat): GPUStorageTextureBindingLayout = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUStorageTextureBindingLayout]
  }
  
  extension [Self <: GPUStorageTextureBindingLayout](x: Self) {
    
    inline def setAccess(value: GPUStorageTextureAccess): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setFormat(value: GPUTextureFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setViewDimension(value: GPUTextureViewDimension): Self = StObject.set(x, "viewDimension", value.asInstanceOf[js.Any])
    
    inline def setViewDimensionUndefined: Self = StObject.set(x, "viewDimension", js.undefined)
  }
}

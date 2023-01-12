package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUDepthStencilState extends StObject {
  
  /**
    * Constant depth bias added to each fragment. See [$biased fragment depth$] for details.
    */
  var depthBias: js.UndefOr[GPUDepthBias] = js.undefined
  
  /**
    * The maximum depth bias of a fragment. See [$biased fragment depth$] for details.
    */
  var depthBiasClamp: js.UndefOr[Double] = js.undefined
  
  /**
    * Depth bias that scales with the fragment’s slope. See [$biased fragment depth$] for details.
    */
  var depthBiasSlopeScale: js.UndefOr[Double] = js.undefined
  
  /**
    * The comparison operation used to test fragment depths against
    * {@link GPURenderPassDescriptor#depthStencilAttachment} depth values.
    */
  var depthCompare: js.UndefOr[GPUCompareFunction] = js.undefined
  
  /**
    * Indicates if this {@link GPURenderPipeline} can modify
    * {@link GPURenderPassDescriptor#depthStencilAttachment} depth values.
    */
  var depthWriteEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The {@link GPUTextureViewDescriptor#format} of {@link GPURenderPassDescriptor#depthStencilAttachment}
    * this {@link GPURenderPipeline} will be compatible with.
    */
  var format: GPUTextureFormat
  
  /**
    * Defines how stencil comparisons and operations are performed for back-facing primitives.
    */
  var stencilBack: js.UndefOr[GPUStencilFaceState] = js.undefined
  
  /**
    * Defines how stencil comparisons and operations are performed for front-facing primitives.
    */
  var stencilFront: js.UndefOr[GPUStencilFaceState] = js.undefined
  
  /**
    * Bitmask controlling which {@link GPURenderPassDescriptor#depthStencilAttachment} stencil value
    * bits are read when performing stencil comparison tests.
    */
  var stencilReadMask: js.UndefOr[GPUStencilValue] = js.undefined
  
  /**
    * Bitmask controlling which {@link GPURenderPassDescriptor#depthStencilAttachment} stencil value
    * bits are written to when performing stencil operations.
    */
  var stencilWriteMask: js.UndefOr[GPUStencilValue] = js.undefined
}
object GPUDepthStencilState {
  
  inline def apply(format: GPUTextureFormat): GPUDepthStencilState = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUDepthStencilState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUDepthStencilState] (val x: Self) extends AnyVal {
    
    inline def setDepthBias(value: GPUDepthBias): Self = StObject.set(x, "depthBias", value.asInstanceOf[js.Any])
    
    inline def setDepthBiasClamp(value: Double): Self = StObject.set(x, "depthBiasClamp", value.asInstanceOf[js.Any])
    
    inline def setDepthBiasClampUndefined: Self = StObject.set(x, "depthBiasClamp", js.undefined)
    
    inline def setDepthBiasSlopeScale(value: Double): Self = StObject.set(x, "depthBiasSlopeScale", value.asInstanceOf[js.Any])
    
    inline def setDepthBiasSlopeScaleUndefined: Self = StObject.set(x, "depthBiasSlopeScale", js.undefined)
    
    inline def setDepthBiasUndefined: Self = StObject.set(x, "depthBias", js.undefined)
    
    inline def setDepthCompare(value: GPUCompareFunction): Self = StObject.set(x, "depthCompare", value.asInstanceOf[js.Any])
    
    inline def setDepthCompareUndefined: Self = StObject.set(x, "depthCompare", js.undefined)
    
    inline def setDepthWriteEnabled(value: Boolean): Self = StObject.set(x, "depthWriteEnabled", value.asInstanceOf[js.Any])
    
    inline def setDepthWriteEnabledUndefined: Self = StObject.set(x, "depthWriteEnabled", js.undefined)
    
    inline def setFormat(value: GPUTextureFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setStencilBack(value: GPUStencilFaceState): Self = StObject.set(x, "stencilBack", value.asInstanceOf[js.Any])
    
    inline def setStencilBackUndefined: Self = StObject.set(x, "stencilBack", js.undefined)
    
    inline def setStencilFront(value: GPUStencilFaceState): Self = StObject.set(x, "stencilFront", value.asInstanceOf[js.Any])
    
    inline def setStencilFrontUndefined: Self = StObject.set(x, "stencilFront", js.undefined)
    
    inline def setStencilReadMask(value: GPUStencilValue): Self = StObject.set(x, "stencilReadMask", value.asInstanceOf[js.Any])
    
    inline def setStencilReadMaskUndefined: Self = StObject.set(x, "stencilReadMask", js.undefined)
    
    inline def setStencilWriteMask(value: GPUStencilValue): Self = StObject.set(x, "stencilWriteMask", value.asInstanceOf[js.Any])
    
    inline def setStencilWriteMaskUndefined: Self = StObject.set(x, "stencilWriteMask", js.undefined)
  }
}

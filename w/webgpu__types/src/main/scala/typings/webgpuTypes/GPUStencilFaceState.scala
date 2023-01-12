package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUStencilFaceState extends StObject {
  
  /**
    * The {@link GPUCompareFunction} used when testing fragments against
    * {@link GPURenderPassDescriptor#depthStencilAttachment} stencil values.
    */
  var compare: js.UndefOr[GPUCompareFunction] = js.undefined
  
  /**
    * The {@link GPUStencilOperation} performed if the fragment depth comparison described by
    * {@link GPUDepthStencilState#depthCompare} fails.
    */
  var depthFailOp: js.UndefOr[GPUStencilOperation] = js.undefined
  
  /**
    * The {@link GPUStencilOperation} performed if the fragment stencil comparison test described by
    * {@link GPUStencilFaceState#compare} fails.
    */
  var failOp: js.UndefOr[GPUStencilOperation] = js.undefined
  
  /**
    * The {@link GPUStencilOperation} performed if the fragment stencil comparison test described by
    * {@link GPUStencilFaceState#compare} passes.
    */
  var passOp: js.UndefOr[GPUStencilOperation] = js.undefined
}
object GPUStencilFaceState {
  
  inline def apply(): GPUStencilFaceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUStencilFaceState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUStencilFaceState] (val x: Self) extends AnyVal {
    
    inline def setCompare(value: GPUCompareFunction): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    inline def setDepthFailOp(value: GPUStencilOperation): Self = StObject.set(x, "depthFailOp", value.asInstanceOf[js.Any])
    
    inline def setDepthFailOpUndefined: Self = StObject.set(x, "depthFailOp", js.undefined)
    
    inline def setFailOp(value: GPUStencilOperation): Self = StObject.set(x, "failOp", value.asInstanceOf[js.Any])
    
    inline def setFailOpUndefined: Self = StObject.set(x, "failOp", js.undefined)
    
    inline def setPassOp(value: GPUStencilOperation): Self = StObject.set(x, "passOp", value.asInstanceOf[js.Any])
    
    inline def setPassOpUndefined: Self = StObject.set(x, "passOp", js.undefined)
  }
}

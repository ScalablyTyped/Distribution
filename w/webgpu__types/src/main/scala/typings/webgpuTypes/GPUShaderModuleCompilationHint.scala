package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUShaderModuleCompilationHint extends StObject {
  
  /**
    * A {@link GPUPipelineLayout} that the {@link GPUShaderModule} may be used with in a future
    * {@link GPUDevice#createComputePipeline()} or {@link GPUDevice#createRenderPipeline} call.
    * If set to {@link GPUAutoLayoutMode#"auto"} the layout will be the [$default pipeline layout$]
    * for the entry point associated with this hint will be used.
    */
  var layout: js.UndefOr[GPUPipelineLayout | GPUAutoLayoutMode] = js.undefined
}
object GPUShaderModuleCompilationHint {
  
  inline def apply(): GPUShaderModuleCompilationHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUShaderModuleCompilationHint]
  }
  
  extension [Self <: GPUShaderModuleCompilationHint](x: Self) {
    
    inline def setLayout(value: GPUPipelineLayout | GPUAutoLayoutMode): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
  }
}

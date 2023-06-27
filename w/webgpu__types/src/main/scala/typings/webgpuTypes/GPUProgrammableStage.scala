package typings.webgpuTypes

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUProgrammableStage extends StObject {
  
  /**
    * Specifies the values of pipeline-overridable constants in the shader module
    * {@link GPUProgrammableStage#module}.
    * Each such pipeline-overridable constant is uniquely identified by a single
    * pipeline-overridable constant identifier string (representing the numeric ID of the
    * constant, if one is specified, and otherwise the constant's identifier name).
    * WGSL names (identifiers) in source maps follow the rules defined in WGSL identifier comparison.
    * The key of each key-value pair must equal the identifier string of one such constant.
    * When the pipeline is executed, that constant will have the specified value.
    * Values are specified as <dfn typedef for="">GPUPipelineConstantValue</dfn>, which is a {@link double}.
    * They are converted [$to WGSL type$] of the pipeline-overridable constant (`bool`/`i32`/`u32`/`f32`/`f16`).
    * If conversion fails, a validation error is generated.
    */
  var constants: js.UndefOr[Record[String, GPUPipelineConstantValue]] = js.undefined
  
  /**
    * The name of the function in {@link GPUProgrammableStage#module} that this stage will use to
    * perform its work.
    */
  var entryPoint: String
  
  /**
    * The {@link GPUShaderModule} containing the code that this programmable stage will execute.
    */
  var module: GPUShaderModule
}
object GPUProgrammableStage {
  
  inline def apply(entryPoint: String, module: GPUShaderModule): GPUProgrammableStage = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUProgrammableStage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUProgrammableStage] (val x: Self) extends AnyVal {
    
    inline def setConstants(value: Record[String, GPUPipelineConstantValue]): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
    
    inline def setConstantsUndefined: Self = StObject.set(x, "constants", js.undefined)
    
    inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setModule(value: GPUShaderModule): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
  }
}

package typings.webgpuTypes

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUShaderModuleDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  /**
    * The <a href="https://gpuweb.github.io/gpuweb/wgsl/">WGSL</a> source code for the shader
    * module.
    */
  var code: String
  
  /**
    * If defined maps an entry point name from the shader to a {@link GPUShaderModuleCompilationHint}.
    * No validation is performed with any of these {@link GPUShaderModuleCompilationHint}.
    * Implementations should use any information present in the {@link GPUShaderModuleCompilationHint}
    * to perform as much compilation as is possible within {@link GPUDevice#createShaderModule}.
    * Entry point names follow the rules defined in WGSL identifier comparison.
    * Note: Supplying information in {@link GPUShaderModuleDescriptor#hints} does not have any
    * observable effect, other than performance. Because a single shader module can hold
    * multiple entry points, and multiple pipelines can be created from a single shader
    * module, it can be more performant for an implementation to do as much compilation as
    * possible once in {@link GPUDevice#createShaderModule} rather than multiple times in
    * the multiple calls to {@link GPUDevice#createComputePipeline} /
    * {@link GPUDevice#createRenderPipeline}.
    */
  var hints: js.UndefOr[Record[String, GPUShaderModuleCompilationHint]] = js.undefined
  
  /**
    * If defined MAY be interpreted as a source-map-v3 format.
    * Source maps are optional, but serve as a standardized way to support dev-tool
    * integration such as source-language debugging [[SourceMap]].
    * WGSL names (identifiers) in source maps follow the rules defined in WGSL identifier
    * comparison.
    */
  var sourceMap: js.UndefOr[js.Object] = js.undefined
}
object GPUShaderModuleDescriptor {
  
  inline def apply(code: String): GPUShaderModuleDescriptor = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUShaderModuleDescriptor]
  }
  
  extension [Self <: GPUShaderModuleDescriptor](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setHints(value: Record[String, GPUShaderModuleCompilationHint]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    
    inline def setSourceMap(value: js.Object): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
  }
}

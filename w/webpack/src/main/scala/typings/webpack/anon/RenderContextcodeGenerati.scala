package typings.webpack.anon

import typings.webpack.mod.DependencyTemplates
import typings.webpack.mod.ModuleGraph
import typings.webpack.mod.RuntimeTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined webpack.webpack.RenderContext & {  codeGenerationResults :webpack.webpack.CodeGenerationResults | undefined} */
trait RenderContextcodeGenerati extends StObject {
  
  /**
  	 * the chunk
  	 */
  var chunk: typings.webpack.mod.Chunk
  
  /**
  	 * the chunk graph
  	 */
  var chunkGraph: typings.webpack.mod.ChunkGraph
  
  /**
  	 * results of code generation
  	 */
  var codeGenerationResults: typings.webpack.mod.CodeGenerationResults & js.UndefOr[typings.webpack.mod.CodeGenerationResults]
  
  /**
  	 * the dependency templates
  	 */
  var dependencyTemplates: DependencyTemplates
  
  /**
  	 * the module graph
  	 */
  var moduleGraph: ModuleGraph
  
  /**
  	 * the runtime template
  	 */
  var runtimeTemplate: RuntimeTemplate
  
  /**
  	 * rendering in strict context
  	 */
  var strictMode: Boolean
}
object RenderContextcodeGenerati {
  
  inline def apply(
    chunk: typings.webpack.mod.Chunk,
    chunkGraph: typings.webpack.mod.ChunkGraph,
    codeGenerationResults: typings.webpack.mod.CodeGenerationResults & js.UndefOr[typings.webpack.mod.CodeGenerationResults],
    dependencyTemplates: DependencyTemplates,
    moduleGraph: ModuleGraph,
    runtimeTemplate: RuntimeTemplate,
    strictMode: Boolean
  ): RenderContextcodeGenerati = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], chunkGraph = chunkGraph.asInstanceOf[js.Any], codeGenerationResults = codeGenerationResults.asInstanceOf[js.Any], dependencyTemplates = dependencyTemplates.asInstanceOf[js.Any], moduleGraph = moduleGraph.asInstanceOf[js.Any], runtimeTemplate = runtimeTemplate.asInstanceOf[js.Any], strictMode = strictMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContextcodeGenerati]
  }
  
  extension [Self <: RenderContextcodeGenerati](x: Self) {
    
    inline def setChunk(value: typings.webpack.mod.Chunk): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setChunkGraph(value: typings.webpack.mod.ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setCodeGenerationResults(
      value: typings.webpack.mod.CodeGenerationResults & js.UndefOr[typings.webpack.mod.CodeGenerationResults]
    ): Self = StObject.set(x, "codeGenerationResults", value.asInstanceOf[js.Any])
    
    inline def setDependencyTemplates(value: DependencyTemplates): Self = StObject.set(x, "dependencyTemplates", value.asInstanceOf[js.Any])
    
    inline def setModuleGraph(value: ModuleGraph): Self = StObject.set(x, "moduleGraph", value.asInstanceOf[js.Any])
    
    inline def setRuntimeTemplate(value: RuntimeTemplate): Self = StObject.set(x, "runtimeTemplate", value.asInstanceOf[js.Any])
    
    inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
  }
}

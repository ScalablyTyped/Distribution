package typings.webpack.mod

import typings.webpack.anon.Javascript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderManifestOptions extends StObject {
  
  /**
  	 * the chunk used to render
  	 */
  var chunk: Chunk
  
  var chunkGraph: ChunkGraph
  
  var codeGenerationResults: CodeGenerationResults
  
  var dependencyTemplates: DependencyTemplates
  
  var fullHash: String
  
  var hash: String
  
  var moduleGraph: ModuleGraph
  
  var moduleTemplates: Javascript
  
  var outputOptions: Output
  
  var runtimeTemplate: RuntimeTemplate
}
object RenderManifestOptions {
  
  inline def apply(
    chunk: Chunk,
    chunkGraph: ChunkGraph,
    codeGenerationResults: CodeGenerationResults,
    dependencyTemplates: DependencyTemplates,
    fullHash: String,
    hash: String,
    moduleGraph: ModuleGraph,
    moduleTemplates: Javascript,
    outputOptions: Output,
    runtimeTemplate: RuntimeTemplate
  ): RenderManifestOptions = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], chunkGraph = chunkGraph.asInstanceOf[js.Any], codeGenerationResults = codeGenerationResults.asInstanceOf[js.Any], dependencyTemplates = dependencyTemplates.asInstanceOf[js.Any], fullHash = fullHash.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], moduleGraph = moduleGraph.asInstanceOf[js.Any], moduleTemplates = moduleTemplates.asInstanceOf[js.Any], outputOptions = outputOptions.asInstanceOf[js.Any], runtimeTemplate = runtimeTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderManifestOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderManifestOptions] (val x: Self) extends AnyVal {
    
    inline def setChunk(value: Chunk): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setCodeGenerationResults(value: CodeGenerationResults): Self = StObject.set(x, "codeGenerationResults", value.asInstanceOf[js.Any])
    
    inline def setDependencyTemplates(value: DependencyTemplates): Self = StObject.set(x, "dependencyTemplates", value.asInstanceOf[js.Any])
    
    inline def setFullHash(value: String): Self = StObject.set(x, "fullHash", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setModuleGraph(value: ModuleGraph): Self = StObject.set(x, "moduleGraph", value.asInstanceOf[js.Any])
    
    inline def setModuleTemplates(value: Javascript): Self = StObject.set(x, "moduleTemplates", value.asInstanceOf[js.Any])
    
    inline def setOutputOptions(value: Output): Self = StObject.set(x, "outputOptions", value.asInstanceOf[js.Any])
    
    inline def setRuntimeTemplate(value: RuntimeTemplate): Self = StObject.set(x, "runtimeTemplate", value.asInstanceOf[js.Any])
  }
}

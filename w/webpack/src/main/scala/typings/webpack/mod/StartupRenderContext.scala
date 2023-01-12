package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartupRenderContext
  extends StObject
     with RenderContext {
  
  var inlined: Boolean
}
object StartupRenderContext {
  
  inline def apply(
    chunk: Chunk,
    chunkGraph: ChunkGraph,
    codeGenerationResults: CodeGenerationResults,
    dependencyTemplates: DependencyTemplates,
    inlined: Boolean,
    moduleGraph: ModuleGraph,
    runtimeTemplate: RuntimeTemplate,
    strictMode: Boolean
  ): StartupRenderContext = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], chunkGraph = chunkGraph.asInstanceOf[js.Any], codeGenerationResults = codeGenerationResults.asInstanceOf[js.Any], dependencyTemplates = dependencyTemplates.asInstanceOf[js.Any], inlined = inlined.asInstanceOf[js.Any], moduleGraph = moduleGraph.asInstanceOf[js.Any], runtimeTemplate = runtimeTemplate.asInstanceOf[js.Any], strictMode = strictMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartupRenderContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartupRenderContext] (val x: Self) extends AnyVal {
    
    inline def setInlined(value: Boolean): Self = StObject.set(x, "inlined", value.asInstanceOf[js.Any])
  }
}

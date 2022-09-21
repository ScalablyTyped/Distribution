package typings.webpack.mod

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownStatsFactoryContext extends StObject {
  
  var cachedGetErrors: js.UndefOr[js.Function1[/* arg0 */ Compilation, js.Array[WebpackError]]] = js.undefined
  
  var cachedGetWarnings: js.UndefOr[js.Function1[/* arg0 */ Compilation, js.Array[WebpackError]]] = js.undefined
  
  var compilation: js.UndefOr[Compilation] = js.undefined
  
  var compilationAuxiliaryFileToChunks: js.UndefOr[Map[String, js.Array[Chunk]]] = js.undefined
  
  var compilationFileToChunks: js.UndefOr[Map[String, js.Array[Chunk]]] = js.undefined
  
  var makePathsRelative: js.UndefOr[js.Function1[/* arg0 */ String, String]] = js.undefined
  
  var rootModules: js.UndefOr[Set[Module]] = js.undefined
  
  var runtime: js.UndefOr[RuntimeSpec] = js.undefined
  
  var `type`: String
}
object KnownStatsFactoryContext {
  
  inline def apply(`type`: String): KnownStatsFactoryContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownStatsFactoryContext]
  }
  
  extension [Self <: KnownStatsFactoryContext](x: Self) {
    
    inline def setCachedGetErrors(value: /* arg0 */ Compilation => js.Array[WebpackError]): Self = StObject.set(x, "cachedGetErrors", js.Any.fromFunction1(value))
    
    inline def setCachedGetErrorsUndefined: Self = StObject.set(x, "cachedGetErrors", js.undefined)
    
    inline def setCachedGetWarnings(value: /* arg0 */ Compilation => js.Array[WebpackError]): Self = StObject.set(x, "cachedGetWarnings", js.Any.fromFunction1(value))
    
    inline def setCachedGetWarningsUndefined: Self = StObject.set(x, "cachedGetWarnings", js.undefined)
    
    inline def setCompilation(value: Compilation): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
    
    inline def setCompilationAuxiliaryFileToChunks(value: Map[String, js.Array[Chunk]]): Self = StObject.set(x, "compilationAuxiliaryFileToChunks", value.asInstanceOf[js.Any])
    
    inline def setCompilationAuxiliaryFileToChunksUndefined: Self = StObject.set(x, "compilationAuxiliaryFileToChunks", js.undefined)
    
    inline def setCompilationFileToChunks(value: Map[String, js.Array[Chunk]]): Self = StObject.set(x, "compilationFileToChunks", value.asInstanceOf[js.Any])
    
    inline def setCompilationFileToChunksUndefined: Self = StObject.set(x, "compilationFileToChunks", js.undefined)
    
    inline def setCompilationUndefined: Self = StObject.set(x, "compilation", js.undefined)
    
    inline def setMakePathsRelative(value: /* arg0 */ String => String): Self = StObject.set(x, "makePathsRelative", js.Any.fromFunction1(value))
    
    inline def setMakePathsRelativeUndefined: Self = StObject.set(x, "makePathsRelative", js.undefined)
    
    inline def setRootModules(value: Set[Module]): Self = StObject.set(x, "rootModules", value.asInstanceOf[js.Any])
    
    inline def setRootModulesUndefined: Self = StObject.set(x, "rootModules", js.undefined)
    
    inline def setRuntime(value: RuntimeSpec): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

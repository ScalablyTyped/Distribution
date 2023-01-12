package typings.webpack.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownStatsChunk extends StObject {
  
  var auxiliaryFiles: js.UndefOr[js.Array[String]] = js.undefined
  
  var children: js.UndefOr[js.Array[String | Double]] = js.undefined
  
  var childrenByOrder: js.UndefOr[Record[String, js.Array[String | Double]]] = js.undefined
  
  var entry: Boolean
  
  var files: js.UndefOr[js.Array[String]] = js.undefined
  
  var filteredModules: js.UndefOr[Double] = js.undefined
  
  var hash: String
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var idHints: js.UndefOr[js.Array[String]] = js.undefined
  
  var initial: Boolean
  
  var modules: js.UndefOr[js.Array[StatsModule]] = js.undefined
  
  var names: js.UndefOr[js.Array[String]] = js.undefined
  
  var origins: js.UndefOr[js.Array[StatsChunkOrigin]] = js.undefined
  
  var parents: js.UndefOr[js.Array[String | Double]] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
  
  var recorded: Boolean
  
  var rendered: Boolean
  
  var runtime: js.UndefOr[js.Array[String]] = js.undefined
  
  var siblings: js.UndefOr[js.Array[String | Double]] = js.undefined
  
  var size: Double
  
  var sizes: js.UndefOr[Record[String, Double]] = js.undefined
}
object KnownStatsChunk {
  
  inline def apply(entry: Boolean, hash: String, initial: Boolean, recorded: Boolean, rendered: Boolean, size: Double): KnownStatsChunk = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], recorded = recorded.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownStatsChunk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnownStatsChunk] (val x: Self) extends AnyVal {
    
    inline def setAuxiliaryFiles(value: js.Array[String]): Self = StObject.set(x, "auxiliaryFiles", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryFilesUndefined: Self = StObject.set(x, "auxiliaryFiles", js.undefined)
    
    inline def setAuxiliaryFilesVarargs(value: String*): Self = StObject.set(x, "auxiliaryFiles", js.Array(value*))
    
    inline def setChildren(value: js.Array[String | Double]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenByOrder(value: Record[String, js.Array[String | Double]]): Self = StObject.set(x, "childrenByOrder", value.asInstanceOf[js.Any])
    
    inline def setChildrenByOrderUndefined: Self = StObject.set(x, "childrenByOrder", js.undefined)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (String | Double)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setEntry(value: Boolean): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setFilteredModules(value: Double): Self = StObject.set(x, "filteredModules", value.asInstanceOf[js.Any])
    
    inline def setFilteredModulesUndefined: Self = StObject.set(x, "filteredModules", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdHints(value: js.Array[String]): Self = StObject.set(x, "idHints", value.asInstanceOf[js.Any])
    
    inline def setIdHintsUndefined: Self = StObject.set(x, "idHints", js.undefined)
    
    inline def setIdHintsVarargs(value: String*): Self = StObject.set(x, "idHints", js.Array(value*))
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setModules(value: js.Array[StatsModule]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setModulesVarargs(value: StatsModule*): Self = StObject.set(x, "modules", js.Array(value*))
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setOrigins(value: js.Array[StatsChunkOrigin]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
    
    inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
    
    inline def setOriginsVarargs(value: StatsChunkOrigin*): Self = StObject.set(x, "origins", js.Array(value*))
    
    inline def setParents(value: js.Array[String | Double]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    inline def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
    
    inline def setParentsVarargs(value: (String | Double)*): Self = StObject.set(x, "parents", js.Array(value*))
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRecorded(value: Boolean): Self = StObject.set(x, "recorded", value.asInstanceOf[js.Any])
    
    inline def setRendered(value: Boolean): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: js.Array[String]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setRuntimeVarargs(value: String*): Self = StObject.set(x, "runtime", js.Array(value*))
    
    inline def setSiblings(value: js.Array[String | Double]): Self = StObject.set(x, "siblings", value.asInstanceOf[js.Any])
    
    inline def setSiblingsUndefined: Self = StObject.set(x, "siblings", js.undefined)
    
    inline def setSiblingsVarargs(value: (String | Double)*): Self = StObject.set(x, "siblings", js.Array(value*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizes(value: Record[String, Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
  }
}

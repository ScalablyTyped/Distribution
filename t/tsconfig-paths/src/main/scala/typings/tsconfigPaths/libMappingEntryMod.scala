package typings.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMappingEntryMod {
  
  @JSImport("tsconfig-paths/lib/mapping-entry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAbsoluteMappingEntries(absoluteBaseUrl: String, paths: Paths, addMatchAll: Boolean): js.Array[MappingEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAbsoluteMappingEntries")(absoluteBaseUrl.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], addMatchAll.asInstanceOf[js.Any])).asInstanceOf[js.Array[MappingEntry]]
  
  trait MappingEntry extends StObject {
    
    val paths: js.Array[String]
    
    val pattern: String
  }
  object MappingEntry {
    
    inline def apply(paths: js.Array[String], pattern: String): MappingEntry = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[MappingEntry]
    }
    
    extension [Self <: MappingEntry](x: Self) {
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  type Paths = StringDictionary[js.Array[String]]
}

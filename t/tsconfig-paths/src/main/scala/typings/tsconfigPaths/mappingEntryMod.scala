package typings.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mappingEntryMod {
  
  @JSImport("tsconfig-paths/lib/mapping-entry", "getAbsoluteMappingEntries")
  @js.native
  def getAbsoluteMappingEntries(absoluteBaseUrl: String, paths: Paths, addMatchAll: Boolean): js.Array[MappingEntry] = js.native
  
  @js.native
  trait MappingEntry extends StObject {
    
    val paths: js.Array[String] = js.native
    
    val pattern: String = js.native
  }
  object MappingEntry {
    
    @scala.inline
    def apply(paths: js.Array[String], pattern: String): MappingEntry = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[MappingEntry]
    }
    
    @scala.inline
    implicit class MappingEntryMutableBuilder[Self <: MappingEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  type Paths = StringDictionary[js.Array[String]]
}

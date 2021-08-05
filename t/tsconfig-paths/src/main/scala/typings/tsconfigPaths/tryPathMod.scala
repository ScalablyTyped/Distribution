package typings.tsconfigPaths

import typings.tsconfigPaths.mappingEntryMod.MappingEntry
import typings.tsconfigPaths.tsconfigPathsStrings._package
import typings.tsconfigPaths.tsconfigPathsStrings.`extension`
import typings.tsconfigPaths.tsconfigPathsStrings.file
import typings.tsconfigPaths.tsconfigPathsStrings.index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tryPathMod {
  
  @JSImport("tsconfig-paths/lib/try-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exhaustiveTypeException(check: scala.Nothing): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("exhaustiveTypeException")(check.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def getPathsToTry(
    extensions: js.Array[String],
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String
  ): js.UndefOr[js.Array[TryPath]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathsToTry")(extensions.asInstanceOf[js.Any], absolutePathMappings.asInstanceOf[js.Any], requestedModule.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[TryPath]]]
  
  inline def getStrippedPath(tryPath: TryPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStrippedPath")(tryPath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait TryPath extends StObject {
    
    val path: String
    
    val `type`: file | `extension` | index | _package
  }
  object TryPath {
    
    inline def apply(path: String, `type`: file | `extension` | index | _package): TryPath = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TryPath]
    }
    
    extension [Self <: TryPath](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: file | `extension` | index | _package): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

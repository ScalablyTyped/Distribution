package typings.tsconfigPaths

import typings.tsconfigPaths.mappingEntryMod.MappingEntry
import typings.tsconfigPaths.tsconfigPathsStrings._package
import typings.tsconfigPaths.tsconfigPathsStrings.extension
import typings.tsconfigPaths.tsconfigPathsStrings.file
import typings.tsconfigPaths.tsconfigPathsStrings.index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tryPathMod {
  
  @JSImport("tsconfig-paths/lib/try-path", "exhaustiveTypeException")
  @js.native
  def exhaustiveTypeException(check: scala.Nothing): scala.Nothing = js.native
  
  @JSImport("tsconfig-paths/lib/try-path", "getPathsToTry")
  @js.native
  def getPathsToTry(
    extensions: js.Array[String],
    absolutePathMappings: js.Array[MappingEntry],
    requestedModule: String
  ): js.UndefOr[js.Array[TryPath]] = js.native
  
  @JSImport("tsconfig-paths/lib/try-path", "getStrippedPath")
  @js.native
  def getStrippedPath(tryPath: TryPath): String = js.native
  
  @js.native
  trait TryPath extends StObject {
    
    val path: String = js.native
    
    val `type`: file | extension | index | _package = js.native
  }
  object TryPath {
    
    @scala.inline
    def apply(path: String, `type`: file | extension | index | _package): TryPath = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TryPath]
    }
    
    @scala.inline
    implicit class TryPathMutableBuilder[Self <: TryPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: file | extension | index | _package): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

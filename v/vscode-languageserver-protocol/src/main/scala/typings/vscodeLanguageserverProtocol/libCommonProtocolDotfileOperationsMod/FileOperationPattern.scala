package typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pattern to describe in which file operation requests or notifications
  * the server is interested in receiving.
  *
  * @since 3.16.0
  */
trait FileOperationPattern extends StObject {
  
  /**
    * The glob pattern to match. Glob patterns can have the following syntax:
    * - `*` to match one or more characters in a path segment
    * - `?` to match on one character in a path segment
    * - `**` to match any number of path segments, including none
    * - `{}` to group sub patterns into an OR expression. (e.g. `**​/ *.{ts,js}` matches all TypeScript and JavaScript files)
    * - `[]` to declare a range of characters to match in a path segment (e.g., `example.[0-9]` to match on `example.0`, `example.1`, …)
    * - `[!...]` to negate a range of characters to match in a path segment (e.g., `example.[!0-9]` to match on `example.a`, `example.b`, but not `example.0`)
    */
  var glob: String
  
  /**
    * Whether to match files or folders with this pattern.
    *
    * Matches both if undefined.
    */
  var matches: js.UndefOr[FileOperationPatternKind] = js.undefined
  
  /**
    * Additional options used during matching.
    */
  var options: js.UndefOr[FileOperationPatternOptions] = js.undefined
}
object FileOperationPattern {
  
  inline def apply(glob: String): FileOperationPattern = {
    val __obj = js.Dynamic.literal(glob = glob.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOperationPattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileOperationPattern] (val x: Self) extends AnyVal {
    
    inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
    
    inline def setMatches(value: FileOperationPatternKind): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setOptions(value: FileOperationPatternOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}

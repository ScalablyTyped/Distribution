package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MonikerKind {
  
  /**
    * The moniker represents a symbol that is exported from a project
    */
  @JSImport("vscode-languageserver", "MonikerKind.$export")
  @js.native
  val `export`: /* "export" */ String = js.native
  
  /**
    * The moniker represent a symbol that is imported into a project
    */
  @JSImport("vscode-languageserver", "MonikerKind.$import")
  @js.native
  val `import`: /* "import" */ String = js.native
  
  /**
    * The moniker represents a symbol that is local to a project (e.g. a local
    * variable of a function, a class not visible outside the project, ...)
    */
  @JSImport("vscode-languageserver", "MonikerKind.local")
  @js.native
  val local: /* "local" */ String = js.native
}

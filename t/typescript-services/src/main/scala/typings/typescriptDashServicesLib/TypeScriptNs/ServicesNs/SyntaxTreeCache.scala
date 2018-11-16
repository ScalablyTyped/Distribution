package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.SyntaxTreeCache")
@js.native
class SyntaxTreeCache protected () extends js.Object {
  def this(_host: ILanguageServiceHost) = this()
  var _currentFileName: js.Any = js.native
  var _currentFileScriptSnapshot: js.Any = js.native
  var _currentFileSyntaxTree: js.Any = js.native
  var _currentFileVersion: js.Any = js.native
  var _host: js.Any = js.native
  var _hostCache: js.Any = js.native
  /* private */ def createSyntaxTree(fileName: js.Any, scriptSnapshot: js.Any): js.Any = js.native
  /* private */ def ensureInvariants(
    fileName: js.Any,
    editRange: js.Any,
    incrementalTree: js.Any,
    oldScriptSnapshot: js.Any,
    newScriptSnapshot: js.Any
  ): js.Any = js.native
  def getCurrentFileSyntaxTree(fileName: java.lang.String): typescriptDashServicesLib.TypeScriptNs.SyntaxTree = js.native
  /* private */ def updateSyntaxTree(fileName: js.Any, scriptSnapshot: js.Any, previousSyntaxTree: js.Any, previousFileVersion: js.Any): js.Any = js.native
}


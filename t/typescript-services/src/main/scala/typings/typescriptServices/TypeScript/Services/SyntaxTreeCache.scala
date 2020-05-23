package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.SyntaxTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntaxTreeCache extends js.Object {
  var _currentFileName: js.Any
  var _currentFileScriptSnapshot: js.Any
  var _currentFileSyntaxTree: js.Any
  var _currentFileVersion: js.Any
  var _host: js.Any
  var _hostCache: js.Any
  /* private */ def createSyntaxTree(fileName: js.Any, scriptSnapshot: js.Any): js.Any
  /* private */ def ensureInvariants(
    fileName: js.Any,
    editRange: js.Any,
    incrementalTree: js.Any,
    oldScriptSnapshot: js.Any,
    newScriptSnapshot: js.Any
  ): js.Any
  def getCurrentFileSyntaxTree(fileName: String): SyntaxTree
  /* private */ def updateSyntaxTree(fileName: js.Any, scriptSnapshot: js.Any, previousSyntaxTree: js.Any, previousFileVersion: js.Any): js.Any
}

object SyntaxTreeCache {
  @scala.inline
  def apply(
    _currentFileName: js.Any,
    _currentFileScriptSnapshot: js.Any,
    _currentFileSyntaxTree: js.Any,
    _currentFileVersion: js.Any,
    _host: js.Any,
    _hostCache: js.Any,
    createSyntaxTree: (js.Any, js.Any) => js.Any,
    ensureInvariants: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    getCurrentFileSyntaxTree: String => SyntaxTree,
    updateSyntaxTree: (js.Any, js.Any, js.Any, js.Any) => js.Any
  ): SyntaxTreeCache = {
    val __obj = js.Dynamic.literal(_currentFileName = _currentFileName.asInstanceOf[js.Any], _currentFileScriptSnapshot = _currentFileScriptSnapshot.asInstanceOf[js.Any], _currentFileSyntaxTree = _currentFileSyntaxTree.asInstanceOf[js.Any], _currentFileVersion = _currentFileVersion.asInstanceOf[js.Any], _host = _host.asInstanceOf[js.Any], _hostCache = _hostCache.asInstanceOf[js.Any], createSyntaxTree = js.Any.fromFunction2(createSyntaxTree), ensureInvariants = js.Any.fromFunction5(ensureInvariants), getCurrentFileSyntaxTree = js.Any.fromFunction1(getCurrentFileSyntaxTree), updateSyntaxTree = js.Any.fromFunction4(updateSyntaxTree))
    __obj.asInstanceOf[SyntaxTreeCache]
  }
}


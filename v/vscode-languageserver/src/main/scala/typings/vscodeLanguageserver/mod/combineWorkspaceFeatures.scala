package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "combineWorkspaceFeatures")
@js.native
object combineWorkspaceFeatures extends js.Object {
  
  def apply[O, T](one: WorkspaceFeature[O], two: WorkspaceFeature[T]): WorkspaceFeature[O with T] = js.native
}

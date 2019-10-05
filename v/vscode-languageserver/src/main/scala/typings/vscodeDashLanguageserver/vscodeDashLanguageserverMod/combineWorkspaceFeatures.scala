package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "combineWorkspaceFeatures")
@js.native
object combineWorkspaceFeatures extends js.Object {
  def apply[O, T](one: WorkspaceFeature[O], two: WorkspaceFeature[T]): WorkspaceFeature[O with T] = js.native
}


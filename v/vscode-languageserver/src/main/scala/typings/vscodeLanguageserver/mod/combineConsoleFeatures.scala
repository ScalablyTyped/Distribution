package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "combineConsoleFeatures")
@js.native
object combineConsoleFeatures extends js.Object {
  
  def apply[O, T](one: ConsoleFeature[O], two: ConsoleFeature[T]): ConsoleFeature[O with T] = js.native
}

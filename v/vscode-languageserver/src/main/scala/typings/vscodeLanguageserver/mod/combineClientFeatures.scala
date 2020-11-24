package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "combineClientFeatures")
@js.native
object combineClientFeatures extends js.Object {
  
  def apply[O, T](one: ClientFeature[O], two: ClientFeature[T]): ClientFeature[O with T] = js.native
}

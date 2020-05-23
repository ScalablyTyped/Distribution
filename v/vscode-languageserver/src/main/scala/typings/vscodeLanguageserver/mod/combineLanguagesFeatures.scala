package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "combineLanguagesFeatures")
@js.native
object combineLanguagesFeatures extends js.Object {
  def apply[O, T](one: LanguagesFeature[O], two: LanguagesFeature[T]): LanguagesFeature[O with T] = js.native
}


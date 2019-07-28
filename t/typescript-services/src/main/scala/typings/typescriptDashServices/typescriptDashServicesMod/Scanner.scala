package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISimpleText
import typings.typescriptDashServices.TypeScriptNs.ISyntaxTriviaList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Scanner")
@js.native
class Scanner protected ()
  extends typings.typescriptDashServices.TypeScriptNs.Scanner {
  def this(
    fileName: String,
    text: ISimpleText,
    languageVersion: typings.typescriptDashServices.TypeScriptNs.LanguageVersion
  ) = this()
  def this(
    fileName: String,
    text: ISimpleText,
    languageVersion: typings.typescriptDashServices.TypeScriptNs.LanguageVersion,
    window: js.Array[Double]
  ) = this()
}

/* static members */
@JSImport("typescript-services", "Scanner")
@js.native
object Scanner extends js.Object {
  var triviaWindow: js.Any = js.native
  def isValidIdentifier(text: ISimpleText, languageVersion: typings.typescriptDashServices.TypeScriptNs.LanguageVersion): Boolean = js.native
  def scanTrivia(text: ISimpleText, start: Double, length: Double, isTrailing: Boolean): ISyntaxTriviaList = js.native
}


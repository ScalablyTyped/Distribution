package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISimpleText
import typings.typescriptServices.TypeScript.ISyntaxTriviaList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Scanner")
@js.native
class Scanner protected ()
  extends typings.typescriptServices.TypeScript.Scanner {
  def this(
    fileName: String,
    text: ISimpleText,
    languageVersion: typings.typescriptServices.TypeScript.LanguageVersion
  ) = this()
  def this(
    fileName: String,
    text: ISimpleText,
    languageVersion: typings.typescriptServices.TypeScript.LanguageVersion,
    window: js.Array[Double]
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.Scanner")
@js.native
object Scanner extends js.Object {
  var triviaWindow: js.Any = js.native
  def isValidIdentifier(text: ISimpleText, languageVersion: typings.typescriptServices.TypeScript.LanguageVersion): Boolean = js.native
  def scanTrivia(text: ISimpleText, start: Double, length: Double, isTrailing: Boolean): ISyntaxTriviaList = js.native
}


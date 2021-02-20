package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISimpleText
import typings.typescriptServices.TypeScript.ISyntaxTriviaList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object Scanner {
  
  @JSGlobal("TypeScript.Scanner")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.Scanner.isValidIdentifier")
  @js.native
  def isValidIdentifier(text: ISimpleText, languageVersion: typings.typescriptServices.TypeScript.LanguageVersion): Boolean = js.native
  
  /* static member */
  @JSGlobal("TypeScript.Scanner.scanTrivia")
  @js.native
  def scanTrivia(text: ISimpleText, start: Double, length: Double, isTrailing: Boolean): ISyntaxTriviaList = js.native
  
  /* static member */
  @JSGlobal("TypeScript.Scanner.triviaWindow")
  @js.native
  def triviaWindow: js.Any = js.native
  @scala.inline
  def triviaWindow_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triviaWindow")(x.asInstanceOf[js.Any])
}

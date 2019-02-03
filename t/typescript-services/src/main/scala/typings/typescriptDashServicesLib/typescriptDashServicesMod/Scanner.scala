package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Scanner")
@js.native
class Scanner protected ()
  extends typescriptDashServicesLib.TypeScriptNs.Scanner {
  def this(fileName: java.lang.String, text: typescriptDashServicesLib.TypeScriptNs.ISimpleText, languageVersion: typescriptDashServicesLib.TypeScriptNs.LanguageVersion) = this()
  def this(fileName: java.lang.String, text: typescriptDashServicesLib.TypeScriptNs.ISimpleText, languageVersion: typescriptDashServicesLib.TypeScriptNs.LanguageVersion, window: js.Array[scala.Double]) = this()
}

/* static members */
@JSImport("typescript-services", "Scanner")
@js.native
object Scanner extends js.Object {
  var triviaWindow: js.Any = js.native
  def isValidIdentifier(
    text: typescriptDashServicesLib.TypeScriptNs.ISimpleText,
    languageVersion: typescriptDashServicesLib.TypeScriptNs.LanguageVersion
  ): scala.Boolean = js.native
  def scanTrivia(
    text: typescriptDashServicesLib.TypeScriptNs.ISimpleText,
    start: scala.Double,
    length: scala.Double,
    isTrailing: scala.Boolean
  ): typescriptDashServicesLib.TypeScriptNs.ISyntaxTriviaList = js.native
}


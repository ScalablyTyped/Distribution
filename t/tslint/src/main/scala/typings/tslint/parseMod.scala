package typings.tslint

import typings.tslint.lintErrorMod.LintError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/verify/parse", JSImport.Namespace)
@js.native
object parseMod extends js.Object {
  
  def createMarkupFromErrors(fileName: String, code: String, lintErrors: js.Array[LintError]): String = js.native
  
  def getNormalizedTypescriptVersion(): String = js.native
  
  def getTypescriptVersionRequirement(text: String): js.UndefOr[String] = js.native
  
  def parseErrorsFromMarkup(text: String): js.Array[LintError] = js.native
  
  def preprocessDirectives(text: String): String = js.native
  
  def removeErrorMarkup(text: String): String = js.native
}

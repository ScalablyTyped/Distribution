package typings.tslint

import typings.tslint.lintErrorMod.LintError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("tslint/lib/verify/parse", "createMarkupFromErrors")
  @js.native
  def createMarkupFromErrors(fileName: String, code: String, lintErrors: js.Array[LintError]): String = js.native
  
  @JSImport("tslint/lib/verify/parse", "getNormalizedTypescriptVersion")
  @js.native
  def getNormalizedTypescriptVersion(): String = js.native
  
  @JSImport("tslint/lib/verify/parse", "getTypescriptVersionRequirement")
  @js.native
  def getTypescriptVersionRequirement(text: String): js.UndefOr[String] = js.native
  
  @JSImport("tslint/lib/verify/parse", "parseErrorsFromMarkup")
  @js.native
  def parseErrorsFromMarkup(text: String): js.Array[LintError] = js.native
  
  @JSImport("tslint/lib/verify/parse", "preprocessDirectives")
  @js.native
  def preprocessDirectives(text: String): String = js.native
  
  @JSImport("tslint/lib/verify/parse", "removeErrorMarkup")
  @js.native
  def removeErrorMarkup(text: String): String = js.native
}

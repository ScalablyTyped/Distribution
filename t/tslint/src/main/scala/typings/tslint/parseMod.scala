package typings.tslint

import typings.tslint.lintErrorMod.LintError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("tslint/lib/verify/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMarkupFromErrors(fileName: String, code: String, lintErrors: js.Array[LintError]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createMarkupFromErrors")(fileName.asInstanceOf[js.Any], code.asInstanceOf[js.Any], lintErrors.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getNormalizedTypescriptVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedTypescriptVersion")().asInstanceOf[String]
  
  inline def getTypescriptVersionRequirement(text: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypescriptVersionRequirement")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def parseErrorsFromMarkup(text: String): js.Array[LintError] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseErrorsFromMarkup")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[LintError]]
  
  inline def preprocessDirectives(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("preprocessDirectives")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def removeErrorMarkup(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeErrorMarkup")(text.asInstanceOf[js.Any]).asInstanceOf[String]
}

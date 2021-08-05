package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.anon.AllowAutomaticSemicolonInsertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ParseOptions")
@js.native
class ParseOptions protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.ParseOptions {
  def this(
    languageVersion: typings.typescriptServices.TypeScript.LanguageVersion,
    allowAutomaticSemicolonInsertion: Boolean
  ) = this()
  
  /* private */ /* CompleteClass */
  var _allowAutomaticSemicolonInsertion: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _languageVersion: js.Any = js.native
  
  /* CompleteClass */
  override def allowAutomaticSemicolonInsertion(): Boolean = js.native
  
  /* CompleteClass */
  override def languageVersion(): typings.typescriptServices.TypeScript.LanguageVersion = js.native
  
  /* CompleteClass */
  override def toJSON(key: js.Any): AllowAutomaticSemicolonInsertion = js.native
}

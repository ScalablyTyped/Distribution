package typings.typescriptServices.mod

import typings.typescriptServices.anon.AllowAutomaticSemicolonInsertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ParseOptions")
@js.native
class ParseOptions protected ()
  extends typings.typescriptServices.TypeScript.ParseOptions {
  def this(
    languageVersion: typings.typescriptServices.TypeScript.LanguageVersion,
    allowAutomaticSemicolonInsertion: Boolean
  ) = this()
  /* CompleteClass */
  override var _allowAutomaticSemicolonInsertion: js.Any = js.native
  /* CompleteClass */
  override var _languageVersion: js.Any = js.native
  /* CompleteClass */
  override def allowAutomaticSemicolonInsertion(): Boolean = js.native
  /* CompleteClass */
  override def languageVersion(): typings.typescriptServices.TypeScript.LanguageVersion = js.native
  /* CompleteClass */
  override def toJSON(key: js.Any): AllowAutomaticSemicolonInsertion = js.native
}


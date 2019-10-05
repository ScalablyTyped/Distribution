package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createLanguageService")
@js.native
object createLanguageService extends js.Object {
  def apply(host: LanguageServiceHost): LanguageService = js.native
  def apply(host: LanguageServiceHost, documentRegistry: DocumentRegistry): LanguageService = js.native
  def apply(host: LanguageServiceHost, documentRegistry: DocumentRegistry, syntaxOnly: Boolean): LanguageService = js.native
}


package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeLens
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "CodeLens")
@js.native
object CodeLensNs extends js.Object {
  /**
    * Creates a new CodeLens literal.
    */
  def create(range: Range): CodeLens = js.native
  def create(range: Range, data: js.Any): CodeLens = js.native
  /**
    * Checks whether the given literal conforms to the [CodeLens](#CodeLens) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeLens */ Boolean = js.native
}


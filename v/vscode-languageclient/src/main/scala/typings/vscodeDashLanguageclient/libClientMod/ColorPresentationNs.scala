package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.ColorPresentation
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "ColorPresentation")
@js.native
object ColorPresentationNs extends js.Object {
  /**
    * Creates a new ColorInformation literal.
    */
  def create(label: String): ColorPresentation = js.native
  def create(label: String, textEdit: TextEdit): ColorPresentation = js.native
  def create(label: String, textEdit: TextEdit, additionalTextEdits: js.Array[TextEdit]): ColorPresentation = js.native
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorPresentation */ Boolean = js.native
}


package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "ColorPresentation")
@js.native
object ColorPresentation extends js.Object {
  
  /**
    * Creates a new ColorInformation literal.
    */
  def create(label: String): typings.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  def create(
    label: String,
    textEdit: js.UndefOr[scala.Nothing],
    additionalTextEdits: js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit]
  ): typings.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  def create(label: String, textEdit: typings.vscodeLanguageserverTypes.mod.TextEdit): typings.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  def create(
    label: String,
    textEdit: typings.vscodeLanguageserverTypes.mod.TextEdit,
    additionalTextEdits: js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit]
  ): typings.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorPresentation */ Boolean = js.native
}

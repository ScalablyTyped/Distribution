package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPresentation {
  
  /**
    * Creates a new ColorInformation literal.
    */
  @JSImport("vscode-languageserver-protocol", "ColorPresentation.create")
  @js.native
  def create(label: String): typings.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  @JSImport("vscode-languageserver-protocol", "ColorPresentation.create")
  @js.native
  def create(
    label: String,
    textEdit: js.UndefOr[scala.Nothing],
    additionalTextEdits: js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit]
  ): typings.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  @JSImport("vscode-languageserver-protocol", "ColorPresentation.create")
  @js.native
  def create(label: String, textEdit: typings.vscodeLanguageserverTypes.mod.TextEdit): typings.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  @JSImport("vscode-languageserver-protocol", "ColorPresentation.create")
  @js.native
  def create(
    label: String,
    textEdit: typings.vscodeLanguageserverTypes.mod.TextEdit,
    additionalTextEdits: js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit]
  ): typings.vscodeLanguageserverTypes.mod.ColorPresentation = js.native
  
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  @JSImport("vscode-languageserver-protocol", "ColorPresentation.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorPresentation */ Boolean = js.native
}

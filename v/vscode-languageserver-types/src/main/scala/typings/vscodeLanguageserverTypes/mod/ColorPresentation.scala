package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorPresentation extends js.Object {
  
  /**
    * An optional array of additional [text edits](#TextEdit) that are applied when
    * selecting this color presentation. Edits must not overlap with the main [edit](#ColorPresentation.textEdit) nor with themselves.
    */
  var additionalTextEdits: js.UndefOr[js.Array[TextEdit]] = js.native
  
  /**
    * The label of this color presentation. It will be shown on the color
    * picker header. By default this is also the text that is inserted when selecting
    * this color presentation.
    */
  var label: String = js.native
  
  /**
    * An [edit](#TextEdit) which is applied to a document when selecting
    * this presentation for the color.  When `falsy` the [label](#ColorPresentation.label)
    * is used.
    */
  var textEdit: js.UndefOr[TextEdit] = js.native
}
@JSImport("vscode-languageserver-types", "ColorPresentation")
@js.native
object ColorPresentation extends js.Object {
  
  /**
    * Creates a new ColorInformation literal.
    */
  def create(label: String): ColorPresentation = js.native
  def create(label: String, textEdit: js.UndefOr[scala.Nothing], additionalTextEdits: js.Array[TextEdit]): ColorPresentation = js.native
  def create(label: String, textEdit: TextEdit): ColorPresentation = js.native
  def create(label: String, textEdit: TextEdit, additionalTextEdits: js.Array[TextEdit]): ColorPresentation = js.native
  
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorPresentation */ Boolean = js.native
}

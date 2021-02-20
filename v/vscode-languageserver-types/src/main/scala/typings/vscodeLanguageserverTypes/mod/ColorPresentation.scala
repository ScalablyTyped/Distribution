package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorPresentation extends StObject {
  
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
object ColorPresentation {
  
  @scala.inline
  def apply(label: String): ColorPresentation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPresentation]
  }
  
  /**
    * Creates a new ColorInformation literal.
    */
  @JSImport("vscode-languageserver-types", "ColorPresentation.create")
  @js.native
  def create(label: String): ColorPresentation = js.native
  @JSImport("vscode-languageserver-types", "ColorPresentation.create")
  @js.native
  def create(label: String, textEdit: js.UndefOr[scala.Nothing], additionalTextEdits: js.Array[TextEdit]): ColorPresentation = js.native
  @JSImport("vscode-languageserver-types", "ColorPresentation.create")
  @js.native
  def create(label: String, textEdit: TextEdit): ColorPresentation = js.native
  @JSImport("vscode-languageserver-types", "ColorPresentation.create")
  @js.native
  def create(label: String, textEdit: TextEdit, additionalTextEdits: js.Array[TextEdit]): ColorPresentation = js.native
  
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  @JSImport("vscode-languageserver-types", "ColorPresentation.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorPresentation */ Boolean = js.native
  
  @scala.inline
  implicit class ColorPresentationMutableBuilder[Self <: ColorPresentation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalTextEdits(value: js.Array[TextEdit]): Self = StObject.set(x, "additionalTextEdits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalTextEditsUndefined: Self = StObject.set(x, "additionalTextEdits", js.undefined)
    
    @scala.inline
    def setAdditionalTextEditsVarargs(value: TextEdit*): Self = StObject.set(x, "additionalTextEdits", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEdit(value: TextEdit): Self = StObject.set(x, "textEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextEditUndefined: Self = StObject.set(x, "textEdit", js.undefined)
  }
}

package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorPresentation extends StObject {
  
  /**
    * An optional array of additional {@link TextEdit text edits} that are applied when
    * selecting this color presentation. Edits must not overlap with the main {@link ColorPresentation.textEdit edit} nor with themselves.
    */
  var additionalTextEdits: js.UndefOr[js.Array[TextEdit]] = js.undefined
  
  /**
    * The label of this color presentation. It will be shown on the color
    * picker header. By default this is also the text that is inserted when selecting
    * this color presentation.
    */
  var label: String
  
  /**
    * An {@link TextEdit edit} which is applied to a document when selecting
    * this presentation for the color.  When `falsy` the {@link ColorPresentation.label label}
    * is used.
    */
  var textEdit: js.UndefOr[TextEdit] = js.undefined
}
object ColorPresentation {
  
  inline def apply(label: String): ColorPresentation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPresentation]
  }
  
  @JSImport("vscode-languageserver-types", "ColorPresentation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ColorInformation literal.
    */
  inline def create(label: String): ColorPresentation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any]).asInstanceOf[ColorPresentation]
  inline def create(label: String, textEdit: Unit, additionalTextEdits: js.Array[TextEdit]): ColorPresentation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], textEdit.asInstanceOf[js.Any], additionalTextEdits.asInstanceOf[js.Any])).asInstanceOf[ColorPresentation]
  inline def create(label: String, textEdit: TextEdit): ColorPresentation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], textEdit.asInstanceOf[js.Any])).asInstanceOf[ColorPresentation]
  inline def create(label: String, textEdit: TextEdit, additionalTextEdits: js.Array[TextEdit]): ColorPresentation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], textEdit.asInstanceOf[js.Any], additionalTextEdits.asInstanceOf[js.Any])).asInstanceOf[ColorPresentation]
  
  /**
    * Checks whether the given literal conforms to the {@link ColorInformation} interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorPresentation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.ColorPresentation */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorPresentation] (val x: Self) extends AnyVal {
    
    inline def setAdditionalTextEdits(value: js.Array[TextEdit]): Self = StObject.set(x, "additionalTextEdits", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTextEditsUndefined: Self = StObject.set(x, "additionalTextEdits", js.undefined)
    
    inline def setAdditionalTextEditsVarargs(value: TextEdit*): Self = StObject.set(x, "additionalTextEdits", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setTextEdit(value: TextEdit): Self = StObject.set(x, "textEdit", value.asInstanceOf[js.Any])
    
    inline def setTextEditUndefined: Self = StObject.set(x, "textEdit", js.undefined)
  }
}

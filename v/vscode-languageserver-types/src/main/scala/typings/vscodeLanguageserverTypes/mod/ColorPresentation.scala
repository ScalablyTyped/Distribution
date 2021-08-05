package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorPresentation extends StObject {
  
  /**
    * An optional array of additional [text edits](#TextEdit) that are applied when
    * selecting this color presentation. Edits must not overlap with the main [edit](#ColorPresentation.textEdit) nor with themselves.
    */
  var additionalTextEdits: js.UndefOr[js.Array[TextEdit]] = js.undefined
  
  /**
    * The label of this color presentation. It will be shown on the color
    * picker header. By default this is also the text that is inserted when selecting
    * this color presentation.
    */
  var label: String
  
  /**
    * An [edit](#TextEdit) which is applied to a document when selecting
    * this presentation for the color.  When `falsy` the [label](#ColorPresentation.label)
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
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  inline def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorPresentation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.ColorPresentation */ Boolean]
  
  extension [Self <: ColorPresentation](x: Self) {
    
    inline def setAdditionalTextEdits(value: js.Array[TextEdit]): Self = StObject.set(x, "additionalTextEdits", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTextEditsUndefined: Self = StObject.set(x, "additionalTextEdits", js.undefined)
    
    inline def setAdditionalTextEditsVarargs(value: TextEdit*): Self = StObject.set(x, "additionalTextEdits", js.Array(value :_*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setTextEdit(value: TextEdit): Self = StObject.set(x, "textEdit", value.asInstanceOf[js.Any])
    
    inline def setTextEditUndefined: Self = StObject.set(x, "textEdit", js.undefined)
  }
}

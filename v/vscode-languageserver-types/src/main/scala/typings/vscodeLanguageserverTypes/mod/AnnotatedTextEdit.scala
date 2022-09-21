package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotatedTextEdit
  extends StObject
     with TextEdit {
  
  /**
    * The actual identifier of the change annotation
    */
  var annotationId: ChangeAnnotationIdentifier
}
object AnnotatedTextEdit {
  
  inline def apply(annotationId: ChangeAnnotationIdentifier, newText: String, range: Range): AnnotatedTextEdit = {
    val __obj = js.Dynamic.literal(annotationId = annotationId.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotatedTextEdit]
  }
  
  @JSImport("vscode-languageserver-types", "AnnotatedTextEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an annotated delete text edit.
    *
    * @param range The range of text to be deleted.
    * @param annotation The annotation.
    */
  inline def del(range: Range, annotation: ChangeAnnotationIdentifier): AnnotatedTextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(range.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[AnnotatedTextEdit]
  
  /**
    * Creates an annotated insert text edit.
    *
    * @param position The position to insert the text at.
    * @param newText The text to be inserted.
    * @param annotation The annotation.
    */
  inline def insert(position: Position, newText: String, annotation: ChangeAnnotationIdentifier): AnnotatedTextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(position.asInstanceOf[js.Any], newText.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[AnnotatedTextEdit]
  
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.AnnotatedTextEdit */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.AnnotatedTextEdit */ Boolean]
  
  /**
    * Creates an annotated replace text edit.
    *
    * @param range The range of text to be replaced.
    * @param newText The new text.
    * @param annotation The annotation.
    */
  inline def replace(range: Range, newText: String, annotation: ChangeAnnotationIdentifier): AnnotatedTextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(range.asInstanceOf[js.Any], newText.asInstanceOf[js.Any], annotation.asInstanceOf[js.Any])).asInstanceOf[AnnotatedTextEdit]
  
  extension [Self <: AnnotatedTextEdit](x: Self) {
    
    inline def setAnnotationId(value: ChangeAnnotationIdentifier): Self = StObject.set(x, "annotationId", value.asInstanceOf[js.Any])
  }
}

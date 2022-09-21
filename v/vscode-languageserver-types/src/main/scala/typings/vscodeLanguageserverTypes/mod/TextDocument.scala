package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocument extends StObject {
  
  /**
    * Get the text of this document. A substring can be retrieved by
    * providing a range.
    *
    * @param range (optional) An range within the document to return.
    * If no range is passed, the full content is returned.
    * Invalid range positions are adjusted as described in [Position.line](#Position.line)
    * and [Position.character](#Position.character).
    * If the start range position is greater than the end range position,
    * then the effect of getText is as if the two positions were swapped.
    * @return The text of this document or a substring of the text if a
    *         range is provided.
    */
  def getText(): String = js.native
  def getText(range: Range): String = js.native
  
  /**
    * The identifier of the language associated with this document.
    *
    * @readonly
    */
  val languageId: String = js.native
  
  /**
    * The number of lines in this document.
    *
    * @readonly
    */
  val lineCount: uinteger = js.native
  
  /**
    * Converts the position to a zero-based offset.
    * Invalid positions are adjusted as described in [Position.line](#Position.line)
    * and [Position.character](#Position.character).
    *
    * @param position A position.
    * @return A valid zero-based offset.
    */
  def offsetAt(position: Position): uinteger = js.native
  
  /**
    * Converts a zero-based offset to a position.
    *
    * @param offset A zero-based offset.
    * @return A valid [position](#Position).
    */
  def positionAt(offset: uinteger): Position = js.native
  
  /**
    * The associated URI for this document. Most documents have the __file__-scheme, indicating that they
    * represent files on disk. However, some documents may have other schemes indicating that they are not
    * available on disk.
    *
    * @readonly
    */
  val uri: DocumentUri = js.native
  
  /**
    * The version number of this document (it will increase after each
    * change, including undo/redo).
    *
    * @readonly
    */
  val version: integer = js.native
}
object TextDocument {
  
  @JSImport("vscode-languageserver-types", "TextDocument")
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyEdits(document: TextDocument, edits: js.Array[TextEdit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyEdits")(document.asInstanceOf[js.Any], edits.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Creates a new ITextDocument literal from the given uri and content.
    * @param uri The document's uri.
    * @param languageId The document's language Id.
    * @param version The document's version.
    * @param content The document's content.
    */
  inline def create(uri: DocumentUri, languageId: String, version: integer, content: String): TextDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any], version.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[TextDocument]
  
  /**
    * Checks whether the given literal conforms to the [ITextDocument](#ITextDocument) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocument */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.TextDocument */ Boolean]
}

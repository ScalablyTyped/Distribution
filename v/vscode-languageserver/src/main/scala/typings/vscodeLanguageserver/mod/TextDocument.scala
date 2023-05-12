package typings.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextDocument {
  
  @JSImport("vscode-languageserver", "TextDocument")
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyEdits(
    document: typings.vscodeLanguageserverTypes.mod.TextDocument,
    edits: js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyEdits")(document.asInstanceOf[js.Any], edits.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Creates a new ITextDocument literal from the given uri and content.
    * @param uri The document's uri.
    * @param languageId The document's language Id.
    * @param version The document's version.
    * @param content The document's content.
    */
  inline def create(
    uri: typings.vscodeLanguageserverTypes.mod.DocumentUri,
    languageId: String,
    version: typings.vscodeLanguageserverTypes.mod.integer,
    content: String
  ): typings.vscodeLanguageserverTypes.mod.TextDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any], version.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.TextDocument]
  
  /**
    * Checks whether the given literal conforms to the {@link ITextDocument} interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocument */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.TextDocument */ Boolean]
}

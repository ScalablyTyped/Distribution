package typings.vscodeLanguageserverTypes.mod

import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.markdown
import typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.plaintext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.plaintext
  - typings.vscodeLanguageserverTypes.vscodeLanguageserverTypesStrings.markdown
*/
trait MarkupKind extends StObject
object MarkupKind {
  
  @JSImport("vscode-languageserver-types", "MarkupKind")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Markdown is supported as a content format
    */
  @JSImport("vscode-languageserver-types", "MarkupKind.Markdown")
  @js.native
  val Markdown: markdown = js.native
  
  /**
    * Plain text is supported as a content format
    */
  @JSImport("vscode-languageserver-types", "MarkupKind.PlainText")
  @js.native
  val PlainText: plaintext = js.native
  
  /**
    * Checks whether the given value is a value of the {@link MarkupKind} type.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.MarkupKind */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.MarkupKind */ Boolean]
}

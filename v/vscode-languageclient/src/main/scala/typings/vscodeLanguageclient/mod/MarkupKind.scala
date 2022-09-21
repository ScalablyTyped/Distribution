package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.markdown
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.plaintext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MarkupKind {
  
  @JSImport("vscode-languageclient", "MarkupKind")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Markdown is supported as a content format
    */
  @JSImport("vscode-languageclient", "MarkupKind.Markdown")
  @js.native
  val Markdown: markdown = js.native
  
  /**
    * Plain text is supported as a content format
    */
  @JSImport("vscode-languageclient", "MarkupKind.PlainText")
  @js.native
  val PlainText: plaintext = js.native
  
  /**
    * Checks whether the given value is a value of the [MarkupKind](#MarkupKind) type.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.MarkupKind */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.MarkupKind */ Boolean]
}

package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.markdown
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.plaintext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MarkupKind {
  
  /**
    * Markdown is supported as a content format
    */
  @JSImport("vscode-languageserver-protocol", "MarkupKind.Markdown")
  @js.native
  val Markdown: markdown = js.native
  
  /**
    * Plain text is supported as a content format
    */
  @JSImport("vscode-languageserver-protocol", "MarkupKind.PlainText")
  @js.native
  val PlainText: plaintext = js.native
  
  /**
    * Checks whether the given value is a value of the [MarkupKind](#MarkupKind) type.
    */
  @JSImport("vscode-languageserver-protocol", "MarkupKind.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.MarkupKind */ Boolean = js.native
}

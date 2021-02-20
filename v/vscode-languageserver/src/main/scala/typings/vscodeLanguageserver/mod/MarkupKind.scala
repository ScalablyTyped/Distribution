package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.markdown
import typings.vscodeLanguageserver.vscodeLanguageserverStrings.plaintext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MarkupKind {
  
  /**
    * Markdown is supported as a content format
    */
  @JSImport("vscode-languageserver", "MarkupKind.Markdown")
  @js.native
  val Markdown: markdown = js.native
  
  /**
    * Plain text is supported as a content format
    */
  @JSImport("vscode-languageserver", "MarkupKind.PlainText")
  @js.native
  val PlainText: plaintext = js.native
  
  /**
    * Checks whether the given value is a value of the [MarkupKind](#MarkupKind) type.
    */
  @JSImport("vscode-languageserver", "MarkupKind.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.MarkupKind */ Boolean = js.native
}

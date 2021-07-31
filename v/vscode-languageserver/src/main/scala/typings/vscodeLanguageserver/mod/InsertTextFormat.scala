package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverNumbers.`1`
import typings.vscodeLanguageserver.vscodeLanguageserverNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InsertTextFormat {
  
  /**
    * The primary text to be inserted is treated as a plain string.
    */
  @JSImport("vscode-languageserver", "InsertTextFormat.PlainText")
  @js.native
  val PlainText: `1` = js.native
  
  /**
    * The primary text to be inserted is treated as a snippet.
    *
    * A snippet can define tab stops and placeholders with `$1`, `$2`
    * and `${3:foo}`. `$0` defines the final tab stop, it defaults to
    * the end of the snippet. Placeholders with equal identifiers are linked,
    * that is typing in one will update others too.
    *
    * See also: https://github.com/Microsoft/vscode/blob/master/src/vs/editor/contrib/snippet/common/snippet.md
    */
  @JSImport("vscode-languageserver", "InsertTextFormat.Snippet")
  @js.native
  val Snippet: `2` = js.native
}

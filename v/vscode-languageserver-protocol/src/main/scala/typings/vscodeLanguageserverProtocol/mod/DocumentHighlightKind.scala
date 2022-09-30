package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`1`
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`2`
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentHighlightKind {
  
  /**
    * Read-access of a symbol, like reading a variable.
    */
  @JSImport("vscode-languageserver-protocol", "DocumentHighlightKind.Read")
  @js.native
  val Read: `2` = js.native
  
  /**
    * A textual occurrence.
    */
  @JSImport("vscode-languageserver-protocol", "DocumentHighlightKind.Text")
  @js.native
  val Text: `1` = js.native
  
  /**
    * Write-access of a symbol, like writing to a variable.
    */
  @JSImport("vscode-languageserver-protocol", "DocumentHighlightKind.Write")
  @js.native
  val Write: `3` = js.native
}

package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.vscodeLanguageclientNumbers.`1`
import typings.vscodeLanguageclient.vscodeLanguageclientNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DiagnosticTag {
  
  /**
    * Deprecated or obsolete code.
    *
    * Clients are allowed to rendered diagnostics with this tag strike through.
    */
  @JSImport("vscode-languageclient/lib/client", "DiagnosticTag.Deprecated")
  @js.native
  val Deprecated: `2` = js.native
  
  /**
    * Unused or unnecessary code.
    *
    * Clients are allowed to render diagnostics with this tag faded out instead of having
    * an error squiggle.
    */
  @JSImport("vscode-languageclient/lib/client", "DiagnosticTag.Unnecessary")
  @js.native
  val Unnecessary: `1` = js.native
}

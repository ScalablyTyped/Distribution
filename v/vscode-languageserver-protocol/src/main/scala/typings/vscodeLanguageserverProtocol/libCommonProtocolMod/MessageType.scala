package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`1`
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`2`
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`3`
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolInts.`4`
*/
trait MessageType extends StObject
object MessageType {
  
  /**
    * An error message.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "MessageType.Error")
  @js.native
  val Error: /* 1 */ Double = js.native
  
  /**
    * An information message.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "MessageType.Info")
  @js.native
  val Info: /* 3 */ Double = js.native
  
  /**
    * A log message.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "MessageType.Log")
  @js.native
  val Log: /* 4 */ Double = js.native
  
  /**
    * A warning message.
    */
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "MessageType.Warning")
  @js.native
  val Warning: /* 2 */ Double = js.native
}

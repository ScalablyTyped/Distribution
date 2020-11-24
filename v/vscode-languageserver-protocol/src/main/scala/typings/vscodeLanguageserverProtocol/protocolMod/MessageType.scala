package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`3`
  - typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`4`
*/
trait MessageType extends js.Object
@JSImport("vscode-languageserver-protocol/lib/protocol", "MessageType")
@js.native
object MessageType extends js.Object {
  
  /**
    * An error message.
    */
  val Error: /* 1 */ Double = js.native
  
  /**
    * An information message.
    */
  val Info: /* 3 */ Double = js.native
  
  /**
    * A log message.
    */
  val Log: /* 4 */ Double = js.native
  
  /**
    * A warning message.
    */
  val Warning: /* 2 */ Double = js.native
}

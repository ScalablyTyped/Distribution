package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This enumeration defines all possible conditions when a thrown exception should result in a break.
		never: never breaks,
		always: always breaks,
		unhandled: breaks when exception unhandled,
		userUnhandled: breaks if the exception is not handled by user code.
	*/
/* Rewritten from type alias, can be one of: 
  - typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.never
  - typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.always
  - typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.unhandled
  - typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.userUnhandled
*/
trait ExceptionBreakMode extends StObject
object ExceptionBreakMode {
  
  inline def always: typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.always = "always".asInstanceOf[typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.always]
  
  inline def never: typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.never = "never".asInstanceOf[typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.never]
  
  inline def unhandled: typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.unhandled = "unhandled".asInstanceOf[typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.unhandled]
  
  inline def userUnhandled: typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.userUnhandled = "userUnhandled".asInstanceOf[typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.userUnhandled]
}

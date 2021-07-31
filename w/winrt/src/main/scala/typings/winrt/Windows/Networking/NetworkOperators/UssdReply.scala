package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UssdReply
  extends StObject
     with IUssdReply
object UssdReply {
  
  @scala.inline
  def apply(message: UssdMessage, resultCode: UssdResultCode): UssdReply = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UssdReply]
  }
}

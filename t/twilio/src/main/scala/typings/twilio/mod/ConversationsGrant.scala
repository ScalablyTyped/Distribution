package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio", "ConversationsGrant")
@js.native
class ConversationsGrant ()
  extends StObject
     with Grant {
  def this(options: ConversationsGrantOptions) = this()
  
  var configurationProfileSid: String = js.native
  
  /* CompleteClass */
  override def toPayload(): GrantPayload = js.native
}

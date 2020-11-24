package typings.winrt.Windows.Security.Authentication.OnlineId

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOnlineIdServiceTicketRequestFactory extends js.Object {
  
  def createOnlineIdServiceTicketRequest(service: String): OnlineIdServiceTicketRequest = js.native
  def createOnlineIdServiceTicketRequest(service: String, policy: String): OnlineIdServiceTicketRequest = js.native
}

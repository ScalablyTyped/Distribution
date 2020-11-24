package typings.twilio.mod

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncomingPhoneNumberInstance extends InstanceResource {
  
  def put(args: js.Any): Promise[_] = js.native
  def put(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def put(callback: RequestCallback): Promise[_] = js.native
  @JSName("put")
  var put_Original: RestMethod = js.native
}

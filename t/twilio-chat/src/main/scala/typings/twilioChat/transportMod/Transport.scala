package typings.twilioChat.transportMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transport extends EventEmitter {
  
  def delete(url: String, headers: js.Any): js.Promise[Result] = js.native
  
  def get(url: String, headers: js.Any): js.Promise[Result] = js.native
  
  val isConnected: Boolean = js.native
  
  def post(url: String, headers: js.Any, body: js.Any): js.Promise[Result] = js.native
  
  def put(url: String, headers: js.Any, body: js.Any): js.Promise[Result] = js.native
  
  val state: String = js.native
}

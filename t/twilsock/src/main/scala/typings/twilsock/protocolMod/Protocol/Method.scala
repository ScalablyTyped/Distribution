package typings.twilsock.protocolMod.Protocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twilsock.twilsockStrings.GET
  - typings.twilsock.twilsockStrings.POST
  - typings.twilsock.twilsockStrings.PUT
  - typings.twilsock.twilsockStrings.DELETE
  - typings.twilsock.twilsockStrings.put_notification_ctx
  - typings.twilsock.twilsockStrings.delete_notification_ctx
*/
trait Method extends js.Object

object Method {
  @scala.inline
  def DELETE: typings.twilsock.twilsockStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.twilsock.twilsockStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typings.twilsock.twilsockStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.twilsock.twilsockStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete_notification_ctx: typings.twilsock.twilsockStrings.delete_notification_ctx = this.cast("delete_notification_ctx")
  @scala.inline
  def put_notification_ctx: typings.twilsock.twilsockStrings.put_notification_ctx = this.cast("put_notification_ctx")
}


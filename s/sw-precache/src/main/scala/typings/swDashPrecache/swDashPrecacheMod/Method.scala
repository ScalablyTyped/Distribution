package typings.swDashPrecache.swDashPrecacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.swDashPrecache.swDashPrecacheStrings.get
  - typings.swDashPrecache.swDashPrecacheStrings.post
  - typings.swDashPrecache.swDashPrecacheStrings.put
  - typings.swDashPrecache.swDashPrecacheStrings.delete
  - typings.swDashPrecache.swDashPrecacheStrings.head
*/
trait Method extends js.Object

object Method {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typings.swDashPrecache.swDashPrecacheStrings.delete = this.cast("delete")
  @scala.inline
  def get: typings.swDashPrecache.swDashPrecacheStrings.get = this.cast("get")
  @scala.inline
  def head: typings.swDashPrecache.swDashPrecacheStrings.head = this.cast("head")
  @scala.inline
  def post: typings.swDashPrecache.swDashPrecacheStrings.post = this.cast("post")
  @scala.inline
  def put: typings.swDashPrecache.swDashPrecacheStrings.put = this.cast("put")
}


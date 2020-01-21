package typings.swPrecache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.swPrecache.swPrecacheStrings.get
  - typings.swPrecache.swPrecacheStrings.post
  - typings.swPrecache.swPrecacheStrings.put
  - typings.swPrecache.swPrecacheStrings.delete
  - typings.swPrecache.swPrecacheStrings.head
*/
trait Method extends js.Object

object Method {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typings.swPrecache.swPrecacheStrings.delete = this.cast("delete")
  @scala.inline
  def get: typings.swPrecache.swPrecacheStrings.get = this.cast("get")
  @scala.inline
  def head: typings.swPrecache.swPrecacheStrings.head = this.cast("head")
  @scala.inline
  def post: typings.swPrecache.swPrecacheStrings.post = this.cast("post")
  @scala.inline
  def put: typings.swPrecache.swPrecacheStrings.put = this.cast("put")
}


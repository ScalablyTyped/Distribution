package typings.workboxRouting.httpmethodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.workboxRouting.workboxRoutingStrings.DELETE
  - typings.workboxRouting.workboxRoutingStrings.GET
  - typings.workboxRouting.workboxRoutingStrings.HEAD
  - typings.workboxRouting.workboxRoutingStrings.PATCH
  - typings.workboxRouting.workboxRoutingStrings.POST
  - typings.workboxRouting.workboxRoutingStrings.PUT
*/
trait HTTPMethod extends js.Object

object HTTPMethod {
  @scala.inline
  def DELETE: typings.workboxRouting.workboxRoutingStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.workboxRouting.workboxRoutingStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typings.workboxRouting.workboxRoutingStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def PATCH: typings.workboxRouting.workboxRoutingStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.workboxRouting.workboxRoutingStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.workboxRouting.workboxRoutingStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


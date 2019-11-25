package typings.wpapi.wpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wpapi.wpapiStrings.GET
  - typings.wpapi.wpapiStrings.POST
  - typings.wpapi.wpapiStrings.PUT
  - typings.wpapi.wpapiStrings.PATCH
  - typings.wpapi.wpapiStrings.DELETE
*/
trait HTTPMethod extends js.Object

object HTTPMethod {
  @scala.inline
  def DELETE: typings.wpapi.wpapiStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.wpapi.wpapiStrings.GET = this.cast("GET")
  @scala.inline
  def PATCH: typings.wpapi.wpapiStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.wpapi.wpapiStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.wpapi.wpapiStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


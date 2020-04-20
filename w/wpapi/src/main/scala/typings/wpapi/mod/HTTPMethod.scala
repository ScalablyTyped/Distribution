package typings.wpapi.mod

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
  def DELETE: typings.wpapi.wpapiStrings.DELETE = "DELETE".asInstanceOf[typings.wpapi.wpapiStrings.DELETE]
  @scala.inline
  def GET: typings.wpapi.wpapiStrings.GET = "GET".asInstanceOf[typings.wpapi.wpapiStrings.GET]
  @scala.inline
  def PATCH: typings.wpapi.wpapiStrings.PATCH = "PATCH".asInstanceOf[typings.wpapi.wpapiStrings.PATCH]
  @scala.inline
  def POST: typings.wpapi.wpapiStrings.POST = "POST".asInstanceOf[typings.wpapi.wpapiStrings.POST]
  @scala.inline
  def PUT: typings.wpapi.wpapiStrings.PUT = "PUT".asInstanceOf[typings.wpapi.wpapiStrings.PUT]
}


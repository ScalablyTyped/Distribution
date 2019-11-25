package typings.wegameDashApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wegameDashApi.wegameDashApiStrings.GET
  - typings.wegameDashApi.wegameDashApiStrings.HEAD
  - typings.wegameDashApi.wegameDashApiStrings.POST
  - typings.wegameDashApi.wegameDashApiStrings.PUT
  - typings.wegameDashApi.wegameDashApiStrings.DELETE
  - typings.wegameDashApi.wegameDashApiStrings.TRACE
  - typings.wegameDashApi.wegameDashApiStrings.CONNECT
*/
trait RequestMethod extends js.Object

object RequestMethod {
  @scala.inline
  def CONNECT: typings.wegameDashApi.wegameDashApiStrings.CONNECT = this.cast("CONNECT")
  @scala.inline
  def DELETE: typings.wegameDashApi.wegameDashApiStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.wegameDashApi.wegameDashApiStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typings.wegameDashApi.wegameDashApiStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def POST: typings.wegameDashApi.wegameDashApiStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.wegameDashApi.wegameDashApiStrings.PUT = this.cast("PUT")
  @scala.inline
  def TRACE: typings.wegameDashApi.wegameDashApiStrings.TRACE = this.cast("TRACE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


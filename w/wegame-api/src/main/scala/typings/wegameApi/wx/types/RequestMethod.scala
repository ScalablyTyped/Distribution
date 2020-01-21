package typings.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wegameApi.wegameApiStrings.GET
  - typings.wegameApi.wegameApiStrings.HEAD
  - typings.wegameApi.wegameApiStrings.POST
  - typings.wegameApi.wegameApiStrings.PUT
  - typings.wegameApi.wegameApiStrings.DELETE
  - typings.wegameApi.wegameApiStrings.TRACE
  - typings.wegameApi.wegameApiStrings.CONNECT
*/
trait RequestMethod extends js.Object

object RequestMethod {
  @scala.inline
  def CONNECT: typings.wegameApi.wegameApiStrings.CONNECT = this.cast("CONNECT")
  @scala.inline
  def DELETE: typings.wegameApi.wegameApiStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.wegameApi.wegameApiStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typings.wegameApi.wegameApiStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def POST: typings.wegameApi.wegameApiStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.wegameApi.wegameApiStrings.PUT = this.cast("PUT")
  @scala.inline
  def TRACE: typings.wegameApi.wegameApiStrings.TRACE = this.cast("TRACE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


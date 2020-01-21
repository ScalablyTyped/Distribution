package typings.urllib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.urllib.urllibStrings.GET
  - typings.urllib.urllibStrings.POST
  - typings.urllib.urllibStrings.DELETE
  - typings.urllib.urllibStrings.PUT
  - typings.urllib.urllibStrings.HEAD
  - typings.urllib.urllibStrings.OPTIONS
  - typings.urllib.urllibStrings.PATCH
  - typings.urllib.urllibStrings.TRACE
  - typings.urllib.urllibStrings.CONNECT
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def CONNECT: typings.urllib.urllibStrings.CONNECT = this.cast("CONNECT")
  @scala.inline
  def DELETE: typings.urllib.urllibStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.urllib.urllibStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typings.urllib.urllibStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typings.urllib.urllibStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typings.urllib.urllibStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.urllib.urllibStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.urllib.urllibStrings.PUT = this.cast("PUT")
  @scala.inline
  def TRACE: typings.urllib.urllibStrings.TRACE = this.cast("TRACE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


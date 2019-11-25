package typings.stubby.stubbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stubby.stubbyStrings.GET
  - typings.stubby.stubbyStrings.PUT
  - typings.stubby.stubbyStrings.POST
  - typings.stubby.stubbyStrings.HEAD
  - typings.stubby.stubbyStrings.PATCH
  - typings.stubby.stubbyStrings.TRACE
  - typings.stubby.stubbyStrings.DELETE
  - typings.stubby.stubbyStrings.CONNECT
  - typings.stubby.stubbyStrings.OPTIONS
*/
trait StubbyMethod extends js.Object

object StubbyMethod {
  @scala.inline
  def CONNECT: typings.stubby.stubbyStrings.CONNECT = this.cast("CONNECT")
  @scala.inline
  def DELETE: typings.stubby.stubbyStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.stubby.stubbyStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typings.stubby.stubbyStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typings.stubby.stubbyStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typings.stubby.stubbyStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.stubby.stubbyStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.stubby.stubbyStrings.PUT = this.cast("PUT")
  @scala.inline
  def TRACE: typings.stubby.stubbyStrings.TRACE = this.cast("TRACE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


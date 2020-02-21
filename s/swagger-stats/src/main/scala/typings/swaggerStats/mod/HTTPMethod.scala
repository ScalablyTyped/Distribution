package typings.swaggerStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.swaggerStats.swaggerStatsStrings.HEAD
  - typings.swaggerStats.swaggerStatsStrings.OPTIONS
  - typings.swaggerStats.swaggerStatsStrings.TRACE
  - typings.swaggerStats.swaggerStatsStrings.PATCH
  - typings.swaggerStats.swaggerStatsStrings.GET
  - typings.swaggerStats.swaggerStatsStrings.POST
  - typings.swaggerStats.swaggerStatsStrings.PUT
  - typings.swaggerStats.swaggerStatsStrings.DELETE
*/
trait HTTPMethod extends js.Object

object HTTPMethod {
  @scala.inline
  def DELETE: typings.swaggerStats.swaggerStatsStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.swaggerStats.swaggerStatsStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typings.swaggerStats.swaggerStatsStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typings.swaggerStats.swaggerStatsStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typings.swaggerStats.swaggerStatsStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.swaggerStats.swaggerStatsStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.swaggerStats.swaggerStatsStrings.PUT = this.cast("PUT")
  @scala.inline
  def TRACE: typings.swaggerStats.swaggerStatsStrings.TRACE = this.cast("TRACE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


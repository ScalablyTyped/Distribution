package typings.swaggerStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.swaggerStats.swaggerStatsStrings.GET
  - typings.swaggerStats.swaggerStatsStrings.POST
  - typings.swaggerStats.swaggerStatsStrings.PUT
  - typings.swaggerStats.swaggerStatsStrings.DELETE
*/
trait HTTPMethodSubset extends js.Object

object HTTPMethodSubset {
  @scala.inline
  def DELETE: typings.swaggerStats.swaggerStatsStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.swaggerStats.swaggerStatsStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typings.swaggerStats.swaggerStatsStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.swaggerStats.swaggerStatsStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tabulatorTables.tabulatorTablesStrings.GET
  - typings.tabulatorTables.tabulatorTablesStrings.POST
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def GET: typings.tabulatorTables.tabulatorTablesStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typings.tabulatorTables.tabulatorTablesStrings.POST = this.cast("POST")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


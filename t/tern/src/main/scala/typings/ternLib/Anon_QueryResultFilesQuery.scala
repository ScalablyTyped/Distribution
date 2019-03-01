package typings
package ternLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryResultFilesQuery extends js.Object {
  var query: ternLib.libTernMod.FilesQuery
  var result: ternLib.libTernMod.FilesQueryResult
}

object Anon_QueryResultFilesQuery {
  @scala.inline
  def apply(query: ternLib.libTernMod.FilesQuery, result: ternLib.libTernMod.FilesQueryResult): Anon_QueryResultFilesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[Anon_QueryResultFilesQuery]
  }
}


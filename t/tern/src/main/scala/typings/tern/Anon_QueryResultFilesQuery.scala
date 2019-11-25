package typings.tern

import typings.tern.libTernMod.FilesQuery
import typings.tern.libTernMod.FilesQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryResultFilesQuery extends js.Object {
  var query: FilesQuery
  var result: FilesQueryResult
}

object Anon_QueryResultFilesQuery {
  @scala.inline
  def apply(query: FilesQuery, result: FilesQueryResult): Anon_QueryResultFilesQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_QueryResultFilesQuery]
  }
}


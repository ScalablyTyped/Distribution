package typings.tern

import typings.tern.ternMod.FilesQuery
import typings.tern.ternMod.FilesQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryResultFilesQuery extends js.Object {
  var query: FilesQuery
  var result: FilesQueryResult
}

object AnonQueryResultFilesQuery {
  @scala.inline
  def apply(query: FilesQuery, result: FilesQueryResult): AnonQueryResultFilesQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQueryResultFilesQuery]
  }
}


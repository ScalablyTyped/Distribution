package typings.tern

import typings.tern.ternMod.FilesQuery
import typings.tern.ternMod.FilesQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryFilesQuery extends js.Object {
  var query: FilesQuery
  var result: FilesQueryResult
}

object AnonQueryFilesQuery {
  @scala.inline
  def apply(query: FilesQuery, result: FilesQueryResult): AnonQueryFilesQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQueryFilesQuery]
  }
}


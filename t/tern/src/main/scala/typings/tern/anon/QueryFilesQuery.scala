package typings.tern.anon

import typings.tern.ternMod.FilesQuery
import typings.tern.ternMod.FilesQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryFilesQuery extends js.Object {
  var query: FilesQuery = js.native
  var result: FilesQueryResult = js.native
}

object QueryFilesQuery {
  @scala.inline
  def apply(query: FilesQuery, result: FilesQueryResult): QueryFilesQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFilesQuery]
  }
  @scala.inline
  implicit class QueryFilesQueryOps[Self <: QueryFilesQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQuery(value: FilesQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: FilesQueryResult): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}


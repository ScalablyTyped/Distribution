package typings.tern.ternMod

import typings.tern.ternStrings.files
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesQuery
  extends BaseQuery
     with Query {
  @JSName("docFormat")
  var docFormat_FilesQuery: js.UndefOr[scala.Nothing] = js.native
  @JSName("lineCharPositions")
  var lineCharPositions_FilesQuery: js.UndefOr[scala.Nothing] = js.native
  /** Get the files that the server currently holds in its set of analyzed files. */
  @JSName("type")
  var type_FilesQuery: files = js.native
}

object FilesQuery {
  @scala.inline
  def apply(`type`: files): FilesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesQuery]
  }
  @scala.inline
  implicit class FilesQueryOps[Self <: FilesQuery] (val x: Self) extends AnyVal {
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
    def setType(value: files): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


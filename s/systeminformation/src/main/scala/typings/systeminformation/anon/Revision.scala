package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Revision extends js.Object {
  var revision: Double = js.native
  var table: js.Array[Flags] = js.native
}

object Revision {
  @scala.inline
  def apply(revision: Double, table: js.Array[Flags]): Revision = {
    val __obj = js.Dynamic.literal(revision = revision.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision]
  }
  @scala.inline
  implicit class RevisionOps[Self <: Revision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableVarargs(value: Flags*): Self = this.set("table", js.Array(value :_*))
    @scala.inline
    def setTable(value: js.Array[Flags]): Self = this.set("table", value.asInstanceOf[js.Any])
  }
  
}


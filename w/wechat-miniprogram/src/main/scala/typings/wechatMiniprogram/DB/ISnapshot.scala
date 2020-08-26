package typings.wechatMiniprogram.DB

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISnapshot extends js.Object {
  var docChanges: js.Array[ISingleDBEvent] = js.native
  var docs: Record[String, _] = js.native
  var id: Double = js.native
  var `type`: js.UndefOr[SnapshotType] = js.native
}

object ISnapshot {
  @scala.inline
  def apply(docChanges: js.Array[ISingleDBEvent], docs: Record[String, _], id: Double): ISnapshot = {
    val __obj = js.Dynamic.literal(docChanges = docChanges.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISnapshot]
  }
  @scala.inline
  implicit class ISnapshotOps[Self <: ISnapshot] (val x: Self) extends AnyVal {
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
    def setDocChangesVarargs(value: ISingleDBEvent*): Self = this.set("docChanges", js.Array(value :_*))
    @scala.inline
    def setDocChanges(value: js.Array[ISingleDBEvent]): Self = this.set("docChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocs(value: Record[String, _]): Self = this.set("docs", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: SnapshotType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


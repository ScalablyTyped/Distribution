package typings.wechatMiniprogram.DB

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISingleDBEvent extends js.Object {
  var dataType: DataType = js.native
  var doc: Record[String, _] = js.native
  var docId: String = js.native
  var id: Double = js.native
  var queueType: QueueType = js.native
  var removedFields: js.UndefOr[js.Array[String]] = js.native
  var updatedFields: js.UndefOr[Record[String, _]] = js.native
}

object ISingleDBEvent {
  @scala.inline
  def apply(dataType: DataType, doc: Record[String, _], docId: String, id: Double, queueType: QueueType): ISingleDBEvent = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], doc = doc.asInstanceOf[js.Any], docId = docId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], queueType = queueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISingleDBEvent]
  }
  @scala.inline
  implicit class ISingleDBEventOps[Self <: ISingleDBEvent] (val x: Self) extends AnyVal {
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
    def setDataType(value: DataType): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoc(value: Record[String, _]): Self = this.set("doc", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocId(value: String): Self = this.set("docId", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueType(value: QueueType): Self = this.set("queueType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovedFieldsVarargs(value: String*): Self = this.set("removedFields", js.Array(value :_*))
    @scala.inline
    def setRemovedFields(value: js.Array[String]): Self = this.set("removedFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemovedFields: Self = this.set("removedFields", js.undefined)
    @scala.inline
    def setUpdatedFields(value: Record[String, _]): Self = this.set("updatedFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedFields: Self = this.set("updatedFields", js.undefined)
  }
  
}


package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amount extends js.Object {
  var amount: Double = js.native
  var datetime: String = js.native
  var direction: String = js.native
  var label: js.UndefOr[String] = js.native
  var operation_id: String = js.native
  var pattern_id: js.UndefOr[String] = js.native
  var status: String = js.native
  var title: String = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Amount {
  @scala.inline
  def apply(
    amount: Double,
    datetime: String,
    direction: String,
    operation_id: String,
    status: String,
    title: String
  ): Amount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], operation_id = operation_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
  @scala.inline
  implicit class AmountOps[Self <: Amount] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatetime(value: String): Self = this.set("datetime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation_id(value: String): Self = this.set("operation_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setPattern_id(value: String): Self = this.set("pattern_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern_id: Self = this.set("pattern_id", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Change extends js.Object {
  var change: scala.Double = js.native
  var changeset: scala.Double = js.native
  var date: scala.Double = js.native
  var latest: scala.Double = js.native
  var mergeSource: scala.Double = js.native
  var none: scala.Double = js.native
  var shelveset: scala.Double = js.native
  var tip: scala.Double = js.native
}

object Change {
  @scala.inline
  def apply(
    change: scala.Double,
    changeset: scala.Double,
    date: scala.Double,
    latest: scala.Double,
    mergeSource: scala.Double,
    none: scala.Double,
    shelveset: scala.Double,
    tip: scala.Double
  ): Change = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], changeset = changeset.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any], mergeSource = mergeSource.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], shelveset = shelveset.asInstanceOf[js.Any], tip = tip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  @scala.inline
  implicit class ChangeOps[Self <: Change] (val x: Self) extends AnyVal {
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
    def setChange(value: scala.Double): Self = this.set("change", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangeset(value: scala.Double): Self = this.set("changeset", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: scala.Double): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatest(value: scala.Double): Self = this.set("latest", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergeSource(value: scala.Double): Self = this.set("mergeSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setShelveset(value: scala.Double): Self = this.set("shelveset", value.asInstanceOf[js.Any])
    @scala.inline
    def setTip(value: scala.Double): Self = this.set("tip", value.asInstanceOf[js.Any])
  }
  
}


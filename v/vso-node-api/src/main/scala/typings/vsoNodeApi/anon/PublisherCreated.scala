package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublisherCreated extends js.Object {
  var none: scala.Double = js.native
  var publisherCreated: scala.Double = js.native
  var userEditable: scala.Double = js.native
}

object PublisherCreated {
  @scala.inline
  def apply(none: scala.Double, publisherCreated: scala.Double, userEditable: scala.Double): PublisherCreated = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], publisherCreated = publisherCreated.asInstanceOf[js.Any], userEditable = userEditable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherCreated]
  }
  @scala.inline
  implicit class PublisherCreatedOps[Self <: PublisherCreated] (val x: Self) extends AnyVal {
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
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublisherCreated(value: scala.Double): Self = this.set("publisherCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserEditable(value: scala.Double): Self = this.set("userEditable", value.asInstanceOf[js.Any])
  }
  
}


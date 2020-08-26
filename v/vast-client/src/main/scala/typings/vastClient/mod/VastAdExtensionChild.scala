package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastAdExtensionChild extends js.Object {
  var attributes: VastAdChildAttributes = js.native
  var name: js.UndefOr[String] = js.native
  var value: String | Double = js.native
}

object VastAdExtensionChild {
  @scala.inline
  def apply(attributes: VastAdChildAttributes, value: String | Double): VastAdExtensionChild = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastAdExtensionChild]
  }
  @scala.inline
  implicit class VastAdExtensionChildOps[Self <: VastAdExtensionChild] (val x: Self) extends AnyVal {
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
    def setAttributes(value: VastAdChildAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}


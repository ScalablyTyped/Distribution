package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastAdExtension extends js.Object {
  var attributes: VastAdAttributes = js.native
  var children: js.Array[VastAdExtensionChild] = js.native
}

object VastAdExtension {
  @scala.inline
  def apply(attributes: VastAdAttributes, children: js.Array[VastAdExtensionChild]): VastAdExtension = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastAdExtension]
  }
  @scala.inline
  implicit class VastAdExtensionOps[Self <: VastAdExtension] (val x: Self) extends AnyVal {
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
    def setAttributes(value: VastAdAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: VastAdExtensionChild*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[VastAdExtensionChild]): Self = this.set("children", value.asInstanceOf[js.Any])
  }
  
}


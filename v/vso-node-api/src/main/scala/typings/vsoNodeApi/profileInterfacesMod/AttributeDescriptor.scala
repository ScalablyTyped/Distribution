package typings.vsoNodeApi.profileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeDescriptor extends js.Object {
  var attributeName: String = js.native
  var containerName: String = js.native
}

object AttributeDescriptor {
  @scala.inline
  def apply(attributeName: String, containerName: String): AttributeDescriptor = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeDescriptor]
  }
  @scala.inline
  implicit class AttributeDescriptorOps[Self <: AttributeDescriptor] (val x: Self) extends AnyVal {
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
    def setAttributeName(value: String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
  }
  
}


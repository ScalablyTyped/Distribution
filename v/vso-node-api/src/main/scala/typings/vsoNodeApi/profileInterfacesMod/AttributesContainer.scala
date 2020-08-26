package typings.vsoNodeApi.profileInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributesContainer extends js.Object {
  var attributes: StringDictionary[ProfileAttribute] = js.native
  var containerName: String = js.native
  var revision: Double = js.native
}

object AttributesContainer {
  @scala.inline
  def apply(attributes: StringDictionary[ProfileAttribute], containerName: String, revision: Double): AttributesContainer = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesContainer]
  }
  @scala.inline
  implicit class AttributesContainerOps[Self <: AttributesContainer] (val x: Self) extends AnyVal {
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
    def setAttributes(value: StringDictionary[ProfileAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
  }
  
}


package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcVersionDescriptor extends js.Object {
  var version: String = js.native
  var versionOption: TfvcVersionOption = js.native
  var versionType: TfvcVersionType = js.native
}

object TfvcVersionDescriptor {
  @scala.inline
  def apply(version: String, versionOption: TfvcVersionOption, versionType: TfvcVersionType): TfvcVersionDescriptor = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any], versionOption = versionOption.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcVersionDescriptor]
  }
  @scala.inline
  implicit class TfvcVersionDescriptorOps[Self <: TfvcVersionDescriptor] (val x: Self) extends AnyVal {
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionOption(value: TfvcVersionOption): Self = this.set("versionOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionType(value: TfvcVersionType): Self = this.set("versionType", value.asInstanceOf[js.Any])
  }
  
}


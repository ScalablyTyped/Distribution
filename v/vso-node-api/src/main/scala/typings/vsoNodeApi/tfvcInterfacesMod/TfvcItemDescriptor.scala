package typings.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcItemDescriptor extends js.Object {
  var path: String = js.native
  var recursionLevel: VersionControlRecursionType = js.native
  var version: String = js.native
  var versionOption: TfvcVersionOption = js.native
  var versionType: TfvcVersionType = js.native
}

object TfvcItemDescriptor {
  @scala.inline
  def apply(
    path: String,
    recursionLevel: VersionControlRecursionType,
    version: String,
    versionOption: TfvcVersionOption,
    versionType: TfvcVersionType
  ): TfvcItemDescriptor = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], recursionLevel = recursionLevel.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionOption = versionOption.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcItemDescriptor]
  }
  @scala.inline
  implicit class TfvcItemDescriptorOps[Self <: TfvcItemDescriptor] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecursionLevel(value: VersionControlRecursionType): Self = this.set("recursionLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionOption(value: TfvcVersionOption): Self = this.set("versionOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionType(value: TfvcVersionType): Self = this.set("versionType", value.asInstanceOf[js.Any])
  }
  
}


package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcVersionDescriptor extends js.Object {
  var version: String
  var versionOption: TfvcVersionOption
  var versionType: TfvcVersionType
}

object TfvcVersionDescriptor {
  @scala.inline
  def apply(version: String, versionOption: TfvcVersionOption, versionType: TfvcVersionType): TfvcVersionDescriptor = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any], versionOption = versionOption.asInstanceOf[js.Any], versionType = versionType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TfvcVersionDescriptor]
  }
}


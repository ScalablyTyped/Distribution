package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcItemDescriptor extends js.Object {
  var path: String
  var recursionLevel: VersionControlRecursionType
  var version: String
  var versionOption: TfvcVersionOption
  var versionType: TfvcVersionType
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
    val __obj = js.Dynamic.literal(path = path, recursionLevel = recursionLevel, version = version, versionOption = versionOption, versionType = versionType)
  
    __obj.asInstanceOf[TfvcItemDescriptor]
  }
}


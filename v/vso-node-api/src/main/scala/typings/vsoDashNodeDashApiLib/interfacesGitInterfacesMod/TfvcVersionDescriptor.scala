package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcVersionDescriptor extends js.Object {
  var version: java.lang.String
  var versionOption: TfvcVersionOption
  var versionType: TfvcVersionType
}

object TfvcVersionDescriptor {
  @scala.inline
  def apply(version: java.lang.String, versionOption: TfvcVersionOption, versionType: TfvcVersionType): TfvcVersionDescriptor = {
    val __obj = js.Dynamic.literal(version = version, versionOption = versionOption, versionType = versionType)
  
    __obj.asInstanceOf[TfvcVersionDescriptor]
  }
}


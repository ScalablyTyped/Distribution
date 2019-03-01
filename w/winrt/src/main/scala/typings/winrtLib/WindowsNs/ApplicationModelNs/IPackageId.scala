package typings
package winrtLib.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPackageId extends js.Object {
  var architecture: winrtLib.WindowsNs.SystemNs.ProcessorArchitecture
  var familyName: java.lang.String
  var fullName: java.lang.String
  var name: java.lang.String
  var publisher: java.lang.String
  var publisherId: java.lang.String
  var resourceId: java.lang.String
  var version: PackageVersion
}

object IPackageId {
  @scala.inline
  def apply(
    architecture: winrtLib.WindowsNs.SystemNs.ProcessorArchitecture,
    familyName: java.lang.String,
    fullName: java.lang.String,
    name: java.lang.String,
    publisher: java.lang.String,
    publisherId: java.lang.String,
    resourceId: java.lang.String,
    version: PackageVersion
  ): IPackageId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("architecture")(architecture)
    __obj.updateDynamic("familyName")(familyName)
    __obj.updateDynamic("fullName")(fullName)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("publisher")(publisher)
    __obj.updateDynamic("publisherId")(publisherId)
    __obj.updateDynamic("resourceId")(resourceId)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[IPackageId]
  }
}


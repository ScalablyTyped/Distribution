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
    val __obj = js.Dynamic.literal(architecture = architecture, familyName = familyName, fullName = fullName, name = name, publisher = publisher, publisherId = publisherId, resourceId = resourceId, version = version)
  
    __obj.asInstanceOf[IPackageId]
  }
}


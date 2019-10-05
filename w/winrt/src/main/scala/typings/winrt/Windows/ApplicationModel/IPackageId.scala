package typings.winrt.Windows.ApplicationModel

import typings.winrt.Windows.System.ProcessorArchitecture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPackageId extends js.Object {
  var architecture: ProcessorArchitecture
  var familyName: String
  var fullName: String
  var name: String
  var publisher: String
  var publisherId: String
  var resourceId: String
  var version: PackageVersion
}

object IPackageId {
  @scala.inline
  def apply(
    architecture: ProcessorArchitecture,
    familyName: String,
    fullName: String,
    name: String,
    publisher: String,
    publisherId: String,
    resourceId: String,
    version: PackageVersion
  ): IPackageId = {
    val __obj = js.Dynamic.literal(architecture = architecture, familyName = familyName, fullName = fullName, name = name, publisher = publisher, publisherId = publisherId, resourceId = resourceId, version = version)
  
    __obj.asInstanceOf[IPackageId]
  }
}


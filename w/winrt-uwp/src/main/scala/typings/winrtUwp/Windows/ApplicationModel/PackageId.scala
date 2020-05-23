package typings.winrtUwp.Windows.ApplicationModel

import typings.winrtUwp.Windows.System.ProcessorArchitecture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides package identification info, such as name, version, and publisher. */
trait PackageId extends js.Object {
  /** Gets the processor architecture for which the package was created. */
  var architecture: ProcessorArchitecture
  /** Windows Phone only. Gets the value of the Author attribute for the specified application package. */
  var author: String
  /** Gets the family name of the package. */
  var familyName: String
  /** Gets the full name of the package. */
  var fullName: String
  /** Gets the name of the package. */
  var name: String
  /** Windows Phone only. Gets the value of the ProductID attribute associated with this application package. */
  var productId: String
  /** Gets the publisher of the package. */
  var publisher: String
  /** Gets the publisher ID of the package. */
  var publisherId: String
  /** Gets the resource ID of the package. */
  var resourceId: String
  /** Gets the package version info. */
  var version: PackageVersion
}

object PackageId {
  @scala.inline
  def apply(
    architecture: ProcessorArchitecture,
    author: String,
    familyName: String,
    fullName: String,
    name: String,
    productId: String,
    publisher: String,
    publisherId: String,
    resourceId: String,
    version: PackageVersion
  ): PackageId = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], publisherId = publisherId.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageId]
  }
}


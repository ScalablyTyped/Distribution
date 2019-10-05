package typings.winrtDashUwp.Windows.ApplicationModel

import typings.winrtDashUwp.Windows.System.ProcessorArchitecture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides package identification info, such as name, version, and publisher. */
@JSGlobal("Windows.ApplicationModel.PackageId")
@js.native
abstract class PackageId () extends js.Object {
  /** Gets the processor architecture for which the package was created. */
  var architecture: ProcessorArchitecture = js.native
  /** Windows Phone only. Gets the value of the Author attribute for the specified application package. */
  var author: String = js.native
  /** Gets the family name of the package. */
  var familyName: String = js.native
  /** Gets the full name of the package. */
  var fullName: String = js.native
  /** Gets the name of the package. */
  var name: String = js.native
  /** Windows Phone only. Gets the value of the ProductID attribute associated with this application package. */
  var productId: String = js.native
  /** Gets the publisher of the package. */
  var publisher: String = js.native
  /** Gets the publisher ID of the package. */
  var publisherId: String = js.native
  /** Gets the resource ID of the package. */
  var resourceId: String = js.native
  /** Gets the package version info. */
  var version: PackageVersion = js.native
}


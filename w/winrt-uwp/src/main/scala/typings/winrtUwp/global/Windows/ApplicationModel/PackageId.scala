package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.ApplicationModel.PackageVersion
import typings.winrtUwp.Windows.System.ProcessorArchitecture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides package identification info, such as name, version, and publisher. */
@JSGlobal("Windows.ApplicationModel.PackageId")
@js.native
abstract class PackageId ()
  extends typings.winrtUwp.Windows.ApplicationModel.PackageId {
  /** Gets the processor architecture for which the package was created. */
  /* CompleteClass */
  override var architecture: ProcessorArchitecture = js.native
  /** Windows Phone only. Gets the value of the Author attribute for the specified application package. */
  /* CompleteClass */
  override var author: String = js.native
  /** Gets the family name of the package. */
  /* CompleteClass */
  override var familyName: String = js.native
  /** Gets the full name of the package. */
  /* CompleteClass */
  override var fullName: String = js.native
  /** Gets the name of the package. */
  /* CompleteClass */
  override var name: String = js.native
  /** Windows Phone only. Gets the value of the ProductID attribute associated with this application package. */
  /* CompleteClass */
  override var productId: String = js.native
  /** Gets the publisher of the package. */
  /* CompleteClass */
  override var publisher: String = js.native
  /** Gets the publisher ID of the package. */
  /* CompleteClass */
  override var publisherId: String = js.native
  /** Gets the resource ID of the package. */
  /* CompleteClass */
  override var resourceId: String = js.native
  /** Gets the package version info. */
  /* CompleteClass */
  override var version: PackageVersion = js.native
}


package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.ApplicationModel.Package
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about a package for the current app that has an update available for download from the Windows Store. */
trait StorePackageUpdate extends js.Object {
  /** Gets the package that has an update available for download from the Windows Store. */
  @JSName("package")
  var _package: Package
  /** Gets a value that indicates whether the package that has an update available for download from the Windows Store is a mandatory package, as specified by the developer in the Windows Dev Center dashboard. */
  var mandatory: Boolean
}

object StorePackageUpdate {
  @scala.inline
  def apply(_package: Package, mandatory: Boolean): StorePackageUpdate = {
    val __obj = js.Dynamic.literal(mandatory = mandatory.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePackageUpdate]
  }
}


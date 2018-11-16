package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about a package for the current app that has an update available for download from the Windows Store. */
@JSGlobal("Windows.Services.Store.StorePackageUpdate")
@js.native
abstract class StorePackageUpdate () extends js.Object {
  /** Gets a value that indicates whether the package that has an update available for download from the Windows Store is a mandatory package, as specified by the developer in the Windows Dev Center dashboard. */
  var mandatory: scala.Boolean = js.native
  /** Gets the package that has an update available for download from the Windows Store. */
  var `package`: winrtDashUwpLib.WindowsNs.ApplicationModelNs.Package = js.native
}


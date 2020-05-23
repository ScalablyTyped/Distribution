package typings.winrtUwp.global.Windows.Services.Store

import typings.winrtUwp.Windows.ApplicationModel.Package
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about a package for the current app that has an update available for download from the Windows Store. */
@JSGlobal("Windows.Services.Store.StorePackageUpdate")
@js.native
abstract class StorePackageUpdate ()
  extends typings.winrtUwp.Windows.Services.Store.StorePackageUpdate {
  /** Gets the package that has an update available for download from the Windows Store. */
  /* CompleteClass */
  @JSName("package")
  override var _package: Package = js.native
  /** Gets a value that indicates whether the package that has an update available for download from the Windows Store is a mandatory package, as specified by the developer in the Windows Dev Center dashboard. */
  /* CompleteClass */
  override var mandatory: Boolean = js.native
}


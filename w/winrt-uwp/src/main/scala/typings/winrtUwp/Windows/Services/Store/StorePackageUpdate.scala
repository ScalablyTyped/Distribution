package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.ApplicationModel.Package
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about a package for the current app that has an update available for download from the Windows Store. */
@js.native
trait StorePackageUpdate extends js.Object {
  /** Gets the package that has an update available for download from the Windows Store. */
  @JSName("package")
  var _package: Package = js.native
  /** Gets a value that indicates whether the package that has an update available for download from the Windows Store is a mandatory package, as specified by the developer in the Windows Dev Center dashboard. */
  var mandatory: Boolean = js.native
}

object StorePackageUpdate {
  @scala.inline
  def apply(_package: Package, mandatory: Boolean): StorePackageUpdate = {
    val __obj = js.Dynamic.literal(mandatory = mandatory.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePackageUpdate]
  }
  @scala.inline
  implicit class StorePackageUpdateOps[Self <: StorePackageUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_package(value: Package): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def setMandatory(value: Boolean): Self = this.set("mandatory", value.asInstanceOf[js.Any])
  }
  
}


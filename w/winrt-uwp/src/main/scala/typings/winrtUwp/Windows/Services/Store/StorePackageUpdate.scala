package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.ApplicationModel.Package
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides info about a package for the current app that has an update available for download from the Windows Store. */
@js.native
trait StorePackageUpdate extends StObject {
  
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
  implicit class StorePackageUpdateMutableBuilder[Self <: StorePackageUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_package(value: Package): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}

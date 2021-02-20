package typings.winrtUwp.Windows.Management.Deployment

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the users of an installed package. */
@js.native
trait PackageUserInformation extends StObject {
  
  /** Gets the install state of the package for the user. */
  var installState: PackageInstallState = js.native
  
  /** Gets the security identifier (SID) of the package user. */
  var userSecurityId: String = js.native
}
object PackageUserInformation {
  
  @scala.inline
  def apply(installState: PackageInstallState, userSecurityId: String): PackageUserInformation = {
    val __obj = js.Dynamic.literal(installState = installState.asInstanceOf[js.Any], userSecurityId = userSecurityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageUserInformation]
  }
  
  @scala.inline
  implicit class PackageUserInformationMutableBuilder[Self <: PackageUserInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstallState(value: PackageInstallState): Self = StObject.set(x, "installState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSecurityId(value: String): Self = StObject.set(x, "userSecurityId", value.asInstanceOf[js.Any])
  }
}

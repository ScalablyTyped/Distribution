package typings.winrtDashUwp.Windows.Management.Deployment

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RemovalOptions extends js.Object

/** Values that modify the removal of a package. */
@JSGlobal("Windows.Management.Deployment.RemovalOptions")
@js.native
object RemovalOptions extends js.Object {
  /** No removal options are specified. This is the default deployment behavior. */
  @js.native
  sealed trait none extends RemovalOptions
  
  /** Don't remove any application data when the package is removed. This can only apply to packages that were deployed with the DeploymentOptions::DevelopmentMode value. If you specify PreserveApplicationData on an incompatible package, PackageManager::RemovePackageAsync(String, RemovalOptions) returns E_INVALIDARG. */
  @js.native
  sealed trait preserveApplicationData extends RemovalOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RemovalOptions with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object preserveApplicationData extends TopLevel[preserveApplicationData with Double]
  
}


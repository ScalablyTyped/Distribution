package typings.winrtUwp.Windows.Management.Deployment

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RemovalOptions extends StObject
/** Values that modify the removal of a package. */
@JSGlobal("Windows.Management.Deployment.RemovalOptions")
@js.native
object RemovalOptions extends StObject {
  
  /** No removal options are specified. This is the default deployment behavior. */
  @js.native
  sealed trait none extends RemovalOptions
  
  /** Don't remove any application data when the package is removed. This can only apply to packages that were deployed with the DeploymentOptions::DevelopmentMode value. If you specify PreserveApplicationData on an incompatible package, PackageManager::RemovePackageAsync(String, RemovalOptions) returns E_INVALIDARG. */
  @js.native
  sealed trait preserveApplicationData extends RemovalOptions
}

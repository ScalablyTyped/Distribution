package typings.winrt.Windows.Management.Deployment

import typings.winrt.Windows.ApplicationModel.Package
import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPackageManager extends js.Object {
  
  def addPackageAsync(packageUri: Uri, dependencyPackageUris: IIterable[Uri], deploymentOptions: DeploymentOptions): IAsyncOperationWithProgress[DeploymentResult, DeploymentProgress] = js.native
  
  def cleanupPackageForUserAsync(packageName: String, userSecurityId: String): IAsyncOperationWithProgress[DeploymentResult, DeploymentProgress] = js.native
  
  def findPackage(packageFullName: String): Package = js.native
  
  def findPackageForUser(userSecurityId: String, packageFullName: String): Package = js.native
  
  def findPackages(): IIterable[Package] = js.native
  def findPackages(packageFamilyName: String): IIterable[Package] = js.native
  def findPackages(packageName: String, packagePublisher: String): IIterable[Package] = js.native
  
  def findPackagesForUser(userSecurityId: String): IIterable[Package] = js.native
  def findPackagesForUser(userSecurityId: String, packageFamilyName: String): IIterable[Package] = js.native
  def findPackagesForUser(userSecurityId: String, packageName: String, packagePublisher: String): IIterable[Package] = js.native
  
  def findUsers(packageFullName: String): IIterable[PackageUserInformation] = js.native
  
  def registerPackageAsync(manifestUri: Uri, dependencyPackageUris: IIterable[Uri], deploymentOptions: DeploymentOptions): IAsyncOperationWithProgress[DeploymentResult, DeploymentProgress] = js.native
  
  def removePackageAsync(packageFullName: String): IAsyncOperationWithProgress[DeploymentResult, DeploymentProgress] = js.native
  
  def setPackageState(packageFullName: String, packageState: PackageState): Unit = js.native
  
  def stagePackageAsync(packageUri: Uri, dependencyPackageUris: IIterable[Uri]): IAsyncOperationWithProgress[DeploymentResult, DeploymentProgress] = js.native
  
  def updatePackageAsync(packageUri: Uri, dependencyPackageUris: IIterable[Uri], deploymentOptions: DeploymentOptions): IAsyncOperationWithProgress[DeploymentResult, DeploymentProgress] = js.native
}

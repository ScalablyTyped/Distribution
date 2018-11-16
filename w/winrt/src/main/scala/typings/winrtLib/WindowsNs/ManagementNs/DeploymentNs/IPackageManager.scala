package typings
package winrtLib.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPackageManager extends js.Object {
  def addPackageAsync(
    packageUri: winrtLib.WindowsNs.FoundationNs.Uri,
    dependencyPackageUris: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.FoundationNs.Uri],
    deploymentOptions: DeploymentOptions
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[DeploymentResult, DeploymentProgress] = js.native
  def cleanupPackageForUserAsync(packageName: java.lang.String, userSecurityId: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[DeploymentResult, DeploymentProgress] = js.native
  def findPackage(packageFullName: java.lang.String): winrtLib.WindowsNs.ApplicationModelNs.Package = js.native
  def findPackageForUser(userSecurityId: java.lang.String, packageFullName: java.lang.String): winrtLib.WindowsNs.ApplicationModelNs.Package = js.native
  def findPackages(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.ApplicationModelNs.Package] = js.native
  def findPackages(packageFamilyName: java.lang.String): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.ApplicationModelNs.Package] = js.native
  def findPackages(packageName: java.lang.String, packagePublisher: java.lang.String): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.ApplicationModelNs.Package] = js.native
  def findPackagesForUser(userSecurityId: java.lang.String): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.ApplicationModelNs.Package] = js.native
  def findPackagesForUser(userSecurityId: java.lang.String, packageFamilyName: java.lang.String): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.ApplicationModelNs.Package] = js.native
  def findPackagesForUser(
    userSecurityId: java.lang.String,
    packageName: java.lang.String,
    packagePublisher: java.lang.String
  ): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.ApplicationModelNs.Package] = js.native
  def findUsers(packageFullName: java.lang.String): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[PackageUserInformation] = js.native
  def registerPackageAsync(
    manifestUri: winrtLib.WindowsNs.FoundationNs.Uri,
    dependencyPackageUris: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.FoundationNs.Uri],
    deploymentOptions: DeploymentOptions
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[DeploymentResult, DeploymentProgress] = js.native
  def removePackageAsync(packageFullName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[DeploymentResult, DeploymentProgress] = js.native
  def setPackageState(packageFullName: java.lang.String, packageState: PackageState): scala.Unit = js.native
  def stagePackageAsync(
    packageUri: winrtLib.WindowsNs.FoundationNs.Uri,
    dependencyPackageUris: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.FoundationNs.Uri]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[DeploymentResult, DeploymentProgress] = js.native
  def updatePackageAsync(
    packageUri: winrtLib.WindowsNs.FoundationNs.Uri,
    dependencyPackageUris: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.FoundationNs.Uri],
    deploymentOptions: DeploymentOptions
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[DeploymentResult, DeploymentProgress] = js.native
}


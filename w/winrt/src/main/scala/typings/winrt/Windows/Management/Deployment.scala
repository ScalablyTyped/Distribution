package typings.winrt.Windows.Management

import typings.winrt.Windows.ApplicationModel.Package
import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Deployment {
  
  @js.native
  sealed trait DeploymentOptions extends StObject
  @JSGlobal("Windows.Management.Deployment.DeploymentOptions")
  @js.native
  object DeploymentOptions extends StObject {
    
    @js.native
    sealed trait developmentMode
      extends StObject
         with DeploymentOptions
    
    @js.native
    sealed trait forceApplicationShutdown
      extends StObject
         with DeploymentOptions
    
    @js.native
    sealed trait none
      extends StObject
         with DeploymentOptions
  }
  
  @js.native
  sealed trait DeploymentProgressState extends StObject
  @JSGlobal("Windows.Management.Deployment.DeploymentProgressState")
  @js.native
  object DeploymentProgressState extends StObject {
    
    @js.native
    sealed trait processing
      extends StObject
         with DeploymentProgressState
    
    @js.native
    sealed trait queued
      extends StObject
         with DeploymentProgressState
  }
  
  @js.native
  sealed trait PackageInstallState extends StObject
  @JSGlobal("Windows.Management.Deployment.PackageInstallState")
  @js.native
  object PackageInstallState extends StObject {
    
    @js.native
    sealed trait installed
      extends StObject
         with PackageInstallState
    
    @js.native
    sealed trait notInstalled
      extends StObject
         with PackageInstallState
    
    @js.native
    sealed trait staged
      extends StObject
         with PackageInstallState
  }
  
  @js.native
  sealed trait PackageState extends StObject
  @JSGlobal("Windows.Management.Deployment.PackageState")
  @js.native
  object PackageState extends StObject {
    
    @js.native
    sealed trait licenseInvalid
      extends StObject
         with PackageState
    
    @js.native
    sealed trait modified
      extends StObject
         with PackageState
    
    @js.native
    sealed trait normal
      extends StObject
         with PackageState
    
    @js.native
    sealed trait tampered
      extends StObject
         with PackageState
  }
  
  trait DeploymentProgress extends StObject {
    
    var percentage: Double
    
    var state: DeploymentProgressState
  }
  object DeploymentProgress {
    
    inline def apply(percentage: Double, state: DeploymentProgressState): DeploymentProgress = {
      val __obj = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentProgress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeploymentProgress] (val x: Self) extends AnyVal {
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setState(value: DeploymentProgressState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeploymentResult
    extends StObject
       with IDeploymentResult
  object DeploymentResult {
    
    inline def apply(activityId: String, errorText: String, extendedErrorCode: Double): DeploymentResult = {
      val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], extendedErrorCode = extendedErrorCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentResult]
    }
  }
  
  trait IDeploymentResult extends StObject {
    
    var activityId: String
    
    var errorText: String
    
    var extendedErrorCode: Double
  }
  object IDeploymentResult {
    
    inline def apply(activityId: String, errorText: String, extendedErrorCode: Double): IDeploymentResult = {
      val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], extendedErrorCode = extendedErrorCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDeploymentResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDeploymentResult] (val x: Self) extends AnyVal {
      
      inline def setActivityId(value: String): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
      
      inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
      
      inline def setExtendedErrorCode(value: Double): Self = StObject.set(x, "extendedErrorCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPackageManager extends StObject {
    
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
  
  trait IPackageUserInformation extends StObject {
    
    var installState: PackageInstallState
    
    var userSecurityId: String
  }
  object IPackageUserInformation {
    
    inline def apply(installState: PackageInstallState, userSecurityId: String): IPackageUserInformation = {
      val __obj = js.Dynamic.literal(installState = installState.asInstanceOf[js.Any], userSecurityId = userSecurityId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPackageUserInformation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPackageUserInformation] (val x: Self) extends AnyVal {
      
      inline def setInstallState(value: PackageInstallState): Self = StObject.set(x, "installState", value.asInstanceOf[js.Any])
      
      inline def setUserSecurityId(value: String): Self = StObject.set(x, "userSecurityId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PackageManager
    extends StObject
       with IPackageManager
  
  trait PackageUserInformation
    extends StObject
       with IPackageUserInformation
  object PackageUserInformation {
    
    inline def apply(installState: PackageInstallState, userSecurityId: String): PackageUserInformation = {
      val __obj = js.Dynamic.literal(installState = installState.asInstanceOf[js.Any], userSecurityId = userSecurityId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageUserInformation]
    }
  }
}

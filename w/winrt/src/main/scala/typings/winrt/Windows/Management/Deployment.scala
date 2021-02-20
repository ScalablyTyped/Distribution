package typings.winrt.Windows.Management

import typings.winrt.Windows.ApplicationModel.Package
import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Deployment {
  
  @js.native
  sealed trait DeploymentOptions extends StObject
  @JSGlobal("Windows.Management.Deployment.DeploymentOptions")
  @js.native
  object DeploymentOptions extends StObject {
    
    @js.native
    sealed trait developmentMode extends DeploymentOptions
    
    @js.native
    sealed trait forceApplicationShutdown extends DeploymentOptions
    
    @js.native
    sealed trait none extends DeploymentOptions
  }
  
  @js.native
  sealed trait DeploymentProgressState extends StObject
  @JSGlobal("Windows.Management.Deployment.DeploymentProgressState")
  @js.native
  object DeploymentProgressState extends StObject {
    
    @js.native
    sealed trait processing extends DeploymentProgressState
    
    @js.native
    sealed trait queued extends DeploymentProgressState
  }
  
  @js.native
  sealed trait PackageInstallState extends StObject
  @JSGlobal("Windows.Management.Deployment.PackageInstallState")
  @js.native
  object PackageInstallState extends StObject {
    
    @js.native
    sealed trait installed extends PackageInstallState
    
    @js.native
    sealed trait notInstalled extends PackageInstallState
    
    @js.native
    sealed trait staged extends PackageInstallState
  }
  
  @js.native
  sealed trait PackageState extends StObject
  @JSGlobal("Windows.Management.Deployment.PackageState")
  @js.native
  object PackageState extends StObject {
    
    @js.native
    sealed trait licenseInvalid extends PackageState
    
    @js.native
    sealed trait modified extends PackageState
    
    @js.native
    sealed trait normal extends PackageState
    
    @js.native
    sealed trait tampered extends PackageState
  }
  
  @js.native
  trait DeploymentProgress extends StObject {
    
    var percentage: Double = js.native
    
    var state: DeploymentProgressState = js.native
  }
  object DeploymentProgress {
    
    @scala.inline
    def apply(percentage: Double, state: DeploymentProgressState): DeploymentProgress = {
      val __obj = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentProgress]
    }
    
    @scala.inline
    implicit class DeploymentProgressMutableBuilder[Self <: DeploymentProgress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: DeploymentProgressState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeploymentResult extends IDeploymentResult
  object DeploymentResult {
    
    @scala.inline
    def apply(activityId: String, errorText: String, extendedErrorCode: Double): DeploymentResult = {
      val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], extendedErrorCode = extendedErrorCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeploymentResult]
    }
  }
  
  @js.native
  trait IDeploymentResult extends StObject {
    
    var activityId: String = js.native
    
    var errorText: String = js.native
    
    var extendedErrorCode: Double = js.native
  }
  object IDeploymentResult {
    
    @scala.inline
    def apply(activityId: String, errorText: String, extendedErrorCode: Double): IDeploymentResult = {
      val __obj = js.Dynamic.literal(activityId = activityId.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], extendedErrorCode = extendedErrorCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDeploymentResult]
    }
    
    @scala.inline
    implicit class IDeploymentResultMutableBuilder[Self <: IDeploymentResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivityId(value: String): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedErrorCode(value: Double): Self = StObject.set(x, "extendedErrorCode", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait IPackageUserInformation extends StObject {
    
    var installState: PackageInstallState = js.native
    
    var userSecurityId: String = js.native
  }
  object IPackageUserInformation {
    
    @scala.inline
    def apply(installState: PackageInstallState, userSecurityId: String): IPackageUserInformation = {
      val __obj = js.Dynamic.literal(installState = installState.asInstanceOf[js.Any], userSecurityId = userSecurityId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPackageUserInformation]
    }
    
    @scala.inline
    implicit class IPackageUserInformationMutableBuilder[Self <: IPackageUserInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstallState(value: PackageInstallState): Self = StObject.set(x, "installState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserSecurityId(value: String): Self = StObject.set(x, "userSecurityId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PackageManager extends IPackageManager
  
  @js.native
  trait PackageUserInformation extends IPackageUserInformation
  object PackageUserInformation {
    
    @scala.inline
    def apply(installState: PackageInstallState, userSecurityId: String): PackageUserInformation = {
      val __obj = js.Dynamic.literal(installState = installState.asInstanceOf[js.Any], userSecurityId = userSecurityId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageUserInformation]
    }
  }
}

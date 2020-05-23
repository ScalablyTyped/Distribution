package typings.winrt.global.Windows

import typings.winrt.Windows.Management.Core.IApplicationDataManager
import typings.winrt.Windows.Management.Deployment.PackageInstallState
import typings.winrt.Windows.Storage.ApplicationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Management")
@js.native
object Management extends js.Object {
  @js.native
  object Core extends js.Object {
    @js.native
    class ApplicationDataManager () extends IApplicationDataManager
    
    /* static members */
    @js.native
    object ApplicationDataManager extends js.Object {
      def createForPackageFamily(packageFamilyName: String): ApplicationData = js.native
    }
    
  }
  
  @js.native
  object Deployment extends js.Object {
    @js.native
    class DeploymentResult ()
      extends typings.winrt.Windows.Management.Deployment.DeploymentResult {
      /* CompleteClass */
      override var activityId: String = js.native
      /* CompleteClass */
      override var errorText: String = js.native
      /* CompleteClass */
      override var extendedErrorCode: Double = js.native
    }
    
    @js.native
    class PackageManager ()
      extends typings.winrt.Windows.Management.Deployment.PackageManager
    
    @js.native
    class PackageUserInformation ()
      extends typings.winrt.Windows.Management.Deployment.PackageUserInformation {
      /* CompleteClass */
      override var installState: PackageInstallState = js.native
      /* CompleteClass */
      override var userSecurityId: String = js.native
    }
    
    @js.native
    object DeploymentOptions extends js.Object {
      /* 2 */ val developmentMode: typings.winrt.Windows.Management.Deployment.DeploymentOptions.developmentMode with Double = js.native
      /* 1 */ val forceApplicationShutdown: typings.winrt.Windows.Management.Deployment.DeploymentOptions.forceApplicationShutdown with Double = js.native
      /* 0 */ val none: typings.winrt.Windows.Management.Deployment.DeploymentOptions.none with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Management.Deployment.DeploymentOptions with Double] = js.native
    }
    
    @js.native
    object DeploymentProgressState extends js.Object {
      /* 1 */ val processing: typings.winrt.Windows.Management.Deployment.DeploymentProgressState.processing with Double = js.native
      /* 0 */ val queued: typings.winrt.Windows.Management.Deployment.DeploymentProgressState.queued with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Management.Deployment.DeploymentProgressState with Double] = js.native
    }
    
    @js.native
    object PackageInstallState extends js.Object {
      /* 2 */ val installed: typings.winrt.Windows.Management.Deployment.PackageInstallState.installed with Double = js.native
      /* 0 */ val notInstalled: typings.winrt.Windows.Management.Deployment.PackageInstallState.notInstalled with Double = js.native
      /* 1 */ val staged: typings.winrt.Windows.Management.Deployment.PackageInstallState.staged with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Management.Deployment.PackageInstallState with Double] = js.native
    }
    
    @js.native
    object PackageState extends js.Object {
      /* 1 */ val licenseInvalid: typings.winrt.Windows.Management.Deployment.PackageState.licenseInvalid with Double = js.native
      /* 2 */ val modified: typings.winrt.Windows.Management.Deployment.PackageState.modified with Double = js.native
      /* 0 */ val normal: typings.winrt.Windows.Management.Deployment.PackageState.normal with Double = js.native
      /* 3 */ val tampered: typings.winrt.Windows.Management.Deployment.PackageState.tampered with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Management.Deployment.PackageState with Double] = js.native
    }
    
  }
  
}


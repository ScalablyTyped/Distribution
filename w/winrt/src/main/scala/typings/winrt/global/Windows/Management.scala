package typings.winrt.global.Windows

import typings.winrt.Windows.Management.Core.IApplicationDataManager
import typings.winrt.Windows.Management.Deployment.PackageInstallState
import typings.winrt.Windows.Storage.ApplicationData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Management {
  
  object Core {
    
    @JSGlobal("Windows.Management.Core.ApplicationDataManager")
    @js.native
    open class ApplicationDataManager ()
      extends StObject
         with IApplicationDataManager
    /* static members */
    object ApplicationDataManager {
      
      @JSGlobal("Windows.Management.Core.ApplicationDataManager")
      @js.native
      val ^ : js.Any = js.native
      
      inline def createForPackageFamily(packageFamilyName: String): ApplicationData = ^.asInstanceOf[js.Dynamic].applyDynamic("createForPackageFamily")(packageFamilyName.asInstanceOf[js.Any]).asInstanceOf[ApplicationData]
    }
  }
  
  object Deployment {
    
    @JSGlobal("Windows.Management.Deployment.DeploymentOptions")
    @js.native
    object DeploymentOptions extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Management.Deployment.DeploymentOptions & Double] = js.native
      
      /* 2 */ val developmentMode: typings.winrt.Windows.Management.Deployment.DeploymentOptions.developmentMode & Double = js.native
      
      /* 1 */ val forceApplicationShutdown: typings.winrt.Windows.Management.Deployment.DeploymentOptions.forceApplicationShutdown & Double = js.native
      
      /* 0 */ val none: typings.winrt.Windows.Management.Deployment.DeploymentOptions.none & Double = js.native
    }
    
    @JSGlobal("Windows.Management.Deployment.DeploymentProgressState")
    @js.native
    object DeploymentProgressState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Management.Deployment.DeploymentProgressState & Double] = js.native
      
      /* 1 */ val processing: typings.winrt.Windows.Management.Deployment.DeploymentProgressState.processing & Double = js.native
      
      /* 0 */ val queued: typings.winrt.Windows.Management.Deployment.DeploymentProgressState.queued & Double = js.native
    }
    
    @JSGlobal("Windows.Management.Deployment.DeploymentResult")
    @js.native
    open class DeploymentResult ()
      extends StObject
         with typings.winrt.Windows.Management.Deployment.DeploymentResult {
      
      /* CompleteClass */
      var activityId: String = js.native
      
      /* CompleteClass */
      var errorText: String = js.native
      
      /* CompleteClass */
      var extendedErrorCode: Double = js.native
    }
    
    @JSGlobal("Windows.Management.Deployment.PackageInstallState")
    @js.native
    object PackageInstallState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Management.Deployment.PackageInstallState & Double] = js.native
      
      /* 2 */ val installed: typings.winrt.Windows.Management.Deployment.PackageInstallState.installed & Double = js.native
      
      /* 0 */ val notInstalled: typings.winrt.Windows.Management.Deployment.PackageInstallState.notInstalled & Double = js.native
      
      /* 1 */ val staged: typings.winrt.Windows.Management.Deployment.PackageInstallState.staged & Double = js.native
    }
    
    @JSGlobal("Windows.Management.Deployment.PackageManager")
    @js.native
    open class PackageManager ()
      extends StObject
         with typings.winrt.Windows.Management.Deployment.PackageManager
    
    @JSGlobal("Windows.Management.Deployment.PackageState")
    @js.native
    object PackageState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Management.Deployment.PackageState & Double] = js.native
      
      /* 1 */ val licenseInvalid: typings.winrt.Windows.Management.Deployment.PackageState.licenseInvalid & Double = js.native
      
      /* 2 */ val modified: typings.winrt.Windows.Management.Deployment.PackageState.modified & Double = js.native
      
      /* 0 */ val normal: typings.winrt.Windows.Management.Deployment.PackageState.normal & Double = js.native
      
      /* 3 */ val tampered: typings.winrt.Windows.Management.Deployment.PackageState.tampered & Double = js.native
    }
    
    @JSGlobal("Windows.Management.Deployment.PackageUserInformation")
    @js.native
    open class PackageUserInformation ()
      extends StObject
         with typings.winrt.Windows.Management.Deployment.PackageUserInformation {
      
      /* CompleteClass */
      var installState: PackageInstallState = js.native
      
      /* CompleteClass */
      var userSecurityId: String = js.native
    }
  }
}

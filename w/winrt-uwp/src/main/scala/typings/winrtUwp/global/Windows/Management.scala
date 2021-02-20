package typings.winrtUwp.global.Windows

import typings.winrtUwp.Windows.Storage.ApplicationData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Management {
  
  object Core {
    
    /** Enables you to access and manage the app data store for a package family. */
    @JSGlobal("Windows.Management.Core.ApplicationDataManager")
    @js.native
    abstract class ApplicationDataManager ()
      extends typings.winrtUwp.Windows.Management.Core.ApplicationDataManager
    object ApplicationDataManager {
      
      /**
        * Provides access to the app data store for the specified package family.
        * @param packageFamilyName The package family name.
        * @return The app data store.
        */
      /* static member */
      @JSGlobal("Windows.Management.Core.ApplicationDataManager.createForPackageFamily")
      @js.native
      def createForPackageFamily(packageFamilyName: String): ApplicationData = js.native
    }
  }
  
  /** Provides functionality for managing app packages. */
  object Deployment {
    
    /** Specifies the package deployment options. */
    @JSGlobal("Windows.Management.Deployment.DeploymentOptions")
    @js.native
    object DeploymentOptions extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions with Double] = js.native
      
      /* 2 */ val developmentMode: typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions.developmentMode with Double = js.native
      
      /* 1 */ val forceApplicationShutdown: typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions.forceApplicationShutdown with Double = js.native
      
      /* 4 */ val forceTargetApplicationShutdown: typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions.forceTargetApplicationShutdown with Double = js.native
      
      /* 3 */ val installAllResources: typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions.installAllResources with Double = js.native
      
      /* 0 */ val none: typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions.none with Double = js.native
    }
    
    /** Represents the state of a deployment request. */
    @JSGlobal("Windows.Management.Deployment.DeploymentProgressState")
    @js.native
    object DeploymentProgressState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Management.Deployment.DeploymentProgressState with Double
          ] = js.native
      
      /* 1 */ val processing: typings.winrtUwp.Windows.Management.Deployment.DeploymentProgressState.processing with Double = js.native
      
      /* 0 */ val queued: typings.winrtUwp.Windows.Management.Deployment.DeploymentProgressState.queued with Double = js.native
    }
    
    /** Provides the result of a deployment request. */
    @JSGlobal("Windows.Management.Deployment.DeploymentResult")
    @js.native
    abstract class DeploymentResult ()
      extends typings.winrtUwp.Windows.Management.Deployment.DeploymentResult
    
    /** Represents the install state of the package. */
    @JSGlobal("Windows.Management.Deployment.PackageInstallState")
    @js.native
    object PackageInstallState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.PackageInstallState with Double] = js.native
      
      /* 2 */ val installed: typings.winrtUwp.Windows.Management.Deployment.PackageInstallState.installed with Double = js.native
      
      /* 0 */ val notInstalled: typings.winrtUwp.Windows.Management.Deployment.PackageInstallState.notInstalled with Double = js.native
      
      /* 3 */ val paused: typings.winrtUwp.Windows.Management.Deployment.PackageInstallState.paused with Double = js.native
      
      /* 1 */ val staged: typings.winrtUwp.Windows.Management.Deployment.PackageInstallState.staged with Double = js.native
    }
    
    /** Represents the state of the package. */
    @JSGlobal("Windows.Management.Deployment.PackageState")
    @js.native
    object PackageState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.PackageState with Double] = js.native
      
      /* 1 */ val licenseInvalid: typings.winrtUwp.Windows.Management.Deployment.PackageState.licenseInvalid with Double = js.native
      
      /* 2 */ val modified: typings.winrtUwp.Windows.Management.Deployment.PackageState.modified with Double = js.native
      
      /* 0 */ val normal: typings.winrtUwp.Windows.Management.Deployment.PackageState.normal with Double = js.native
      
      /* 3 */ val tampered: typings.winrtUwp.Windows.Management.Deployment.PackageState.tampered with Double = js.native
    }
    
    /** Provides info about the status of a package. */
    @JSGlobal("Windows.Management.Deployment.PackageStatus")
    @js.native
    object PackageStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.PackageStatus with Double] = js.native
      
      /* 4 */ val disabled: typings.winrtUwp.Windows.Management.Deployment.PackageStatus.disabled with Double = js.native
      
      /* 1 */ val licenseIssue: typings.winrtUwp.Windows.Management.Deployment.PackageStatus.licenseIssue with Double = js.native
      
      /* 2 */ val modified: typings.winrtUwp.Windows.Management.Deployment.PackageStatus.modified with Double = js.native
      
      /* 0 */ val ok: typings.winrtUwp.Windows.Management.Deployment.PackageStatus.ok with Double = js.native
      
      /* 3 */ val tampered: typings.winrtUwp.Windows.Management.Deployment.PackageStatus.tampered with Double = js.native
    }
    
    /** Defines the types of packages to be included in the result set of a query. */
    @JSGlobal("Windows.Management.Deployment.PackageTypes")
    @js.native
    object PackageTypes extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.PackageTypes with Double] = js.native
      
      /* 4 */ val bundle: typings.winrtUwp.Windows.Management.Deployment.PackageTypes.bundle with Double = js.native
      
      /* 2 */ val framework: typings.winrtUwp.Windows.Management.Deployment.PackageTypes.framework with Double = js.native
      
      /* 1 */ val main: typings.winrtUwp.Windows.Management.Deployment.PackageTypes.main with Double = js.native
      
      /* 0 */ val none: typings.winrtUwp.Windows.Management.Deployment.PackageTypes.none with Double = js.native
      
      /* 3 */ val resource: typings.winrtUwp.Windows.Management.Deployment.PackageTypes.resource with Double = js.native
      
      /* 5 */ val xap: typings.winrtUwp.Windows.Management.Deployment.PackageTypes.xap with Double = js.native
    }
    
    /** Provides information about the users of an installed package. */
    @JSGlobal("Windows.Management.Deployment.PackageUserInformation")
    @js.native
    abstract class PackageUserInformation ()
      extends typings.winrtUwp.Windows.Management.Deployment.PackageUserInformation
    
    /** Represents a package storage volume. */
    @JSGlobal("Windows.Management.Deployment.PackageVolume")
    @js.native
    /** Initializes a new instance of the PackageVolume class. */
    class PackageVolume ()
      extends typings.winrtUwp.Windows.Management.Deployment.PackageVolume
    
    object Preview {
      
      @JSGlobal("Windows.Management.Deployment.Preview.ClassicAppManager")
      @js.native
      abstract class ClassicAppManager ()
        extends typings.winrtUwp.Windows.Management.Deployment.Preview.ClassicAppManager
      object ClassicAppManager {
        
        @JSGlobal("Windows.Management.Deployment.Preview.ClassicAppManager")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("Windows.Management.Deployment.Preview.ClassicAppManager.findInstalledApp")
        @js.native
        def findInstalledApp: js.Any = js.native
        @scala.inline
        def findInstalledApp_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findInstalledApp")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("Windows.Management.Deployment.Preview.InstalledClassicAppInfo")
      @js.native
      abstract class InstalledClassicAppInfo ()
        extends typings.winrtUwp.Windows.Management.Deployment.Preview.InstalledClassicAppInfo
    }
    
    /** Values that modify the removal of a package. */
    @JSGlobal("Windows.Management.Deployment.RemovalOptions")
    @js.native
    object RemovalOptions extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.RemovalOptions with Double] = js.native
      
      /* 0 */ val none: typings.winrtUwp.Windows.Management.Deployment.RemovalOptions.none with Double = js.native
      
      /* 1 */ val preserveApplicationData: typings.winrtUwp.Windows.Management.Deployment.RemovalOptions.preserveApplicationData with Double = js.native
    }
  }
  
  object Orchestration {
    
    @JSGlobal("Windows.Management.Orchestration.CurrentAppOrchestration")
    @js.native
    abstract class CurrentAppOrchestration ()
      extends typings.winrtUwp.Windows.Management.Orchestration.CurrentAppOrchestration
    object CurrentAppOrchestration {
      
      @JSGlobal("Windows.Management.Orchestration.CurrentAppOrchestration")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Windows.Management.Orchestration.CurrentAppOrchestration.getForCurrentView")
      @js.native
      def getForCurrentView: js.Any = js.native
      @scala.inline
      def getForCurrentView_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getForCurrentView")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Windows.Management.Orchestration.SingleAppModeContext")
    @js.native
    abstract class SingleAppModeContext ()
      extends typings.winrtUwp.Windows.Management.Orchestration.SingleAppModeContext
  }
  
  /** Provides functionality for managing apps in an enterprise. */
  object Workplace {
    
    /** MDM (Mobile Device Management) policy. */
    @JSGlobal("Windows.Management.Workplace.MdmPolicy")
    @js.native
    abstract class MdmPolicy ()
      extends typings.winrtUwp.Windows.Management.Workplace.MdmPolicy
    object MdmPolicy {
      
      /**
        * Returns true if a browser is allowed.
        * @return true if a browser is allowed.
        */
      /* static member */
      @JSGlobal("Windows.Management.Workplace.MdmPolicy.isBrowserAllowed")
      @js.native
      def isBrowserAllowed(): Boolean = js.native
      
      /**
        * Returns true if a camera is allowed.
        * @return true if a camera is allowed.
        */
      /* static member */
      @JSGlobal("Windows.Management.Workplace.MdmPolicy.isCameraAllowed")
      @js.native
      def isCameraAllowed(): Boolean = js.native
      
      /**
        * Returns true if a Microsoft Account is allowed.
        * @return true if a Microsoft Account is allowed.
        */
      /* static member */
      @JSGlobal("Windows.Management.Workplace.MdmPolicy.isMicrosoftAccountAllowed")
      @js.native
      def isMicrosoftAccountAllowed(): Boolean = js.native
      
      /**
        * Returns true if a Store is allowed.
        * @return true if a Store is allowed.
        */
      /* static member */
      @JSGlobal("Windows.Management.Workplace.MdmPolicy.isStoreAllowed")
      @js.native
      def isStoreAllowed(): Boolean = js.native
    }
    
    /** Enables Windows Store apps to access select enterprise settings that are managed through group policy or other management services. */
    @JSGlobal("Windows.Management.Workplace.WorkplaceSettings")
    @js.native
    abstract class WorkplaceSettings ()
      extends typings.winrtUwp.Windows.Management.Workplace.WorkplaceSettings
    object WorkplaceSettings {
      
      @JSGlobal("Windows.Management.Workplace.WorkplaceSettings")
      @js.native
      val ^ : js.Any = js.native
      
      /** Gets a value that indicates whether an enterprise ID can be used instead of a Microsoft account. */
      /* static member */
      @JSGlobal("Windows.Management.Workplace.WorkplaceSettings.isMicrosoftAccountOptional")
      @js.native
      def isMicrosoftAccountOptional: Boolean = js.native
      @scala.inline
      def isMicrosoftAccountOptional_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMicrosoftAccountOptional")(x.asInstanceOf[js.Any])
    }
  }
}

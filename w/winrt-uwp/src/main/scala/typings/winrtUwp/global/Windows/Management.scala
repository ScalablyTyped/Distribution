package typings.winrtUwp.global.Windows

import typings.winrtUwp.Windows.Management.Deployment.PackageInstallState
import typings.winrtUwp.Windows.Storage.ApplicationData
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Management {
  
  object Core {
    
    /** Enables you to access and manage the app data store for a package family. */
    @JSGlobal("Windows.Management.Core.ApplicationDataManager")
    @js.native
    abstract class ApplicationDataManager ()
      extends StObject
         with typings.winrtUwp.Windows.Management.Core.ApplicationDataManager
    object ApplicationDataManager {
      
      @JSGlobal("Windows.Management.Core.ApplicationDataManager")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Provides access to the app data store for the specified package family.
        * @param packageFamilyName The package family name.
        * @return The app data store.
        */
      /* static member */
      inline def createForPackageFamily(packageFamilyName: String): ApplicationData = ^.asInstanceOf[js.Dynamic].applyDynamic("createForPackageFamily")(packageFamilyName.asInstanceOf[js.Any]).asInstanceOf[ApplicationData]
    }
  }
  
  /** Provides functionality for managing app packages. */
  object Deployment {
    
    /** Specifies the package deployment options. */
    @JSGlobal("Windows.Management.Deployment.DeploymentOptions")
    @js.native
    object DeploymentOptions extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions & Double] = js.native
      
      /* 2 */ val developmentMode: typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions.developmentMode & Double = js.native
      
      /* 1 */ val forceApplicationShutdown: typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions.forceApplicationShutdown & Double = js.native
      
      /* 4 */ val forceTargetApplicationShutdown: typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions.forceTargetApplicationShutdown & Double = js.native
      
      /* 3 */ val installAllResources: typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions.installAllResources & Double = js.native
      
      /* 0 */ val none: typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions.none & Double = js.native
    }
    
    /** Represents the state of a deployment request. */
    @JSGlobal("Windows.Management.Deployment.DeploymentProgressState")
    @js.native
    object DeploymentProgressState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.DeploymentProgressState & Double] = js.native
      
      /* 1 */ val processing: typings.winrtUwp.Windows.Management.Deployment.DeploymentProgressState.processing & Double = js.native
      
      /* 0 */ val queued: typings.winrtUwp.Windows.Management.Deployment.DeploymentProgressState.queued & Double = js.native
    }
    
    /** Provides the result of a deployment request. */
    @JSGlobal("Windows.Management.Deployment.DeploymentResult")
    @js.native
    abstract class DeploymentResult ()
      extends StObject
         with typings.winrtUwp.Windows.Management.Deployment.DeploymentResult {
      
      /** Gets the activity identifier used to look up an event in Windows Event Viewer. Gets the activity identifier used to look up an event. All events of a deployment operation are logged with the same activityId. */
      /* CompleteClass */
      var activityId: String = js.native
      
      /** Gets extended error text for the error if the deployment operation is not successful. */
      /* CompleteClass */
      var errorText: String = js.native
      
      /** The extended error code can be used to distinguish a specific error condition which needs to be handled differently from the general error indicated by the return code. The extended error code may provide a more specific reason for the failure that caused the general error. Also, it usually corresponds directly to the specific message in the ErrorText . */
      /* CompleteClass */
      var extendedErrorCode: WinRTError = js.native
    }
    
    /** Represents the install state of the package. */
    @JSGlobal("Windows.Management.Deployment.PackageInstallState")
    @js.native
    object PackageInstallState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.PackageInstallState & Double] = js.native
      
      /* 2 */ val installed: typings.winrtUwp.Windows.Management.Deployment.PackageInstallState.installed & Double = js.native
      
      /* 0 */ val notInstalled: typings.winrtUwp.Windows.Management.Deployment.PackageInstallState.notInstalled & Double = js.native
      
      /* 3 */ val paused: typings.winrtUwp.Windows.Management.Deployment.PackageInstallState.paused & Double = js.native
      
      /* 1 */ val staged: typings.winrtUwp.Windows.Management.Deployment.PackageInstallState.staged & Double = js.native
    }
    
    /** Represents the state of the package. */
    @JSGlobal("Windows.Management.Deployment.PackageState")
    @js.native
    object PackageState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.PackageState & Double] = js.native
      
      /* 1 */ val licenseInvalid: typings.winrtUwp.Windows.Management.Deployment.PackageState.licenseInvalid & Double = js.native
      
      /* 2 */ val modified: typings.winrtUwp.Windows.Management.Deployment.PackageState.modified & Double = js.native
      
      /* 0 */ val normal: typings.winrtUwp.Windows.Management.Deployment.PackageState.normal & Double = js.native
      
      /* 3 */ val tampered: typings.winrtUwp.Windows.Management.Deployment.PackageState.tampered & Double = js.native
    }
    
    /** Provides info about the status of a package. */
    @JSGlobal("Windows.Management.Deployment.PackageStatus")
    @js.native
    object PackageStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.PackageStatus & Double] = js.native
      
      /* 4 */ val disabled: typings.winrtUwp.Windows.Management.Deployment.PackageStatus.disabled & Double = js.native
      
      /* 1 */ val licenseIssue: typings.winrtUwp.Windows.Management.Deployment.PackageStatus.licenseIssue & Double = js.native
      
      /* 2 */ val modified: typings.winrtUwp.Windows.Management.Deployment.PackageStatus.modified & Double = js.native
      
      /* 0 */ val ok: typings.winrtUwp.Windows.Management.Deployment.PackageStatus.ok & Double = js.native
      
      /* 3 */ val tampered: typings.winrtUwp.Windows.Management.Deployment.PackageStatus.tampered & Double = js.native
    }
    
    /** Defines the types of packages to be included in the result set of a query. */
    @JSGlobal("Windows.Management.Deployment.PackageTypes")
    @js.native
    object PackageTypes extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.PackageTypes & Double] = js.native
      
      /* 4 */ val bundle: typings.winrtUwp.Windows.Management.Deployment.PackageTypes.bundle & Double = js.native
      
      /* 2 */ val framework: typings.winrtUwp.Windows.Management.Deployment.PackageTypes.framework & Double = js.native
      
      /* 1 */ val main: typings.winrtUwp.Windows.Management.Deployment.PackageTypes.main & Double = js.native
      
      /* 0 */ val none: typings.winrtUwp.Windows.Management.Deployment.PackageTypes.none & Double = js.native
      
      /* 3 */ val resource: typings.winrtUwp.Windows.Management.Deployment.PackageTypes.resource & Double = js.native
      
      /* 5 */ val xap: typings.winrtUwp.Windows.Management.Deployment.PackageTypes.xap & Double = js.native
    }
    
    /** Provides information about the users of an installed package. */
    @JSGlobal("Windows.Management.Deployment.PackageUserInformation")
    @js.native
    abstract class PackageUserInformation ()
      extends StObject
         with typings.winrtUwp.Windows.Management.Deployment.PackageUserInformation {
      
      /** Gets the install state of the package for the user. */
      /* CompleteClass */
      var installState: PackageInstallState = js.native
      
      /** Gets the security identifier (SID) of the package user. */
      /* CompleteClass */
      var userSecurityId: String = js.native
    }
    
    /** Represents a package storage volume. */
    @JSGlobal("Windows.Management.Deployment.PackageVolume")
    @js.native
    /** Initializes a new instance of the PackageVolume class. */
    class PackageVolume ()
      extends StObject
         with typings.winrtUwp.Windows.Management.Deployment.PackageVolume
    
    object Preview {
      
      @JSGlobal("Windows.Management.Deployment.Preview.ClassicAppManager")
      @js.native
      abstract class ClassicAppManager ()
        extends StObject
           with typings.winrtUwp.Windows.Management.Deployment.Preview.ClassicAppManager
      object ClassicAppManager {
        
        @JSGlobal("Windows.Management.Deployment.Preview.ClassicAppManager")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("Windows.Management.Deployment.Preview.ClassicAppManager.findInstalledApp")
        @js.native
        def findInstalledApp: js.Any = js.native
        inline def findInstalledApp_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findInstalledApp")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("Windows.Management.Deployment.Preview.InstalledClassicAppInfo")
      @js.native
      abstract class InstalledClassicAppInfo ()
        extends StObject
           with typings.winrtUwp.Windows.Management.Deployment.Preview.InstalledClassicAppInfo {
        
        /* CompleteClass */
        var displayName: js.Any = js.native
        
        /* unmapped type */
        /* CompleteClass */
        var displayVersion: js.Any = js.native
      }
    }
    
    /** Values that modify the removal of a package. */
    @JSGlobal("Windows.Management.Deployment.RemovalOptions")
    @js.native
    object RemovalOptions extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.RemovalOptions & Double] = js.native
      
      /* 0 */ val none: typings.winrtUwp.Windows.Management.Deployment.RemovalOptions.none & Double = js.native
      
      /* 1 */ val preserveApplicationData: typings.winrtUwp.Windows.Management.Deployment.RemovalOptions.preserveApplicationData & Double = js.native
    }
  }
  
  object Orchestration {
    
    @JSGlobal("Windows.Management.Orchestration.CurrentAppOrchestration")
    @js.native
    abstract class CurrentAppOrchestration ()
      extends StObject
         with typings.winrtUwp.Windows.Management.Orchestration.CurrentAppOrchestration {
      
      /* unmapped type */
      /* CompleteClass */
      var startSingleAppMode: js.Any = js.native
    }
    object CurrentAppOrchestration {
      
      @JSGlobal("Windows.Management.Orchestration.CurrentAppOrchestration")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Windows.Management.Orchestration.CurrentAppOrchestration.getForCurrentView")
      @js.native
      def getForCurrentView: js.Any = js.native
      inline def getForCurrentView_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getForCurrentView")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Windows.Management.Orchestration.SingleAppModeContext")
    @js.native
    abstract class SingleAppModeContext ()
      extends StObject
         with typings.winrtUwp.Windows.Management.Orchestration.SingleAppModeContext {
      
      /* CompleteClass */
      var close: js.Any = js.native
    }
  }
  
  /** Provides functionality for managing apps in an enterprise. */
  object Workplace {
    
    /** MDM (Mobile Device Management) policy. */
    @JSGlobal("Windows.Management.Workplace.MdmPolicy")
    @js.native
    abstract class MdmPolicy ()
      extends StObject
         with typings.winrtUwp.Windows.Management.Workplace.MdmPolicy
    object MdmPolicy {
      
      @JSGlobal("Windows.Management.Workplace.MdmPolicy")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Returns true if a browser is allowed.
        * @return true if a browser is allowed.
        */
      /* static member */
      inline def isBrowserAllowed(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowserAllowed")().asInstanceOf[Boolean]
      
      /**
        * Returns true if a camera is allowed.
        * @return true if a camera is allowed.
        */
      /* static member */
      inline def isCameraAllowed(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCameraAllowed")().asInstanceOf[Boolean]
      
      /**
        * Returns true if a Microsoft Account is allowed.
        * @return true if a Microsoft Account is allowed.
        */
      /* static member */
      inline def isMicrosoftAccountAllowed(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMicrosoftAccountAllowed")().asInstanceOf[Boolean]
      
      /**
        * Returns true if a Store is allowed.
        * @return true if a Store is allowed.
        */
      /* static member */
      inline def isStoreAllowed(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStoreAllowed")().asInstanceOf[Boolean]
    }
    
    /** Enables Windows Store apps to access select enterprise settings that are managed through group policy or other management services. */
    @JSGlobal("Windows.Management.Workplace.WorkplaceSettings")
    @js.native
    abstract class WorkplaceSettings ()
      extends StObject
         with typings.winrtUwp.Windows.Management.Workplace.WorkplaceSettings
    object WorkplaceSettings {
      
      @JSGlobal("Windows.Management.Workplace.WorkplaceSettings")
      @js.native
      val ^ : js.Any = js.native
      
      /** Gets a value that indicates whether an enterprise ID can be used instead of a Microsoft account. */
      /* static member */
      @JSGlobal("Windows.Management.Workplace.WorkplaceSettings.isMicrosoftAccountOptional")
      @js.native
      def isMicrosoftAccountOptional: Boolean = js.native
      inline def isMicrosoftAccountOptional_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMicrosoftAccountOptional")(x.asInstanceOf[js.Any])
    }
  }
}

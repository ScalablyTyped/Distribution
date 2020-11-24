package typings.winrtUwp.global.Windows.Management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for managing app packages. */
@JSGlobal("Windows.Management.Deployment")
@js.native
object Deployment extends js.Object {
  
  /** Specifies the package deployment options. */
  @js.native
  object DeploymentOptions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions with Double] = js.native
    
    /* 2 */ val developmentMode: typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions.developmentMode with Double = js.native
    
    /* 1 */ val forceApplicationShutdown: typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions.forceApplicationShutdown with Double = js.native
    
    /* 4 */ val forceTargetApplicationShutdown: typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions.forceTargetApplicationShutdown with Double = js.native
    
    /* 3 */ val installAllResources: typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions.installAllResources with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Management.Deployment.DeploymentOptions.none with Double = js.native
  }
  
  /** Represents the state of a deployment request. */
  @js.native
  object DeploymentProgressState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Management.Deployment.DeploymentProgressState with Double
      ] = js.native
    
    /* 1 */ val processing: typings.winrtUwp.Windows.Management.Deployment.DeploymentProgressState.processing with Double = js.native
    
    /* 0 */ val queued: typings.winrtUwp.Windows.Management.Deployment.DeploymentProgressState.queued with Double = js.native
  }
  
  /** Provides the result of a deployment request. */
  @js.native
  abstract class DeploymentResult ()
    extends typings.winrtUwp.Windows.Management.Deployment.DeploymentResult
  
  /** Represents the install state of the package. */
  @js.native
  object PackageInstallState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.PackageInstallState with Double] = js.native
    
    /* 2 */ val installed: typings.winrtUwp.Windows.Management.Deployment.PackageInstallState.installed with Double = js.native
    
    /* 0 */ val notInstalled: typings.winrtUwp.Windows.Management.Deployment.PackageInstallState.notInstalled with Double = js.native
    
    /* 3 */ val paused: typings.winrtUwp.Windows.Management.Deployment.PackageInstallState.paused with Double = js.native
    
    /* 1 */ val staged: typings.winrtUwp.Windows.Management.Deployment.PackageInstallState.staged with Double = js.native
  }
  
  /** Represents the state of the package. */
  @js.native
  object PackageState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.PackageState with Double] = js.native
    
    /* 1 */ val licenseInvalid: typings.winrtUwp.Windows.Management.Deployment.PackageState.licenseInvalid with Double = js.native
    
    /* 2 */ val modified: typings.winrtUwp.Windows.Management.Deployment.PackageState.modified with Double = js.native
    
    /* 0 */ val normal: typings.winrtUwp.Windows.Management.Deployment.PackageState.normal with Double = js.native
    
    /* 3 */ val tampered: typings.winrtUwp.Windows.Management.Deployment.PackageState.tampered with Double = js.native
  }
  
  /** Provides info about the status of a package. */
  @js.native
  object PackageStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.PackageStatus with Double] = js.native
    
    /* 4 */ val disabled: typings.winrtUwp.Windows.Management.Deployment.PackageStatus.disabled with Double = js.native
    
    /* 1 */ val licenseIssue: typings.winrtUwp.Windows.Management.Deployment.PackageStatus.licenseIssue with Double = js.native
    
    /* 2 */ val modified: typings.winrtUwp.Windows.Management.Deployment.PackageStatus.modified with Double = js.native
    
    /* 0 */ val ok: typings.winrtUwp.Windows.Management.Deployment.PackageStatus.ok with Double = js.native
    
    /* 3 */ val tampered: typings.winrtUwp.Windows.Management.Deployment.PackageStatus.tampered with Double = js.native
  }
  
  /** Defines the types of packages to be included in the result set of a query. */
  @js.native
  object PackageTypes extends js.Object {
    
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
  @js.native
  abstract class PackageUserInformation ()
    extends typings.winrtUwp.Windows.Management.Deployment.PackageUserInformation
  
  /** Represents a package storage volume. */
  @js.native
  /** Initializes a new instance of the PackageVolume class. */
  class PackageVolume ()
    extends typings.winrtUwp.Windows.Management.Deployment.PackageVolume
  
  @js.native
  object Preview extends js.Object {
    
    @js.native
    abstract class ClassicAppManager ()
      extends typings.winrtUwp.Windows.Management.Deployment.Preview.ClassicAppManager
    /* static members */
    @js.native
    object ClassicAppManager extends js.Object {
      
      var findInstalledApp: js.Any = js.native
    }
    
    @js.native
    abstract class InstalledClassicAppInfo ()
      extends typings.winrtUwp.Windows.Management.Deployment.Preview.InstalledClassicAppInfo
  }
  
  /** Values that modify the removal of a package. */
  @js.native
  object RemovalOptions extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Management.Deployment.RemovalOptions with Double] = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Management.Deployment.RemovalOptions.none with Double = js.native
    
    /* 1 */ val preserveApplicationData: typings.winrtUwp.Windows.Management.Deployment.RemovalOptions.preserveApplicationData with Double = js.native
  }
}

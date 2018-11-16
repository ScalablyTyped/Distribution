package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionStateFlags extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionStateFlags")
@js.native
object ExtensionStateFlags extends js.Object {
  /**
       * Error performing auto-upgrade. For example, if the new version has demands not supported the extension cannot be auto-upgraded.
       */
  @js.native
  sealed trait AutoUpgradeError
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags
  
  /**
       * Extension is a built in
       */
  @js.native
  sealed trait BuiltIn
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags
  
  /**
       * Extension is disabled
       */
  @js.native
  sealed trait Disabled
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags
  
  /**
       * Extension is currently in an error state
       */
  @js.native
  sealed trait Error
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags
  
  /**
       * Extension has multiple versions
       */
  @js.native
  sealed trait MultiVersion
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags
  
  /**
       * Extension scopes have changed and the extension requires re-authorization
       */
  @js.native
  sealed trait NeedsReauthorization
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags
  
  /**
       * No flags set
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags
  
  /**
       * Trusted extensions are ones that are given special capabilities. These tend to come from Microsoft and can't be published by the general public.  Note: BuiltIn extensions are always trusted.
       */
  @js.native
  sealed trait Trusted
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags
  
  /**
       * Extension is not installed.  This is for builtin extensions only and can not otherwise be set.
       */
  @js.native
  sealed trait UnInstalled
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags
  
  /**
       * Error performing version check
       */
  @js.native
  sealed trait VersionCheckError
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags
  
  /**
       * Extension is currently in a warning state, that can cause a degraded experience. The degraded experience can be caused for example by some installation issues detected such as implicit demands not supported.
       */
  @js.native
  sealed trait Warning
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags
  
  /* 256 */ val AutoUpgradeError: AutoUpgradeError with scala.Double = js.native
  /* 2 */ val BuiltIn: BuiltIn with scala.Double = js.native
  /* 1 */ val Disabled: Disabled with scala.Double = js.native
  /* 64 */ val Error: Error with scala.Double = js.native
  /* 4 */ val MultiVersion: MultiVersion with scala.Double = js.native
  /* 128 */ val NeedsReauthorization: NeedsReauthorization with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 32 */ val Trusted: Trusted with scala.Double = js.native
  /* 8 */ val UnInstalled: UnInstalled with scala.Double = js.native
  /* 16 */ val VersionCheckError: VersionCheckError with scala.Double = js.native
  /* 512 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags with scala.Double
  ] = js.native
}


package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

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
  sealed trait AutoUpgradeError extends ExtensionStateFlags
  
  /**
    * Extension is a built in
    */
  @js.native
  sealed trait BuiltIn extends ExtensionStateFlags
  
  /**
    * Extension is disabled
    */
  @js.native
  sealed trait Disabled extends ExtensionStateFlags
  
  /**
    * Extension is currently in an error state
    */
  @js.native
  sealed trait Error extends ExtensionStateFlags
  
  /**
    * Extension has multiple versions
    */
  @js.native
  sealed trait MultiVersion extends ExtensionStateFlags
  
  /**
    * Extension scopes have changed and the extension requires re-authorization
    */
  @js.native
  sealed trait NeedsReauthorization extends ExtensionStateFlags
  
  /**
    * No flags set
    */
  @js.native
  sealed trait None extends ExtensionStateFlags
  
  /**
    * Trusted extensions are ones that are given special capabilities. These tend to come from Microsoft and can't be published by the general public.  Note: BuiltIn extensions are always trusted.
    */
  @js.native
  sealed trait Trusted extends ExtensionStateFlags
  
  /**
    * Extension is not installed.  This is for builtin extensions only and can not otherwise be set.
    */
  @js.native
  sealed trait UnInstalled extends ExtensionStateFlags
  
  /**
    * Error performing version check
    */
  @js.native
  sealed trait VersionCheckError extends ExtensionStateFlags
  
  /**
    * Extension is currently in a warning state, that can cause a degraded experience. The degraded experience can be caused for example by some installation issues detected such as implicit demands not supported.
    */
  @js.native
  sealed trait Warning extends ExtensionStateFlags
  
  /* 256 */ val AutoUpgradeError: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.AutoUpgradeError with Double = js.native
  /* 2 */ val BuiltIn: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.BuiltIn with Double = js.native
  /* 1 */ val Disabled: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.Disabled with Double = js.native
  /* 64 */ val Error: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.Error with Double = js.native
  /* 4 */ val MultiVersion: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.MultiVersion with Double = js.native
  /* 128 */ val NeedsReauthorization: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.NeedsReauthorization with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.None with Double = js.native
  /* 32 */ val Trusted: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.Trusted with Double = js.native
  /* 8 */ val UnInstalled: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.UnInstalled with Double = js.native
  /* 16 */ val VersionCheckError: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.VersionCheckError with Double = js.native
  /* 512 */ val Warning: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionStateFlags with Double] = js.native
}


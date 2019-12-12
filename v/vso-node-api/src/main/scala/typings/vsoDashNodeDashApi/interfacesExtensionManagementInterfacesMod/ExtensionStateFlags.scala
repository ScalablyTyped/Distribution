package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.AutoUpgradeError
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.BuiltIn
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.Disabled
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.Error
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.MultiVersion
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.NeedsReauthorization
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.None
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.Trusted
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.UnInstalled
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.VersionCheckError
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionStateFlags.Warning
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionStateFlags with Double] = js.native
  /* 256 */ @js.native
  object AutoUpgradeError extends TopLevel[AutoUpgradeError with Double]
  
  /* 2 */ @js.native
  object BuiltIn extends TopLevel[BuiltIn with Double]
  
  /* 1 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  /* 64 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 4 */ @js.native
  object MultiVersion extends TopLevel[MultiVersion with Double]
  
  /* 128 */ @js.native
  object NeedsReauthorization extends TopLevel[NeedsReauthorization with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 32 */ @js.native
  object Trusted extends TopLevel[Trusted with Double]
  
  /* 8 */ @js.native
  object UnInstalled extends TopLevel[UnInstalled with Double]
  
  /* 16 */ @js.native
  object VersionCheckError extends TopLevel[VersionCheckError with Double]
  
  /* 512 */ @js.native
  object Warning extends TopLevel[Warning with Double]
  
}


package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionStateFlags extends js.Object
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionStateFlags")
@js.native
object ExtensionStateFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionStateFlags with Double] = js.native
  
  /**
    * Error performing auto-upgrade. For example, if the new version has demands not supported the extension cannot be auto-upgraded.
    */
  @js.native
  sealed trait AutoUpgradeError extends ExtensionStateFlags
  /* 256 */ @js.native
  object AutoUpgradeError extends TopLevel[AutoUpgradeError with Double]
  
  /**
    * Extension is a built in
    */
  @js.native
  sealed trait BuiltIn extends ExtensionStateFlags
  /* 2 */ @js.native
  object BuiltIn extends TopLevel[BuiltIn with Double]
  
  /**
    * Extension is disabled
    */
  @js.native
  sealed trait Disabled extends ExtensionStateFlags
  /* 1 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  /**
    * Extension is currently in an error state
    */
  @js.native
  sealed trait Error extends ExtensionStateFlags
  /* 64 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /**
    * Extension has multiple versions
    */
  @js.native
  sealed trait MultiVersion extends ExtensionStateFlags
  /* 4 */ @js.native
  object MultiVersion extends TopLevel[MultiVersion with Double]
  
  /**
    * Extension scopes have changed and the extension requires re-authorization
    */
  @js.native
  sealed trait NeedsReauthorization extends ExtensionStateFlags
  /* 128 */ @js.native
  object NeedsReauthorization extends TopLevel[NeedsReauthorization with Double]
  
  /**
    * No flags set
    */
  @js.native
  sealed trait None extends ExtensionStateFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * Trusted extensions are ones that are given special capabilities. These tend to come from Microsoft and can't be published by the general public.  Note: BuiltIn extensions are always trusted.
    */
  @js.native
  sealed trait Trusted extends ExtensionStateFlags
  /* 32 */ @js.native
  object Trusted extends TopLevel[Trusted with Double]
  
  /**
    * Extension is not installed.  This is for builtin extensions only and can not otherwise be set.
    */
  @js.native
  sealed trait UnInstalled extends ExtensionStateFlags
  /* 8 */ @js.native
  object UnInstalled extends TopLevel[UnInstalled with Double]
  
  /**
    * Error performing version check
    */
  @js.native
  sealed trait VersionCheckError extends ExtensionStateFlags
  /* 16 */ @js.native
  object VersionCheckError extends TopLevel[VersionCheckError with Double]
  
  /**
    * Extension is currently in a warning state, that can cause a degraded experience. The degraded experience can be caused for example by some installation issues detected such as implicit demands not supported.
    */
  @js.native
  sealed trait Warning extends ExtensionStateFlags
  /* 512 */ @js.native
  object Warning extends TopLevel[Warning with Double]
}

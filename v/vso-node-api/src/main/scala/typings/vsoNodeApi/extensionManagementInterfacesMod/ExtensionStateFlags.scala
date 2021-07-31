package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionStateFlags extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionStateFlags")
@js.native
object ExtensionStateFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionStateFlags & Double] = js.native
  
  /**
    * Error performing auto-upgrade. For example, if the new version has demands not supported the extension cannot be auto-upgraded.
    */
  @js.native
  sealed trait AutoUpgradeError
    extends StObject
       with ExtensionStateFlags
  /* 256 */ val AutoUpgradeError: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.AutoUpgradeError & Double = js.native
  
  /**
    * Extension is a built in
    */
  @js.native
  sealed trait BuiltIn
    extends StObject
       with ExtensionStateFlags
  /* 2 */ val BuiltIn: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.BuiltIn & Double = js.native
  
  /**
    * Extension is disabled
    */
  @js.native
  sealed trait Disabled
    extends StObject
       with ExtensionStateFlags
  /* 1 */ val Disabled: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.Disabled & Double = js.native
  
  /**
    * Extension is currently in an error state
    */
  @js.native
  sealed trait Error
    extends StObject
       with ExtensionStateFlags
  /* 64 */ val Error: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.Error & Double = js.native
  
  /**
    * Extension has multiple versions
    */
  @js.native
  sealed trait MultiVersion
    extends StObject
       with ExtensionStateFlags
  /* 4 */ val MultiVersion: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.MultiVersion & Double = js.native
  
  /**
    * Extension scopes have changed and the extension requires re-authorization
    */
  @js.native
  sealed trait NeedsReauthorization
    extends StObject
       with ExtensionStateFlags
  /* 128 */ val NeedsReauthorization: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.NeedsReauthorization & Double = js.native
  
  /**
    * No flags set
    */
  @js.native
  sealed trait None
    extends StObject
       with ExtensionStateFlags
  /* 0 */ val None: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.None & Double = js.native
  
  /**
    * Trusted extensions are ones that are given special capabilities. These tend to come from Microsoft and can't be published by the general public.  Note: BuiltIn extensions are always trusted.
    */
  @js.native
  sealed trait Trusted
    extends StObject
       with ExtensionStateFlags
  /* 32 */ val Trusted: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.Trusted & Double = js.native
  
  /**
    * Extension is not installed.  This is for builtin extensions only and can not otherwise be set.
    */
  @js.native
  sealed trait UnInstalled
    extends StObject
       with ExtensionStateFlags
  /* 8 */ val UnInstalled: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.UnInstalled & Double = js.native
  
  /**
    * Error performing version check
    */
  @js.native
  sealed trait VersionCheckError
    extends StObject
       with ExtensionStateFlags
  /* 16 */ val VersionCheckError: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.VersionCheckError & Double = js.native
  
  /**
    * Extension is currently in a warning state, that can cause a degraded experience. The degraded experience can be caused for example by some installation issues detected such as implicit demands not supported.
    */
  @js.native
  sealed trait Warning
    extends StObject
       with ExtensionStateFlags
  /* 512 */ val Warning: typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionStateFlags.Warning & Double = js.native
}

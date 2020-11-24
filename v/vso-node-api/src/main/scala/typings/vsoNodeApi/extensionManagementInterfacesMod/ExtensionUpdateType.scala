package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionUpdateType extends js.Object
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionUpdateType")
@js.native
object ExtensionUpdateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionUpdateType with Double] = js.native
  
  @js.native
  sealed trait ActionRequired extends ExtensionUpdateType
  /* 6 */ @js.native
  object ActionRequired extends TopLevel[ActionRequired with Double]
  
  @js.native
  sealed trait ActionResolved extends ExtensionUpdateType
  /* 7 */ @js.native
  object ActionResolved extends TopLevel[ActionResolved with Double]
  
  @js.native
  sealed trait Disabled extends ExtensionUpdateType
  /* 4 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  @js.native
  sealed trait Enabled extends ExtensionUpdateType
  /* 3 */ @js.native
  object Enabled extends TopLevel[Enabled with Double]
  
  @js.native
  sealed trait Installed extends ExtensionUpdateType
  /* 1 */ @js.native
  object Installed extends TopLevel[Installed with Double]
  
  @js.native
  sealed trait Uninstalled extends ExtensionUpdateType
  /* 2 */ @js.native
  object Uninstalled extends TopLevel[Uninstalled with Double]
  
  @js.native
  sealed trait VersionUpdated extends ExtensionUpdateType
  /* 5 */ @js.native
  object VersionUpdated extends TopLevel[VersionUpdated with Double]
}

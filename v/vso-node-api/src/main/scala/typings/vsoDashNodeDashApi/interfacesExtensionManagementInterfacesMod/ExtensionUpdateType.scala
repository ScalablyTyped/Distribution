package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionUpdateType extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionUpdateType")
@js.native
object ExtensionUpdateType extends js.Object {
  @js.native
  sealed trait ActionRequired extends ExtensionUpdateType
  
  @js.native
  sealed trait ActionResolved extends ExtensionUpdateType
  
  @js.native
  sealed trait Disabled extends ExtensionUpdateType
  
  @js.native
  sealed trait Enabled extends ExtensionUpdateType
  
  @js.native
  sealed trait Installed extends ExtensionUpdateType
  
  @js.native
  sealed trait Uninstalled extends ExtensionUpdateType
  
  @js.native
  sealed trait VersionUpdated extends ExtensionUpdateType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionUpdateType with Double] = js.native
  /* 6 */ @js.native
  object ActionRequired extends TopLevel[ActionRequired with Double]
  
  /* 7 */ @js.native
  object ActionResolved extends TopLevel[ActionResolved with Double]
  
  /* 4 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  /* 3 */ @js.native
  object Enabled extends TopLevel[Enabled with Double]
  
  /* 1 */ @js.native
  object Installed extends TopLevel[Installed with Double]
  
  /* 2 */ @js.native
  object Uninstalled extends TopLevel[Uninstalled with Double]
  
  /* 5 */ @js.native
  object VersionUpdated extends TopLevel[VersionUpdated with Double]
  
}


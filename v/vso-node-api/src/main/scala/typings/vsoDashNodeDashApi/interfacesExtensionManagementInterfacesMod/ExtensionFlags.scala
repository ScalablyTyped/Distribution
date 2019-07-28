package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionFlags extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ExtensionFlags")
@js.native
object ExtensionFlags extends js.Object {
  /**
    * A built-in extension is installed for all VSTS accounts by default
    */
  @js.native
  sealed trait BuiltIn extends ExtensionFlags
  
  /**
    * The extension comes from a fully-trusted publisher
    */
  @js.native
  sealed trait Trusted extends ExtensionFlags
  
  /* 1 */ val BuiltIn: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionFlags.BuiltIn with Double = js.native
  /* 2 */ val Trusted: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionFlags.Trusted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionFlags with Double] = js.native
}


package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

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
  sealed trait BuiltIn
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionFlags
  
  /**
       * The extension comes from a fully-trusted publisher
       */
  @js.native
  sealed trait Trusted
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionFlags
  
  /* 1 */ val BuiltIn: BuiltIn with scala.Double = js.native
  /* 2 */ val Trusted: Trusted with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionFlags with scala.Double
  ] = js.native
}


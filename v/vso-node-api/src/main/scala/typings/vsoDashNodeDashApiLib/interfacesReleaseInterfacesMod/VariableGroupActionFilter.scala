package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VariableGroupActionFilter extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "VariableGroupActionFilter")
@js.native
object VariableGroupActionFilter extends js.Object {
  @js.native
  sealed trait Manage
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.VariableGroupActionFilter
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.VariableGroupActionFilter
  
  @js.native
  sealed trait Use
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.VariableGroupActionFilter
  
  /* 2 */ val Manage: Manage with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 16 */ val Use: Use with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.VariableGroupActionFilter with scala.Double
  ] = js.native
}


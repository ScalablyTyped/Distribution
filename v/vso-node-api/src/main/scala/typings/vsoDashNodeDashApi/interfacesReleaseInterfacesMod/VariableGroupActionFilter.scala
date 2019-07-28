package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VariableGroupActionFilter extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "VariableGroupActionFilter")
@js.native
object VariableGroupActionFilter extends js.Object {
  @js.native
  sealed trait Manage extends VariableGroupActionFilter
  
  @js.native
  sealed trait None extends VariableGroupActionFilter
  
  @js.native
  sealed trait Use extends VariableGroupActionFilter
  
  /* 2 */ val Manage: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.VariableGroupActionFilter.Manage with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.VariableGroupActionFilter.None with Double = js.native
  /* 16 */ val Use: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.VariableGroupActionFilter.Use with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VariableGroupActionFilter with Double] = js.native
}


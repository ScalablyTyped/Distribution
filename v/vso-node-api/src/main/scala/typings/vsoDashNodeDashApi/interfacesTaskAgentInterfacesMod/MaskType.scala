package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MaskType extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "MaskType")
@js.native
object MaskType extends js.Object {
  @js.native
  sealed trait Regex extends MaskType
  
  @js.native
  sealed trait Variable extends MaskType
  
  /* 2 */ val Regex: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.MaskType.Regex with Double = js.native
  /* 1 */ val Variable: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.MaskType.Variable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MaskType with Double] = js.native
}


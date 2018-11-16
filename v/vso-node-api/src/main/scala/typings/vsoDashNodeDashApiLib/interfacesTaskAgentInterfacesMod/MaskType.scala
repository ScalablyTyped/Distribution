package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MaskType extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "MaskType")
@js.native
object MaskType extends js.Object {
  @js.native
  sealed trait Regex
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.MaskType
  
  @js.native
  sealed trait Variable
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.MaskType
  
  /* 2 */ val Regex: Regex with scala.Double = js.native
  /* 1 */ val Variable: Variable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.MaskType with scala.Double
  ] = js.native
}


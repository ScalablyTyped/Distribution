package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BoardColumnType extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "BoardColumnType")
@js.native
object BoardColumnType extends js.Object {
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardColumnType
  
  @js.native
  sealed trait Incoming
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardColumnType
  
  @js.native
  sealed trait Outgoing
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardColumnType
  
  /* 1 */ val InProgress: InProgress with scala.Double = js.native
  /* 0 */ val Incoming: Incoming with scala.Double = js.native
  /* 2 */ val Outgoing: Outgoing with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.BoardColumnType with scala.Double
  ] = js.native
}


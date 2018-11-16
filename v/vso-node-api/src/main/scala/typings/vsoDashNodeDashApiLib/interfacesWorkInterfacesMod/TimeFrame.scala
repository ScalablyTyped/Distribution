package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeFrame extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "TimeFrame")
@js.native
object TimeFrame extends js.Object {
  @js.native
  sealed trait Current
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimeFrame
  
  @js.native
  sealed trait Future
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimeFrame
  
  @js.native
  sealed trait Past
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimeFrame
  
  /* 1 */ val Current: Current with scala.Double = js.native
  /* 2 */ val Future: Future with scala.Double = js.native
  /* 0 */ val Past: Past with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimeFrame with scala.Double] = js.native
}


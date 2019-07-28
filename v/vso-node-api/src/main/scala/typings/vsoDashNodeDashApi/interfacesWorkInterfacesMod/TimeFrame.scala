package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeFrame extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "TimeFrame")
@js.native
object TimeFrame extends js.Object {
  @js.native
  sealed trait Current extends TimeFrame
  
  @js.native
  sealed trait Future extends TimeFrame
  
  @js.native
  sealed trait Past extends TimeFrame
  
  /* 1 */ val Current: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimeFrame.Current with Double = js.native
  /* 2 */ val Future: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimeFrame.Future with Double = js.native
  /* 0 */ val Past: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimeFrame.Past with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeFrame with Double] = js.native
}


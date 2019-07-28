package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimelineIterationStatusCode extends js.Object

@JSImport("vso-node-api/interfaces/WorkInterfaces", "TimelineIterationStatusCode")
@js.native
object TimelineIterationStatusCode extends js.Object {
  /**
    * This iteration overlaps with another iteration, no data is returned for this iteration.
    */
  @js.native
  sealed trait IsOverlapping extends TimelineIterationStatusCode
  
  /**
    * No error - iteration data is good.
    */
  @js.native
  sealed trait OK extends TimelineIterationStatusCode
  
  /* 1 */ val IsOverlapping: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineIterationStatusCode.IsOverlapping with Double = js.native
  /* 0 */ val OK: typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod.TimelineIterationStatusCode.OK with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineIterationStatusCode with Double] = js.native
}


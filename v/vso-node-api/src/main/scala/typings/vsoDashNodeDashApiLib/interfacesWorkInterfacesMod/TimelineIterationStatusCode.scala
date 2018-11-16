package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

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
  sealed trait IsOverlapping
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimelineIterationStatusCode
  
  /**
       * No error - iteration data is good.
       */
  @js.native
  sealed trait OK
    extends vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimelineIterationStatusCode
  
  /* 1 */ val IsOverlapping: IsOverlapping with scala.Double = js.native
  /* 0 */ val OK: OK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkInterfacesMod.TimelineIterationStatusCode with scala.Double
  ] = js.native
}


package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineIterationStatusCode with Double] = js.native
  /* 1 */ @js.native
  object IsOverlapping extends TopLevel[IsOverlapping with Double]
  
  /* 0 */ @js.native
  object OK extends TopLevel[OK with Double]
  
}


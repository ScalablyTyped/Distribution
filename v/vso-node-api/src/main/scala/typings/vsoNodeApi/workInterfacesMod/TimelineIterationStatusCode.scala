package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimelineIterationStatusCode extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "TimelineIterationStatusCode")
@js.native
object TimelineIterationStatusCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineIterationStatusCode & Double] = js.native
  
  /**
    * This iteration overlaps with another iteration, no data is returned for this iteration.
    */
  @js.native
  sealed trait IsOverlapping
    extends StObject
       with TimelineIterationStatusCode
  /* 1 */ val IsOverlapping: typings.vsoNodeApi.workInterfacesMod.TimelineIterationStatusCode.IsOverlapping & Double = js.native
  
  /**
    * No error - iteration data is good.
    */
  @js.native
  sealed trait OK
    extends StObject
       with TimelineIterationStatusCode
  /* 0 */ val OK: typings.vsoNodeApi.workInterfacesMod.TimelineIterationStatusCode.OK & Double = js.native
}

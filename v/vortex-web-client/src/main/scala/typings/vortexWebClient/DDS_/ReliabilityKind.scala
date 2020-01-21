package typings.vortexWebClient.DDS_

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReliabilityKind extends js.Object

@JSGlobal("DDS.ReliabilityKind")
@js.native
object ReliabilityKind extends js.Object {
  @js.native
  sealed trait BestEffort extends ReliabilityKind
  
  @js.native
  sealed trait Reliable extends ReliabilityKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReliabilityKind with Double] = js.native
  /* 1 */ @js.native
  object BestEffort extends TopLevel[BestEffort with Double]
  
  /* 0 */ @js.native
  object Reliable extends TopLevel[Reliable with Double]
  
}


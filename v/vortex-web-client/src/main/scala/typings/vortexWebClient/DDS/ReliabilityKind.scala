package typings.vortexWebClient.DDS

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
  
}


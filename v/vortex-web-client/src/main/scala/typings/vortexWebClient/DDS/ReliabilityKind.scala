package typings.vortexWebClient.DDS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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

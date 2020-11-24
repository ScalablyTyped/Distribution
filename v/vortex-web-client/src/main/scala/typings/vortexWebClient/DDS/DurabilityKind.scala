package typings.vortexWebClient.DDS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DurabilityKind extends js.Object
@JSGlobal("DDS.DurabilityKind")
@js.native
object DurabilityKind extends js.Object {
  
  @js.native
  sealed trait Persistent extends DurabilityKind
  
  @js.native
  sealed trait Transient extends DurabilityKind
  
  @js.native
  sealed trait TransientLocal extends DurabilityKind
  
  @js.native
  sealed trait Volatile extends DurabilityKind
}

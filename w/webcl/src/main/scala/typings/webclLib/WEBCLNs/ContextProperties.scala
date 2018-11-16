package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContextProperties extends js.Object

/* cl_context_properties */
@JSGlobal("WEBCL.ContextProperties")
@js.native
object ContextProperties extends js.Object {
  //CONTEXT_PLATFORM                          = 0x1084, // disallowed, no context properties in Web /* cl_command_queue_info */
  @js.native
  sealed trait QUEUE_CONTEXT
    extends webclLib.WEBCLNs.ContextProperties
  
  @js.native
  sealed trait QUEUE_DEVICE
    extends webclLib.WEBCLNs.ContextProperties
  
  //QUEUE_REFERENCE_COUNT                     = 0x1092, // disallowed
  @js.native
  sealed trait QUEUE_PROPERTIES
    extends webclLib.WEBCLNs.ContextProperties
  
  /* 0x1090 */ val QUEUE_CONTEXT: QUEUE_CONTEXT with scala.Double = js.native
  /* 0x1091 */ val QUEUE_DEVICE: QUEUE_DEVICE with scala.Double = js.native
  /* 0x1093 */ val QUEUE_PROPERTIES: QUEUE_PROPERTIES with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webclLib.WEBCLNs.ContextProperties with scala.Double] = js.native
}


package typings.webcl.WEBCL

import typings.webcl.webclNumbers.`0x1090`
import typings.webcl.webclNumbers.`0x1091`
import typings.webcl.webclNumbers.`0x1093`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_context_properties */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclNumbers.`0x1090`
  - typings.webcl.webclNumbers.`0x1091`
  - typings.webcl.webclNumbers.`0x1093`
*/
trait ContextProperties extends js.Object

object ContextProperties {
  //CONTEXT_PLATFORM                          = 0x1084, // disallowed, no context properties in Web /* cl_command_queue_info */
  @scala.inline
  def QUEUE_CONTEXT: `0x1090` = 0x1090.asInstanceOf[`0x1090`]
  @scala.inline
  def QUEUE_DEVICE: `0x1091` = 0x1091.asInstanceOf[`0x1091`]
  //QUEUE_REFERENCE_COUNT                     = 0x1092, // disallowed
  @scala.inline
  def QUEUE_PROPERTIES: `0x1093` = 0x1093.asInstanceOf[`0x1093`]
}


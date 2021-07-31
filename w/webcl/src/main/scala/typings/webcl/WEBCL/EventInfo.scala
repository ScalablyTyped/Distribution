package typings.webcl.WEBCL

import typings.webcl.webclNumbers.`0x11D0`
import typings.webcl.webclNumbers.`0x11D1`
import typings.webcl.webclNumbers.`0x11D3`
import typings.webcl.webclNumbers.`0x11D4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* cl_event_info  */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclNumbers.`0x11D0`
  - typings.webcl.webclNumbers.`0x11D1`
  - typings.webcl.webclNumbers.`0x11D3`
  - typings.webcl.webclNumbers.`0x11D4`
*/
trait EventInfo extends StObject
object EventInfo {
  
  //EVENT_REFERENCE_COUNT                     = 0x11D2, // disallowed
  @scala.inline
  def EVENT_COMMAND_EXECUTION_STATUS: `0x11D3` = 0x11D3.asInstanceOf[`0x11D3`]
  
  @scala.inline
  def EVENT_COMMAND_QUEUE: `0x11D0` = 0x11D0.asInstanceOf[`0x11D0`]
  
  @scala.inline
  def EVENT_COMMAND_TYPE: `0x11D1` = 0x11D1.asInstanceOf[`0x11D1`]
  
  @scala.inline
  def EVENT_CONTEXT: `0x11D4` = 0x11D4.asInstanceOf[`0x11D4`]
}

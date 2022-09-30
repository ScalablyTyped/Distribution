package typings.webcl.WEBCL

import typings.webcl.webclInts.`0x1090`
import typings.webcl.webclInts.`0x1091`
import typings.webcl.webclInts.`0x1093`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* cl_context_properties */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclInts.`0x1090`
  - typings.webcl.webclInts.`0x1091`
  - typings.webcl.webclInts.`0x1093`
*/
trait ContextProperties extends StObject
object ContextProperties {
  
  //CONTEXT_PLATFORM                          = 0x1084, // disallowed, no context properties in Web /* cl_command_queue_info */
  inline def QUEUE_CONTEXT: `0x1090` = 0x1090.asInstanceOf[`0x1090`]
  
  inline def QUEUE_DEVICE: `0x1091` = 0x1091.asInstanceOf[`0x1091`]
  
  //QUEUE_REFERENCE_COUNT                     = 0x1092, // disallowed
  inline def QUEUE_PROPERTIES: `0x1093` = 0x1093.asInstanceOf[`0x1093`]
}

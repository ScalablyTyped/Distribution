package typings.webcl.WEBCL

import typings.webcl.webclInts.`0x0`
import typings.webcl.webclInts.`0x1`
import typings.webcl.webclInts.`0x2`
import typings.webcl.webclInts.`0x3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* command execution status */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclInts.`0x0`
  - typings.webcl.webclInts.`0x1`
  - typings.webcl.webclInts.`0x2`
  - typings.webcl.webclInts.`0x3`
*/
trait CommandExecutionStatus extends StObject
object CommandExecutionStatus {
  
  inline def COMPLETE: `0x0` = 0x0.asInstanceOf[`0x0`]
  
  inline def QUEUED: `0x3` = 0x3.asInstanceOf[`0x3`]
  
  inline def RUNNING: `0x1` = 0x1.asInstanceOf[`0x1`]
  
  inline def SUBMITTED: `0x2` = 0x2.asInstanceOf[`0x2`]
}

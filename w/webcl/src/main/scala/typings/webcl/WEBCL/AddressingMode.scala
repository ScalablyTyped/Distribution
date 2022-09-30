package typings.webcl.WEBCL

import typings.webcl.webclInts.`0x1131`
import typings.webcl.webclInts.`0x1132`
import typings.webcl.webclInts.`0x1133`
import typings.webcl.webclInts.`0x1134`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* cl_addressing_mode */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclInts.`0x1131`
  - typings.webcl.webclInts.`0x1132`
  - typings.webcl.webclInts.`0x1133`
  - typings.webcl.webclInts.`0x1134`
*/
trait AddressingMode extends StObject
object AddressingMode {
  
  inline def ADDRESS_CLAMP: `0x1132` = 0x1132.asInstanceOf[`0x1132`]
  
  //ADDRESS_NONE                              = 0x1130, // disallowed
  inline def ADDRESS_CLAMP_TO_EDGE: `0x1131` = 0x1131.asInstanceOf[`0x1131`]
  
  inline def ADDRESS_MIRRORED_REPEAT: `0x1134` = 0x1134.asInstanceOf[`0x1134`]
  
  inline def ADDRESS_REPEAT: `0x1133` = 0x1133.asInstanceOf[`0x1133`]
}

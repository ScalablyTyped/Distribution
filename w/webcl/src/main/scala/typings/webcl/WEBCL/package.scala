package typings.webcl.WEBCL

import typings.webcl.webclInts.`0x1081`
import typings.webcl.webclInts.`0x1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* cl_context_info  */
type ContextInfo = `0x1081`

/* cl_device_exec_capabilities - bitfield */
type DeviceExecCapabilitiesBits = `0x1`

/* cl_device_type - bitfield */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclInts.`0x1`
  - typings.webcl.webclInts.`0x2`
  - typings.webcl.webclInts.`0x4`
  - typings.webcl.webclInts.`0x8`
  - / * 0xFFFFFFFF * / scala.Double
*/
type DeviceTypeBits = _DeviceTypeBits | (/* 0xFFFFFFFF */ Double)

//2.5
type WebCLCallback = js.Function1[/* event */ WebCLEvent, Unit]

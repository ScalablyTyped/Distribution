package typings.webcl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object WEBCL {
  
  /* cl_context_info  */
  type ContextInfo = typings.webcl.webclNumbers.`0x1081`
  
  /* cl_device_exec_capabilities - bitfield */
  type DeviceExecCapabilitiesBits = typings.webcl.webclNumbers.`0x1`
  
  //2.5
  type WebCLCallback = js.Function1[/* event */ typings.webcl.WEBCL.WebCLEvent, scala.Unit]
}

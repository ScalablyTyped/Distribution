package typings
package webclLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WEBCLNs {
  /* cl_context_info  */
  type ContextInfo = webclLib.webclLibNumbers.`0x1081`
  /* cl_device_exec_capabilities - bitfield */
  type DeviceExecCapabilitiesBits = webclLib.webclLibNumbers.`0x1`
  //2.5
  type WebCLCallback = js.Function1[/* event */ WebCLEvent, scala.Unit]
}

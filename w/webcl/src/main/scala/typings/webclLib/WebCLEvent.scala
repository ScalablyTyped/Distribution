package typings
package webclLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebCLEvent")
@js.native
class WebCLEvent ()
  extends webclLib.WEBCLNs.WebCLEvent {
  /* CompleteClass */
  override def getInfo(name: webclLib.WEBCLNs.EventInfo): js.Any = js.native
  /* CompleteClass */
  override def getProfilingInfo(name: webclLib.WEBCLNs.ProfilingInfo): scala.Double = js.native
  /* CompleteClass */
  override def release(): scala.Unit = js.native
  /* CompleteClass */
  override def setCallback(
    commandExecCallbackType: webclLib.WEBCLNs.CommandExecutionStatus,
    notify: webclLib.WEBCLNs.WebCLCallback
  ): scala.Unit = js.native
}

@JSGlobal("WebCLEvent")
@js.native
object WebCLEvent
  extends org.scalablytyped.runtime.Instantiable0[webclLib.WEBCLNs.WebCLEvent]


package typings.webcl

import org.scalablytyped.runtime.Instantiable0
import typings.webcl.WEBCLNs.CommandExecutionStatus
import typings.webcl.WEBCLNs.EventInfo
import typings.webcl.WEBCLNs.ProfilingInfo
import typings.webcl.WEBCLNs.WebCLCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebCLEvent")
@js.native
class WebCLEvent ()
  extends typings.webcl.WEBCLNs.WebCLEvent {
  /* CompleteClass */
  override def getInfo(name: EventInfo): js.Any = js.native
  /* CompleteClass */
  override def getProfilingInfo(name: ProfilingInfo): Double = js.native
  /* CompleteClass */
  override def release(): Unit = js.native
  /* CompleteClass */
  override def setCallback(commandExecCallbackType: CommandExecutionStatus, notify: WebCLCallback): Unit = js.native
}

@JSGlobal("WebCLEvent")
@js.native
object WebCLEvent
  extends Instantiable0[typings.webcl.WEBCLNs.WebCLEvent]


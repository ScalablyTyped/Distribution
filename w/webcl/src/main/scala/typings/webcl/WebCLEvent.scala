package typings.webcl

import org.scalablytyped.runtime.Instantiable0
import typings.webcl.WEBCL.CommandExecutionStatus
import typings.webcl.WEBCL.EventInfo
import typings.webcl.WEBCL.ProfilingInfo
import typings.webcl.WEBCL.WebCLCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebCLEvent")
@js.native
class WebCLEvent ()
  extends typings.webcl.WEBCL.WebCLEvent {
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
  extends Instantiable0[typings.webcl.WEBCL.WebCLEvent]


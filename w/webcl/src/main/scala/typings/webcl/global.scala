package typings.webcl

import typings.webcl.WEBCL.CommandExecutionStatus
import typings.webcl.WEBCL.EventInfo
import typings.webcl.WEBCL.ProfilingInfo
import typings.webcl.WEBCL.WebCLCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("WebCLEvent")
  @js.native
  class WebCLEvent ()
    extends StObject
       with typings.webcl.WEBCL.WebCLEvent {
    
    /* CompleteClass */
    override def getInfo(name: EventInfo): js.Any = js.native
    
    /* CompleteClass */
    override def getProfilingInfo(name: ProfilingInfo): Double = js.native
    
    /* CompleteClass */
    override def release(): Unit = js.native
    
    /* CompleteClass */
    override def setCallback(commandExecCallbackType: CommandExecutionStatus, notify: WebCLCallback): Unit = js.native
  }
}

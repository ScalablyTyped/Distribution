package typings.yjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsEventHandlerMod {
  
  @JSImport("yjs/dist/src/utils/EventHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/utils/EventHandler", "EventHandler")
  @js.native
  open class EventHandler[ARG0, ARG1] () extends StObject {
    
    /**
      * @type {Array<function(ARG0, ARG1):void>}
      */
    var l: js.Array[js.Function2[/* arg0 */ ARG0, /* arg1 */ ARG1, Unit]] = js.native
  }
  
  inline def addEventHandlerListener[ARG0, ARG1](eventHandler: EventHandler[ARG0, ARG1], f: js.Function2[/* arg0 */ ARG0, /* arg1 */ ARG1, Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventHandlerListener")(eventHandler.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def callEventHandlerListeners[ARG0, ARG1](eventHandler: EventHandler[ARG0, ARG1], arg0: ARG0, arg1: ARG1): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callEventHandlerListeners")(eventHandler.asInstanceOf[js.Any], arg0.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createEventHandler[ARG0, ARG1](): EventHandler[ARG0, ARG1] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventHandler")().asInstanceOf[EventHandler[ARG0, ARG1]]
  
  inline def removeAllEventHandlerListeners[ARG0, ARG1](eventHandler: EventHandler[ARG0, ARG1]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllEventHandlerListeners")(eventHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeEventHandlerListener[ARG0, ARG1](eventHandler: EventHandler[ARG0, ARG1], f: js.Function2[/* arg0 */ ARG0, /* arg1 */ ARG1, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventHandlerListener")(eventHandler.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

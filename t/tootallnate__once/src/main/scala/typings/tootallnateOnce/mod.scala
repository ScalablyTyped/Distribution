package typings.tootallnateOnce

import typings.node.eventsMod.EventEmitter
import typings.tootallnateOnce.distTypesMod.AbortSignal
import typings.tootallnateOnce.distTypesMod.EventListenerParameters
import typings.tootallnateOnce.distTypesMod.EventNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tootallnate/once", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Emitter /* <: EventEmitter */, Event /* <: EventNames[Emitter] */](emitter: Emitter, name: Event): js.Promise[EventListenerParameters[Emitter, Event]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EventListenerParameters[Emitter, Event]]]
  inline def default[Emitter /* <: EventEmitter */, Event /* <: EventNames[Emitter] */](emitter: Emitter, name: Event, param2: OnceOptions): js.Promise[EventListenerParameters[Emitter, Event]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EventListenerParameters[Emitter, Event]]]
  
  trait OnceOptions extends StObject {
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object OnceOptions {
    
    inline def apply(): OnceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnceOptions]
    }
    
    extension [Self <: OnceOptions](x: Self) {
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
}

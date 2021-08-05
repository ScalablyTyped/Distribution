package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "EventDispatcherFactory")
@js.native
class EventDispatcherFactory ()
  extends typings.wonderJs.eventDispatcherFactoryMod.EventDispatcherFactory
/* static members */
object EventDispatcherFactory {
  
  @JSImport("wonder.js/dist/es2015", "EventDispatcherFactory")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEventDispatcher(event: typings.wonderJs.eventMod.Event): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventDispatcher")(event.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}

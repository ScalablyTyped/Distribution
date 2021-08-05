package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "EventBinderFactory")
@js.native
class EventBinderFactory ()
  extends typings.wonderJs.eventBinderFactoryMod.EventBinderFactory
/* static members */
object EventBinderFactory {
  
  @JSImport("wonder.js/dist/es2015", "EventBinderFactory")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEventBinder(eventName: typings.wonderJs.eventNameHandlerMod.EEventName): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createEventBinder")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}

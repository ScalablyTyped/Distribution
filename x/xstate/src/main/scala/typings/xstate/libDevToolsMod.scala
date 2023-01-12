package typings.xstate

import typings.std.Set
import typings.xstate.anon.Unsubscribe
import typings.xstate.libTypesMod.AnyInterpreter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDevToolsMod {
  
  @JSImport("xstate/lib/devTools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGlobal(): js.UndefOr[/* globalThis */ Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobal")().asInstanceOf[js.UndefOr[/* globalThis */ Any]]
  
  inline def registerService(service: AnyInterpreter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerService")(service.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type ServiceListener = js.Function1[/* service */ AnyInterpreter, Unit]
  
  trait XStateDevInterface extends StObject {
    
    def onRegister(listener: ServiceListener): Unsubscribe
    
    def register(service: AnyInterpreter): Unit
    
    var services: Set[AnyInterpreter]
    
    def unregister(service: AnyInterpreter): Unit
  }
  object XStateDevInterface {
    
    inline def apply(
      onRegister: ServiceListener => Unsubscribe,
      register: AnyInterpreter => Unit,
      services: Set[AnyInterpreter],
      unregister: AnyInterpreter => Unit
    ): XStateDevInterface = {
      val __obj = js.Dynamic.literal(onRegister = js.Any.fromFunction1(onRegister), register = js.Any.fromFunction1(register), services = services.asInstanceOf[js.Any], unregister = js.Any.fromFunction1(unregister))
      __obj.asInstanceOf[XStateDevInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XStateDevInterface] (val x: Self) extends AnyVal {
      
      inline def setOnRegister(value: ServiceListener => Unsubscribe): Self = StObject.set(x, "onRegister", js.Any.fromFunction1(value))
      
      inline def setRegister(value: AnyInterpreter => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
      
      inline def setServices(value: Set[AnyInterpreter]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setUnregister(value: AnyInterpreter => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
    }
  }
}

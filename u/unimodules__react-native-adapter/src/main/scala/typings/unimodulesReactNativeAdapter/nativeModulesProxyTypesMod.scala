package typings.unimodulesReactNativeAdapter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeModulesProxyTypesMod {
  
  trait ProxyNativeModule
    extends StObject
       with /* propertyName */ StringDictionary[js.Any] {
    
    def addListener(eventName: String): Unit
    
    def removeListeners(count: Double): Unit
  }
  object ProxyNativeModule {
    
    inline def apply(addListener: String => Unit, removeListeners: Double => Unit): ProxyNativeModule = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), removeListeners = js.Any.fromFunction1(removeListeners))
      __obj.asInstanceOf[ProxyNativeModule]
    }
    
    extension [Self <: ProxyNativeModule](x: Self) {
      
      inline def setAddListener(value: String => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
      
      inline def setRemoveListeners(value: Double => Unit): Self = StObject.set(x, "removeListeners", js.Any.fromFunction1(value))
    }
  }
}

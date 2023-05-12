package typings.wdioProtocols

import typings.wdioProtocols.buildTypesMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsMjsonwpMod {
  
  trait MjsonwpCommands extends StObject {
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#webviews-and-other-contexts
      *
      */
    def getContext(): js.Promise[Context]
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#webviews-and-other-contexts
      *
      */
    def getContexts(): js.Promise[js.Array[Context]]
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#device-modes
      *
      */
    def getNetworkConnection(): js.Promise[Double]
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#mobile-json-wire-protocol-endpoints
      *
      */
    def getPageIndex(): js.Promise[String]
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#touch-gestures
      *
      */
    def multiTouchPerform(actions: js.Array[js.Object], elementId: js.Array[js.Object]): js.Promise[Unit]
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/appium/appium-base-driver/blob/master/docs/mjsonwp/protocol-methods.md#mobile-json-wire-protocol-endpoints
      *
      */
    def receiveAsyncResponse(status: String, value: String): js.Promise[Unit]
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#device-modes
      *
      */
    def setNetworkConnection(`type`: Double): js.Promise[Unit]
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#webviews-and-other-contexts
      *
      */
    def switchContext(name: String): js.Promise[Unit]
    
    /**
      * Mjsonwp Protocol Command
      *
      * No description available, please see reference link.
      * @ref https://github.com/SeleniumHQ/mobile-spec/blob/master/spec-draft.md#touch-gestures
      *
      */
    def touchPerform(actions: js.Array[js.Object]): js.Promise[Unit]
  }
  object MjsonwpCommands {
    
    inline def apply(
      getContext: () => js.Promise[Context],
      getContexts: () => js.Promise[js.Array[Context]],
      getNetworkConnection: () => js.Promise[Double],
      getPageIndex: () => js.Promise[String],
      multiTouchPerform: (js.Array[js.Object], js.Array[js.Object]) => js.Promise[Unit],
      receiveAsyncResponse: (String, String) => js.Promise[Unit],
      setNetworkConnection: Double => js.Promise[Unit],
      switchContext: String => js.Promise[Unit],
      touchPerform: js.Array[js.Object] => js.Promise[Unit]
    ): MjsonwpCommands = {
      val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getContexts = js.Any.fromFunction0(getContexts), getNetworkConnection = js.Any.fromFunction0(getNetworkConnection), getPageIndex = js.Any.fromFunction0(getPageIndex), multiTouchPerform = js.Any.fromFunction2(multiTouchPerform), receiveAsyncResponse = js.Any.fromFunction2(receiveAsyncResponse), setNetworkConnection = js.Any.fromFunction1(setNetworkConnection), switchContext = js.Any.fromFunction1(switchContext), touchPerform = js.Any.fromFunction1(touchPerform))
      __obj.asInstanceOf[MjsonwpCommands]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MjsonwpCommands] (val x: Self) extends AnyVal {
      
      inline def setGetContext(value: () => js.Promise[Context]): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
      
      inline def setGetContexts(value: () => js.Promise[js.Array[Context]]): Self = StObject.set(x, "getContexts", js.Any.fromFunction0(value))
      
      inline def setGetNetworkConnection(value: () => js.Promise[Double]): Self = StObject.set(x, "getNetworkConnection", js.Any.fromFunction0(value))
      
      inline def setGetPageIndex(value: () => js.Promise[String]): Self = StObject.set(x, "getPageIndex", js.Any.fromFunction0(value))
      
      inline def setMultiTouchPerform(value: (js.Array[js.Object], js.Array[js.Object]) => js.Promise[Unit]): Self = StObject.set(x, "multiTouchPerform", js.Any.fromFunction2(value))
      
      inline def setReceiveAsyncResponse(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "receiveAsyncResponse", js.Any.fromFunction2(value))
      
      inline def setSetNetworkConnection(value: Double => js.Promise[Unit]): Self = StObject.set(x, "setNetworkConnection", js.Any.fromFunction1(value))
      
      inline def setSwitchContext(value: String => js.Promise[Unit]): Self = StObject.set(x, "switchContext", js.Any.fromFunction1(value))
      
      inline def setTouchPerform(value: js.Array[js.Object] => js.Promise[Unit]): Self = StObject.set(x, "touchPerform", js.Any.fromFunction1(value))
    }
  }
}

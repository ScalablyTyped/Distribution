package typings.vscodeWebview

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    /**
      * Acquire an instance of the webview API.
      *
      * This may only be called once in a webview's context. Attempting to call `acquireVsCodeApi` after it has already
      * been called will throw an exception.
      *
      * @template StateType Type of the persisted state stored for the webview.
      */
    // tslint:disable-next-line:no-unnecessary-generics
    inline def acquireVsCodeApi[StateType](): WebviewApi[StateType] = js.Dynamic.global.applyDynamic("acquireVsCodeApi")().asInstanceOf[WebviewApi[StateType]]
  }
  
  trait WebviewApi[StateType] extends StObject {
    
    /**
      * Get the persistent state stored for this webview.
      *
      * @return The current state or `undefined` if no state has been set.
      */
    def getState(): js.UndefOr[StateType]
    
    /**
      * Post a message to the owner of the webview.
      *
      * @param message Data to post. Must be JSON serializable.
      */
    def postMessage(message: Any): Unit
    
    /**
      * Set the persistent state stored for this webview.
      *
      * @param newState New persisted state. This must be a JSON serializable object. Can be retrieved
      * using {@link getState}.
      *
      * @return The new state.
      */
    def setState[T /* <: js.UndefOr[StateType] */](newState: T): T
  }
  object WebviewApi {
    
    inline def apply[StateType](getState: () => js.UndefOr[StateType], postMessage: Any => Unit, setState: Any => Any): WebviewApi[StateType] = {
      val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), postMessage = js.Any.fromFunction1(postMessage), setState = js.Any.fromFunction1(setState))
      __obj.asInstanceOf[WebviewApi[StateType]]
    }
    
    extension [Self <: WebviewApi[?], StateType](x: Self & WebviewApi[StateType]) {
      
      inline def setGetState(value: () => js.UndefOr[StateType]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setPostMessage(value: Any => Unit): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
      
      inline def setSetState(value: Any => Any): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    }
  }
}

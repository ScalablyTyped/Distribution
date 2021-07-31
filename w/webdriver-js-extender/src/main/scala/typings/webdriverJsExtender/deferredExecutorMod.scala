package typings.webdriverJsExtender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferredExecutorMod {
  
  @JSImport("webdriver-js-extender/built/lib/deferred_executor", "DeferredExecutor")
  @js.native
  class DeferredExecutor protected () extends StObject {
    /**
      * @param {!Promise<Executor>} delegate The promised delegate, which
      *     may be provided by any promise-like thenable object.
      */
    def this(delegate: js.Promise[js.Any]) = this()
    
    def defineCommand(name: String, method: String, path: String): Unit = js.native
    
    def execute(command: js.Any): js.Promise[js.Any] = js.native
  }
}

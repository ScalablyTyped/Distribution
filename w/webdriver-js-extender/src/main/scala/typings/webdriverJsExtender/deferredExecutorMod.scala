package typings.webdriverJsExtender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-js-extender/built/lib/deferred_executor", JSImport.Namespace)
@js.native
object deferredExecutorMod extends js.Object {
  @js.native
  class DeferredExecutor protected () extends js.Object {
    /**
      * @param {!Promise<Executor>} delegate The promised delegate, which
      *     may be provided by any promise-like thenable object.
      */
    def this(delegate: js.Promise[_]) = this()
    def defineCommand(name: String, method: String, path: String): Unit = js.native
    def execute(command: js.Any): js.Promise[_] = js.native
  }
  
}


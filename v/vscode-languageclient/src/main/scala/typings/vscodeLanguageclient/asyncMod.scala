package typings.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/utils/async", JSImport.Namespace)
@js.native
object asyncMod extends js.Object {
  @js.native
  class Delayer[T] protected () extends js.Object {
    def this(defaultDelay: Double) = this()
    var cancelTimeout: js.Any = js.native
    var completionPromise: js.Any = js.native
    var defaultDelay: Double = js.native
    var onSuccess: js.Any = js.native
    var task: js.Any = js.native
    var timeout: js.Any = js.native
    def cancel(): Unit = js.native
    def forceDelivery(): js.UndefOr[T] = js.native
    def isTriggered(): Boolean = js.native
    def trigger(task: ITask[T]): js.Promise[T] = js.native
    def trigger(task: ITask[T], delay: Double): js.Promise[T] = js.native
  }
  
  type ITask[T] = js.Function0[T]
}


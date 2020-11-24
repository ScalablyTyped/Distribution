package typings.tspromise

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Thenable[T] extends js.Object {
  
  def `catch`(onRejected: js.Function1[/* error */ Error, Unit]): Thenable[T] = js.native
  
  def `then`[TR](onFulfilled: js.Function1[/* value */ T, TR | Thenable[TR]]): Thenable[TR] = js.native
  def `then`[TR](
    onFulfilled: js.Function1[/* value */ T, TR | Thenable[TR]],
    onRejected: js.Function1[/* error */ Error, TR | Unit]
  ): Thenable[TR] = js.native
}

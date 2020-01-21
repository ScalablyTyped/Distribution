package typings.winrt.Windows.Foundation

import typings.winrt.AnonCompleted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsyncOperationWithProgress[TResult, TProgress] extends IPromise[TResult] {
  var operation: AnonCompleted[TResult, TProgress] = js.native
}


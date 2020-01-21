package typings.winrt.Windows.Foundation

import typings.winrt.AnonCompletedGetResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsyncOperation[TResult] extends IPromise[TResult] {
  var operation: AnonCompletedGetResults[TResult] = js.native
}


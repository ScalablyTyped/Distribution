package typings.winrt.Windows.Foundation

import typings.winrt.AnonGetResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsyncOperation[TResult] extends IPromise[TResult] {
  var operation: AnonGetResults[TResult] = js.native
}


package typings.winrt.Windows.Foundation

import typings.winrt.Anon_CompletedGetResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAsyncOperation[TResult] extends IPromise[TResult] {
  var operation: Anon_CompletedGetResults[TResult] = js.native
}


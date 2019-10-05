package typings.winrtDashUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPromiseWithOperation[TResult, TOperation /* <: IAsyncAction */] extends IPromise[TResult] {
  var operation: TOperation = js.native
}


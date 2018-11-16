package typings
package winrtDashUwpLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPromiseWithOperation[TResult, TOperation /* <: IAsyncAction */] extends IPromise[TResult] {
  var operation: TOperation = js.native
}


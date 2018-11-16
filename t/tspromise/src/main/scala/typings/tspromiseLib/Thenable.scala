package typings
package tspromiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Thenable")
@js.native
class Thenable[T] () extends js.Object {
  def `catch`(onRejected: js.Function1[/* error */ nodeLib.Error, scala.Unit]): Thenable[T] = js.native
  def `then`[TR](onFulfilled: js.Function1[/* value */ T, TR | Thenable[TR]]): Thenable[TR] = js.native
  def `then`[TR](
    onFulfilled: js.Function1[/* value */ T, TR | Thenable[TR]],
    onRejected: js.Function1[/* error */ nodeLib.Error, TR | scala.Unit]
  ): Thenable[TR] = js.native
}


package typings
package taskDashWorkletLib.taskDashWorkletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task[T] extends js.Object {
  var id: scala.Double
  var result: js.Promise[T]
  var state: State
}


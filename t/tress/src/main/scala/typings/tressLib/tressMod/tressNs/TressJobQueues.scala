package typings
package tressLib.tressMod.tressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TressJobQueues extends js.Object {
  var failed: js.Array[TressJobData]
  var finished: js.Array[TressJobData]
  var waiting: js.Array[TressJobData]
}


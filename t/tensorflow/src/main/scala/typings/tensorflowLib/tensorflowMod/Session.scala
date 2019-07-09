package typings
package tensorflowLib.tensorflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  def delete(): js.Any = js.native
  def run(inputs: SessionRunInputs, outputs: SessionRunOutputs): SessionRunResult = js.native
  def run(inputs: SessionRunInputs, outputs: SessionRunOutputs, targets: SessionRunTargets): SessionRunResult = js.native
}


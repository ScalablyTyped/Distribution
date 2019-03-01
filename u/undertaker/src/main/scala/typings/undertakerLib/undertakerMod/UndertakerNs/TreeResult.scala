package typings
package undertakerLib.undertakerMod.UndertakerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeResult extends js.Object {
  var label: undertakerLib.undertakerLibStrings.Tasks
  var nodes: js.Array[Node]
}

object TreeResult {
  @scala.inline
  def apply(label: undertakerLib.undertakerLibStrings.Tasks, nodes: js.Array[Node]): TreeResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("nodes")(nodes)
    __obj.asInstanceOf[TreeResult]
  }
}


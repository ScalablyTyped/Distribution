package typings.undertaker.mod

import typings.undertaker.undertakerStrings.Tasks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeResult extends js.Object {
  var label: Tasks
  var nodes: js.Array[Node]
}

object TreeResult {
  @scala.inline
  def apply(label: Tasks, nodes: js.Array[Node]): TreeResult = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeResult]
  }
}


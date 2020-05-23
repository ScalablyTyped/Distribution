package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitState extends js.Object {
  var column: Double
  var container: EmitContainer
  var line: Double
}

object EmitState {
  @scala.inline
  def apply(column: Double, container: EmitContainer, line: Double): EmitState = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitState]
  }
}


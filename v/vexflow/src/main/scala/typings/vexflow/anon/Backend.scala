package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backend extends js.Object {
  var backend: Double
  var background: String
  var context: js.Any
  var elementId: String
  var height: Double
  var width: Double
}

object Backend {
  @scala.inline
  def apply(
    backend: Double,
    background: String,
    context: js.Any,
    elementId: String,
    height: Double,
    width: Double
  ): Backend = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backend]
  }
}


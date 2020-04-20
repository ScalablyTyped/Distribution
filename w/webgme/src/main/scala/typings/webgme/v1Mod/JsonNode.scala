package typings.webgme.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonNode extends js.Object {
  var attributes: js.Any
  var base: String
  var constratints: js.Any
  var meta: js.Any
  var parent: String
  var pointers: js.Any
  var registry: js.Any
  var sets: js.Any
}

object JsonNode {
  @scala.inline
  def apply(
    attributes: js.Any,
    base: String,
    constratints: js.Any,
    meta: js.Any,
    parent: String,
    pointers: js.Any,
    registry: js.Any,
    sets: js.Any
  ): JsonNode = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], constratints = constratints.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], sets = sets.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonNode]
  }
}


package typings.yaml.yamlMod.ast

import typings.yaml.yamlStrings.BIN
import typings.yaml.yamlStrings.BLOCK_FOLDED
import typings.yaml.yamlStrings.BLOCK_LITERAL
import typings.yaml.yamlStrings.HEX
import typings.yaml.yamlStrings.OCT
import typings.yaml.yamlStrings.PLAIN
import typings.yaml.yamlStrings.QUOTE_DOUBLE
import typings.yaml.yamlStrings.QUOTE_SINGLE
import typings.yaml.yamlStrings.TIME
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scalar extends Node {
  /**
    * By default (undefined), numbers use decimal notation.
    * The YAML 1.2 core schema only supports 'HEX' and 'OCT'.
    */
  var format: js.UndefOr[BIN | HEX | OCT | TIME] = js.undefined
  var `type`: js.UndefOr[BLOCK_FOLDED | BLOCK_LITERAL | PLAIN | QUOTE_DOUBLE | QUOTE_SINGLE] = js.undefined
  var value: Null | Boolean | Double | String
}

object Scalar {
  @scala.inline
  def apply(
    toJSON: () => js.Any,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typings.yaml.yamlMod.cst.Node = null,
    format: BIN | HEX | OCT | TIME = null,
    range: js.Tuple2[Double, Double] = null,
    tag: String = null,
    `type`: BLOCK_FOLDED | BLOCK_LITERAL | PLAIN | QUOTE_DOUBLE | QUOTE_SINGLE = null,
    value: Boolean | Double | String = null
  ): Scalar = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scalar]
  }
}


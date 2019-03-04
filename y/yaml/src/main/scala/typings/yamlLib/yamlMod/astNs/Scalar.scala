package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scalar extends Node {
  /**
    * By default (undefined), numbers use decimal notation.
    * The YAML 1.2 core schema only supports 'HEX' and 'OCT'.
    */
  var format: js.UndefOr[
    yamlLib.yamlLibStrings.BIN | yamlLib.yamlLibStrings.HEX | yamlLib.yamlLibStrings.OCT | yamlLib.yamlLibStrings.TIME
  ]
  var `type`: js.UndefOr[
    yamlLib.yamlLibStrings.BLOCK_FOLDED | yamlLib.yamlLibStrings.BLOCK_LITERAL | yamlLib.yamlLibStrings.PLAIN | yamlLib.yamlLibStrings.QUOTE_DOUBLE | yamlLib.yamlLibStrings.QUOTE_SINGLE
  ]
  var value: scala.Null | scala.Boolean | scala.Double | java.lang.String
}

object Scalar {
  @scala.inline
  def apply(
    toJSON: js.Function0[js.Any],
    comment: java.lang.String = null,
    commentBefore: java.lang.String = null,
    cstNode: yamlLib.yamlMod.cstNs.Node = null,
    format: yamlLib.yamlLibStrings.BIN | yamlLib.yamlLibStrings.HEX | yamlLib.yamlLibStrings.OCT | yamlLib.yamlLibStrings.TIME = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    tag: java.lang.String = null,
    `type`: yamlLib.yamlLibStrings.BLOCK_FOLDED | yamlLib.yamlLibStrings.BLOCK_LITERAL | yamlLib.yamlLibStrings.PLAIN | yamlLib.yamlLibStrings.QUOTE_DOUBLE | yamlLib.yamlLibStrings.QUOTE_SINGLE = null,
    value: scala.Boolean | scala.Double | java.lang.String = null
  ): Scalar = {
    val __obj = js.Dynamic.literal(toJSON = toJSON)
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


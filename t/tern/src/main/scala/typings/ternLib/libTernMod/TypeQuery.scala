package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeQuery extends BaseQueryWithFile {
  /**
    * Determines how deep the type string must be expanded.
    * Nested objects will only display property types up to this depth,
    * and be represented by their type name or a representation showing
    * only property names below it. Default `0`
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /** Specify the location of the expression. */
  var end: scala.Double | Position
  /**
    * Set to `true` when you are interested in a function type.
    * This will cause function types to win when something has multiple types.
    * Default `false`
    */
  var preferFunction: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify the location of the expression. */
  var start: js.UndefOr[scala.Double | Position] = js.undefined
  /** Query the type of something. */
  @JSName("type")
  var type_TypeQuery: ternLib.ternLibStrings.`type`
}

object TypeQuery {
  @scala.inline
  def apply(
    end: scala.Double | Position,
    file: java.lang.String,
    `type`: ternLib.ternLibStrings.`type`,
    depth: scala.Int | scala.Double = null,
    docFormat: ternLib.ternLibStrings.full = null,
    lineCharPositions: js.UndefOr[scala.Boolean] = js.undefined,
    preferFunction: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Double | Position = null
  ): TypeQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file)
    __obj.updateDynamic("type")(`type`)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat)
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions)
    if (!js.isUndefined(preferFunction)) __obj.updateDynamic("preferFunction")(preferFunction)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeQuery]
  }
}


package typings.tern.libTernMod

import typings.tern.ternStrings.`type`
import typings.tern.ternStrings.full
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
  var depth: js.UndefOr[Double] = js.undefined
  /** Specify the location of the expression. */
  var end: Double | Position
  /**
    * Set to `true` when you are interested in a function type.
    * This will cause function types to win when something has multiple types.
    * Default `false`
    */
  var preferFunction: js.UndefOr[Boolean] = js.undefined
  /** Specify the location of the expression. */
  var start: js.UndefOr[Double | Position] = js.undefined
  /** Query the type of something. */
  @JSName("type")
  var type_TypeQuery: `type`
}

object TypeQuery {
  @scala.inline
  def apply(
    end: Double | Position,
    file: String,
    `type`: `type`,
    depth: Int | Double = null,
    docFormat: full = null,
    lineCharPositions: js.UndefOr[Boolean] = js.undefined,
    preferFunction: js.UndefOr[Boolean] = js.undefined,
    start: Double | Position = null
  ): TypeQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions.asInstanceOf[js.Any])
    if (!js.isUndefined(preferFunction)) __obj.updateDynamic("preferFunction")(preferFunction.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeQuery]
  }
}


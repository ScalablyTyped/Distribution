package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionQuery extends BaseQueryWithFile {
  /** Specify the location of the expression. */
  var end: scala.Double | Position
  /** Specify the location of the expression. */
  var start: js.UndefOr[scala.Double | Position] = js.undefined
  /**
    * Asks for the definition of something. This will try, for a variable or property,
    * to return the point at which it was defined. If that fails, or the chosen
    * expression is not an identifier or property reference, it will try to return
    * the definition site of the type the expression has. If no type is found, or the
    * type is not an object or function (other types don’t store their definition site),
    * it will fail to return useful information.
    */
  @JSName("type")
  var type_DefinitionQuery: ternLib.ternLibStrings.definition
}

object DefinitionQuery {
  @scala.inline
  def apply(
    end: scala.Double | Position,
    file: java.lang.String,
    `type`: ternLib.ternLibStrings.definition,
    docFormat: ternLib.ternLibStrings.full = null,
    lineCharPositions: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Double | Position = null
  ): DefinitionQuery = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.updateDynamic("file")(file)
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat)
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionQuery]
  }
}


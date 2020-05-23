package typings.tern.ternMod

import typings.tern.ternStrings.definition
import typings.tern.ternStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionQuery
  extends BaseQueryWithFile
     with Query {
  /** Specify the location of the expression. */
  var end: Double | Position
  /** Specify the location of the expression. */
  var start: js.UndefOr[Double | Position] = js.undefined
  /**
    * Asks for the definition of something. This will try, for a variable or property,
    * to return the point at which it was defined. If that fails, or the chosen
    * expression is not an identifier or property reference, it will try to return
    * the definition site of the type the expression has. If no type is found, or the
    * type is not an object or function (other types don’t store their definition site),
    * it will fail to return useful information.
    */
  @JSName("type")
  var type_DefinitionQuery: definition
}

object DefinitionQuery {
  @scala.inline
  def apply(
    end: Double | Position,
    file: String,
    `type`: definition,
    docFormat: full = null,
    lineCharPositions: js.UndefOr[Boolean] = js.undefined,
    start: Double | Position = null
  ): DefinitionQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (docFormat != null) __obj.updateDynamic("docFormat")(docFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(lineCharPositions)) __obj.updateDynamic("lineCharPositions")(lineCharPositions.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionQuery]
  }
}


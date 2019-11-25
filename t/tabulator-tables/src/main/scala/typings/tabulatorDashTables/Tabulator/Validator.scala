package typings.tabulatorDashTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validator extends js.Object {
  var parameters: js.UndefOr[js.Any] = js.undefined
  var `type`: StandardValidatorType | (js.Function3[
    /* cell */ CellComponent, 
    /* value */ js.Any, 
    /* parameters */ js.UndefOr[js.Any], 
    Boolean
  ])
}

object Validator {
  @scala.inline
  def apply(
    `type`: StandardValidatorType | (js.Function3[
      /* cell */ CellComponent, 
      /* value */ js.Any, 
      /* parameters */ js.UndefOr[js.Any], 
      Boolean
    ]),
    parameters: js.Any = null
  ): Validator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validator]
  }
}


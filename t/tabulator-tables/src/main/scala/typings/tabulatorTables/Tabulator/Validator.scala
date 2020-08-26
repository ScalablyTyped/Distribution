package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validator extends js.Object {
  var parameters: js.UndefOr[js.Any] = js.native
  var `type`: StandardValidatorType | (js.Function3[
    /* cell */ CellComponent, 
    /* value */ js.Any, 
    /* parameters */ js.UndefOr[js.Any], 
    Boolean
  ]) = js.native
}

object Validator {
  @scala.inline
  def apply(
    `type`: StandardValidatorType | (js.Function3[
      /* cell */ CellComponent, 
      /* value */ js.Any, 
      /* parameters */ js.UndefOr[js.Any], 
      Boolean
    ])
  ): Validator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validator]
  }
  @scala.inline
  implicit class ValidatorOps[Self <: Validator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTypeFunction3(
      value: (/* cell */ CellComponent, /* value */ js.Any, /* parameters */ js.UndefOr[js.Any]) => Boolean
    ): Self = this.set("type", js.Any.fromFunction3(value))
    @scala.inline
    def setType(
      value: StandardValidatorType | (js.Function3[
          /* cell */ CellComponent, 
          /* value */ js.Any, 
          /* parameters */ js.UndefOr[js.Any], 
          Boolean
        ])
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameters(value: js.Any): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
  
}


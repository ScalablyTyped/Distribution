package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsCells extends CellCallbacks {
  
  /** The validationFailed event is triggered when the value entered into a cell during an edit fails to pass validation. */
  var validationFailed: js.UndefOr[
    js.Function3[
      /* cell */ CellComponent, 
      /* value */ js.Any, 
      /* validators */ js.Array[StandardValidatorType | Validator], 
      Unit
    ]
  ] = js.native
}
object OptionsCells {
  
  @scala.inline
  def apply(): OptionsCells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsCells]
  }
  
  @scala.inline
  implicit class OptionsCellsOps[Self <: OptionsCells] (val x: Self) extends AnyVal {
    
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
    def setValidationFailed(
      value: (/* cell */ CellComponent, /* value */ js.Any, /* validators */ js.Array[StandardValidatorType | Validator]) => Unit
    ): Self = this.set("validationFailed", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteValidationFailed: Self = this.set("validationFailed", js.undefined)
  }
}

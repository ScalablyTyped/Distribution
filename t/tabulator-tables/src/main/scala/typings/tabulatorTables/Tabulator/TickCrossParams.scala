package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TickCrossParams extends _FormatterParams {
  
  // Tick Cross
  var allowEmpty: js.UndefOr[Boolean] = js.native
  
  var allowTruthy: js.UndefOr[Boolean] = js.native
  
  var crossElement: js.UndefOr[Boolean | String] = js.native
  
  var tickElement: js.UndefOr[Boolean | String] = js.native
}
object TickCrossParams {
  
  @scala.inline
  def apply(): TickCrossParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TickCrossParams]
  }
  
  @scala.inline
  implicit class TickCrossParamsOps[Self <: TickCrossParams] (val x: Self) extends AnyVal {
    
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
    def setAllowEmpty(value: Boolean): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEmpty: Self = this.set("allowEmpty", js.undefined)
    
    @scala.inline
    def setAllowTruthy(value: Boolean): Self = this.set("allowTruthy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTruthy: Self = this.set("allowTruthy", js.undefined)
    
    @scala.inline
    def setCrossElement(value: Boolean | String): Self = this.set("crossElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossElement: Self = this.set("crossElement", js.undefined)
    
    @scala.inline
    def setTickElement(value: Boolean | String): Self = this.set("tickElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickElement: Self = this.set("tickElement", js.undefined)
  }
}

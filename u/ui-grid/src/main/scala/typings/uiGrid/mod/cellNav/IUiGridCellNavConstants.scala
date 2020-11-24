package typings.uiGrid.mod.cellNav

import typings.uiGrid.anon.CLEAR
import typings.uiGrid.anon.LEFT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUiGridCellNavConstants extends js.Object {
  
  var CELL_NAV_EVENT: String = js.native
  
  var EVENT_TYPE: CLEAR = js.native
  
  var FEATURE_NAME: String = js.native
  
  var direction: LEFT = js.native
}
object IUiGridCellNavConstants {
  
  @scala.inline
  def apply(CELL_NAV_EVENT: String, EVENT_TYPE: CLEAR, FEATURE_NAME: String, direction: LEFT): IUiGridCellNavConstants = {
    val __obj = js.Dynamic.literal(CELL_NAV_EVENT = CELL_NAV_EVENT.asInstanceOf[js.Any], EVENT_TYPE = EVENT_TYPE.asInstanceOf[js.Any], FEATURE_NAME = FEATURE_NAME.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUiGridCellNavConstants]
  }
  
  @scala.inline
  implicit class IUiGridCellNavConstantsOps[Self <: IUiGridCellNavConstants] (val x: Self) extends AnyVal {
    
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
    def setCELL_NAV_EVENT(value: String): Self = this.set("CELL_NAV_EVENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEVENT_TYPE(value: CLEAR): Self = this.set("EVENT_TYPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFEATURE_NAME(value: String): Self = this.set("FEATURE_NAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: LEFT): Self = this.set("direction", value.asInstanceOf[js.Any])
  }
}

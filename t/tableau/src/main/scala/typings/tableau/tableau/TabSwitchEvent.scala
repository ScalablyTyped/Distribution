package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabSwitchEvent extends TableauEvent {
  
  /** Gets the name of the sheet that is currently active. */
  def getNewSheetName(): String = js.native
  
  /** Gets the name of the sheet that was active before the tab switch event occurred. */
  def getOldSheetName(): String = js.native
}
object TabSwitchEvent {
  
  @scala.inline
  def apply(
    getEventName: () => TableauEventName,
    getNewSheetName: () => String,
    getOldSheetName: () => String,
    getViz: () => Viz
  ): TabSwitchEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getNewSheetName = js.Any.fromFunction0(getNewSheetName), getOldSheetName = js.Any.fromFunction0(getOldSheetName), getViz = js.Any.fromFunction0(getViz))
    __obj.asInstanceOf[TabSwitchEvent]
  }
  
  @scala.inline
  implicit class TabSwitchEventOps[Self <: TabSwitchEvent] (val x: Self) extends AnyVal {
    
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
    def setGetNewSheetName(value: () => String): Self = this.set("getNewSheetName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOldSheetName(value: () => String): Self = this.set("getOldSheetName", js.Any.fromFunction0(value))
  }
}

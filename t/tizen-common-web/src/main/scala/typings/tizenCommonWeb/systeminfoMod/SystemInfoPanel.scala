package typings.tizenCommonWeb.systeminfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemInfoPanel extends SystemInfoProperty {
  /**
    * The height of the panel in pixels.
    */
  val panelHeight: Double = js.native
  /**
    * The width of the panel in pixels.
    */
  val panelWidth: Double = js.native
}

object SystemInfoPanel {
  @scala.inline
  def apply(panelHeight: Double, panelWidth: Double): SystemInfoPanel = {
    val __obj = js.Dynamic.literal(panelHeight = panelHeight.asInstanceOf[js.Any], panelWidth = panelWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoPanel]
  }
  @scala.inline
  implicit class SystemInfoPanelOps[Self <: SystemInfoPanel] (val x: Self) extends AnyVal {
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
    def setPanelHeight(value: Double): Self = this.set("panelHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setPanelWidth(value: Double): Self = this.set("panelWidth", value.asInstanceOf[js.Any])
  }
  
}


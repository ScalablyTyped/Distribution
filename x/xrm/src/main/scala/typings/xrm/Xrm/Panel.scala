package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the Xrm.Panel API
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-panel External Link: Xrm.Panel}
  */
@js.native
trait Panel extends js.Object {
  /**
    * Displays the web page represented by a URL in the static area in the side pane, which appears on all pages in the Customer Engagement web client.
    * @param url URL of the page to be loaded in the side pane static area.
    * @param title Title of the side pane static area.
    * @remarks  This method is only supported for the web client.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-panel/loadpanel External Link: loadPanel (Client-side reference)}
    */
  def loadPanel(url: String, title: String): Unit = js.native
}

object Panel {
  @scala.inline
  def apply(loadPanel: (String, String) => Unit): Panel = {
    val __obj = js.Dynamic.literal(loadPanel = js.Any.fromFunction2(loadPanel))
    __obj.asInstanceOf[Panel]
  }
  @scala.inline
  implicit class PanelOps[Self <: Panel] (val x: Self) extends AnyVal {
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
    def setLoadPanel(value: (String, String) => Unit): Self = this.set("loadPanel", js.Any.fromFunction2(value))
  }
  
}


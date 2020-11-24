package typings.titanium

import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple object for specifying options when showing or dismissing a <Titanium.UI.iOS.DocumentViewer>.
  */
@js.native
trait DocumentViewerOptions extends js.Object {
  
  /**
    * Indicates whether to animate the transition.
    */
  var animated: js.UndefOr[Boolean] = js.native
  
  /**
    * Anchors the options menu to the specified view.
    */
  var view: js.UndefOr[View] = js.native
}
object DocumentViewerOptions {
  
  @scala.inline
  def apply(): DocumentViewerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentViewerOptions]
  }
  
  @scala.inline
  implicit class DocumentViewerOptionsOps[Self <: DocumentViewerOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}

package typings.toastifyJs.mod

import typings.std.Node
import typings.toastifyJs.toastifyJsStrings.bottom
import typings.toastifyJs.toastifyJsStrings.center
import typings.toastifyJs.toastifyJsStrings.left
import typings.toastifyJs.toastifyJsStrings.right
import typings.toastifyJs.toastifyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Image/icon to be shown before text
    */
  var avatar: js.UndefOr[String] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Invoked when the toast is dismissed
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var close: js.UndefOr[Boolean] = js.native
  
  var destination: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var gravity: js.UndefOr[top | bottom] = js.native
  
  var newWindow: js.UndefOr[Boolean] = js.native
  
  var node: js.UndefOr[Node] = js.native
  
  var offset: js.UndefOr[Offset] = js.native
  
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  var position: js.UndefOr[left | center | right] = js.native
  
  var selector: js.UndefOr[String] = js.native
  
  /**
    * @default true
    */
  var stopOnFocus: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAvatar(value: String): Self = this.set("avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClose(value: Boolean): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setGravity(value: top | bottom): Self = this.set("gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    
    @scala.inline
    def setNewWindow(value: Boolean): Self = this.set("newWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewWindow: Self = this.set("newWindow", js.undefined)
    
    @scala.inline
    def setNode(value: Node): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    
    @scala.inline
    def setOffset(value: Offset): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setPosition(value: left | center | right): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setStopOnFocus(value: Boolean): Self = this.set("stopOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopOnFocus: Self = this.set("stopOnFocus", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}

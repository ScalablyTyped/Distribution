package typings.swipeview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeViewOptions extends js.Object {
  
  var hastyPageFlip: js.UndefOr[Boolean] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var numberOfPages: js.UndefOr[Double] = js.native
  
  var snapThreshold: js.UndefOr[Double] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object SwipeViewOptions {
  
  @scala.inline
  def apply(): SwipeViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeViewOptions]
  }
  
  @scala.inline
  implicit class SwipeViewOptionsOps[Self <: SwipeViewOptions] (val x: Self) extends AnyVal {
    
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
    def setHastyPageFlip(value: Boolean): Self = this.set("hastyPageFlip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHastyPageFlip: Self = this.set("hastyPageFlip", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setNumberOfPages(value: Double): Self = this.set("numberOfPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfPages: Self = this.set("numberOfPages", js.undefined)
    
    @scala.inline
    def setSnapThreshold(value: Double): Self = this.set("snapThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapThreshold: Self = this.set("snapThreshold", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}

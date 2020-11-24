package typings.wordpressComponents.withFocusReturnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WFROptions extends js.Object {
  
  var onFocusReturn: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
}
object WFROptions {
  
  @scala.inline
  def apply(): WFROptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WFROptions]
  }
  
  @scala.inline
  implicit class WFROptionsOps[Self <: WFROptions] (val x: Self) extends AnyVal {
    
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
    def setOnFocusReturn(value: () => Boolean | Unit): Self = this.set("onFocusReturn", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnFocusReturn: Self = this.set("onFocusReturn", js.undefined)
  }
}

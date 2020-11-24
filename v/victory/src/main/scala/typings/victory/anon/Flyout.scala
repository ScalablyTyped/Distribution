package typings.victory.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flyout extends js.Object {
  
  var data: js.UndefOr[CSSProperties] = js.native
  
  var flyout: js.UndefOr[CSSProperties] = js.native
  
  var labels: js.UndefOr[CSSProperties] = js.native
}
object Flyout {
  
  @scala.inline
  def apply(): Flyout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flyout]
  }
  
  @scala.inline
  implicit class FlyoutOps[Self <: Flyout] (val x: Self) extends AnyVal {
    
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
    def setData(value: CSSProperties): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFlyout(value: CSSProperties): Self = this.set("flyout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlyout: Self = this.set("flyout", js.undefined)
    
    @scala.inline
    def setLabels(value: CSSProperties): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
  }
}

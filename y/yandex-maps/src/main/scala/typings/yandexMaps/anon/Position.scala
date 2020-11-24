package typings.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Position extends js.Object {
  
  var adjustMapMargin: js.UndefOr[Boolean] = js.native
  
  var position: js.UndefOr[Bottom] = js.native
  
  var scaleLine: js.UndefOr[Boolean] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object Position {
  
  @scala.inline
  def apply(): Position = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
    
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
    def setAdjustMapMargin(value: Boolean): Self = this.set("adjustMapMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustMapMargin: Self = this.set("adjustMapMargin", js.undefined)
    
    @scala.inline
    def setPosition(value: Bottom): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setScaleLine(value: Boolean): Self = this.set("scaleLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleLine: Self = this.set("scaleLine", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}

package typings.yandexMaps.mod.behavior

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDragOptions extends js.Object {
  
  var actionCursor: js.UndefOr[String] = js.native
  
  var cursor: js.UndefOr[String] = js.native
  
  var inertia: js.UndefOr[Boolean] = js.native
  
  var inertiaDuration: js.UndefOr[Double] = js.native
  
  var tremor: js.UndefOr[Double] = js.native
}
object IDragOptions {
  
  @scala.inline
  def apply(): IDragOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragOptions]
  }
  
  @scala.inline
  implicit class IDragOptionsOps[Self <: IDragOptions] (val x: Self) extends AnyVal {
    
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
    def setActionCursor(value: String): Self = this.set("actionCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionCursor: Self = this.set("actionCursor", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setInertia(value: Boolean): Self = this.set("inertia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInertia: Self = this.set("inertia", js.undefined)
    
    @scala.inline
    def setInertiaDuration(value: Double): Self = this.set("inertiaDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInertiaDuration: Self = this.set("inertiaDuration", js.undefined)
    
    @scala.inline
    def setTremor(value: Double): Self = this.set("tremor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTremor: Self = this.set("tremor", js.undefined)
  }
}

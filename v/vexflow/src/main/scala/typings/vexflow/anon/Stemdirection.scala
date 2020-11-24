package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stemdirection extends js.Object {
  
  var stem_direction: js.UndefOr[Double] = js.native
  
  var stem_extension: js.UndefOr[Double] = js.native
  
  var x_begin: js.UndefOr[Double] = js.native
  
  var x_end: js.UndefOr[Double] = js.native
  
  var y_bottom: js.UndefOr[Double] = js.native
  
  var y_extend: js.UndefOr[Double] = js.native
  
  var y_top: js.UndefOr[Double] = js.native
}
object Stemdirection {
  
  @scala.inline
  def apply(): Stemdirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stemdirection]
  }
  
  @scala.inline
  implicit class StemdirectionOps[Self <: Stemdirection] (val x: Self) extends AnyVal {
    
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
    def setStem_direction(value: Double): Self = this.set("stem_direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStem_direction: Self = this.set("stem_direction", js.undefined)
    
    @scala.inline
    def setStem_extension(value: Double): Self = this.set("stem_extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStem_extension: Self = this.set("stem_extension", js.undefined)
    
    @scala.inline
    def setX_begin(value: Double): Self = this.set("x_begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX_begin: Self = this.set("x_begin", js.undefined)
    
    @scala.inline
    def setX_end(value: Double): Self = this.set("x_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX_end: Self = this.set("x_end", js.undefined)
    
    @scala.inline
    def setY_bottom(value: Double): Self = this.set("y_bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY_bottom: Self = this.set("y_bottom", js.undefined)
    
    @scala.inline
    def setY_extend(value: Double): Self = this.set("y_extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY_extend: Self = this.set("y_extend", js.undefined)
    
    @scala.inline
    def setY_top(value: Double): Self = this.set("y_top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY_top: Self = this.set("y_top", js.undefined)
  }
}

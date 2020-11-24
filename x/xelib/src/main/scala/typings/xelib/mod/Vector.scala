package typings.xelib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vector extends js.Object {
  
  var X: js.UndefOr[Double] = js.native
  
  var Y: js.UndefOr[Double] = js.native
  
  var Z: js.UndefOr[Double] = js.native
}
object Vector {
  
  @scala.inline
  def apply(): Vector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vector]
  }
  
  @scala.inline
  implicit class VectorOps[Self <: Vector] (val x: Self) extends AnyVal {
    
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
    def setX(value: Double): Self = this.set("X", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("X", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("Y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("Y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = this.set("Z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("Z", js.undefined)
  }
}

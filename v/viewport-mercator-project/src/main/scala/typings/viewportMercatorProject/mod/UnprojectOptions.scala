package typings.viewportMercatorProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnprojectOptions extends ProjectOptions {
  
  var targetZ: js.UndefOr[Double] = js.native
}
object UnprojectOptions {
  
  @scala.inline
  def apply(): UnprojectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprojectOptions]
  }
  
  @scala.inline
  implicit class UnprojectOptionsOps[Self <: UnprojectOptions] (val x: Self) extends AnyVal {
    
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
    def setTargetZ(value: Double): Self = this.set("targetZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetZ: Self = this.set("targetZ", js.undefined)
  }
}

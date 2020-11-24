package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alignrests extends js.Object {
  
  var align_rests: Boolean = js.native
  
  var auto_beam: Boolean = js.native
}
object Alignrests {
  
  @scala.inline
  def apply(align_rests: Boolean, auto_beam: Boolean): Alignrests = {
    val __obj = js.Dynamic.literal(align_rests = align_rests.asInstanceOf[js.Any], auto_beam = auto_beam.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alignrests]
  }
  
  @scala.inline
  implicit class AlignrestsOps[Self <: Alignrests] (val x: Self) extends AnyVal {
    
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
    def setAlign_rests(value: Boolean): Self = this.set("align_rests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_beam(value: Boolean): Self = this.set("auto_beam", value.asInstanceOf[js.Any])
  }
}

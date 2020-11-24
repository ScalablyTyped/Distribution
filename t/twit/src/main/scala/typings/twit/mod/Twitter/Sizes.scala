package typings.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sizes extends js.Object {
  
  var large: Size = js.native
  
  var medium: Size = js.native
  
  var small: Size = js.native
  
  var thumb: Size = js.native
}
object Sizes {
  
  @scala.inline
  def apply(large: Size, medium: Size, small: Size, thumb: Size): Sizes = {
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sizes]
  }
  
  @scala.inline
  implicit class SizesOps[Self <: Sizes] (val x: Self) extends AnyVal {
    
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
    def setLarge(value: Size): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedium(value: Size): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmall(value: Size): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb(value: Size): Self = this.set("thumb", value.asInstanceOf[js.Any])
  }
}

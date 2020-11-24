package typings.terminalMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Thickness extends js.Object {
  
  /**
    * Represents width of the lower side of the bounding rectangle.
    */
  var bottom: Double = js.native
  
  /**
    * Represents width of the left side of the bounding rectangle.
    */
  var left: Double = js.native
  
  /**
    * Represents width of the right side of the bounding rectangle.
    */
  var right: Double = js.native
  
  /**
    * Represents width of the upper side of the bounding rectangle.
    */
  var top: Double = js.native
}
object Thickness {
  
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): Thickness = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thickness]
  }
  
  @scala.inline
  implicit class ThicknessOps[Self <: Thickness] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
  }
}

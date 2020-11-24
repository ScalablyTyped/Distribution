package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSSkewY extends CSSTransformComponent {
  
  var ay: CSSNumericValue = js.native
}
object CSSSkewY {
  
  @scala.inline
  def apply(ay: CSSNumericValue, is2D: Boolean, toMatrix: () => DOMMatrix): CSSSkewY = {
    val __obj = js.Dynamic.literal(ay = ay.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSSkewY]
  }
  
  @scala.inline
  implicit class CSSSkewYOps[Self <: CSSSkewY] (val x: Self) extends AnyVal {
    
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
    def setAy(value: CSSNumericValue): Self = this.set("ay", value.asInstanceOf[js.Any])
  }
}

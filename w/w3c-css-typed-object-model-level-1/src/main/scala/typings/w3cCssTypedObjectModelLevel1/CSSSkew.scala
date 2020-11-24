package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSSkew extends CSSTransformComponent {
  
  var ax: CSSNumericValue = js.native
  
  var ay: CSSNumericValue = js.native
}
object CSSSkew {
  
  @scala.inline
  def apply(ax: CSSNumericValue, ay: CSSNumericValue, is2D: Boolean, toMatrix: () => DOMMatrix): CSSSkew = {
    val __obj = js.Dynamic.literal(ax = ax.asInstanceOf[js.Any], ay = ay.asInstanceOf[js.Any], is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix))
    __obj.asInstanceOf[CSSSkew]
  }
  
  @scala.inline
  implicit class CSSSkewOps[Self <: CSSSkew] (val x: Self) extends AnyVal {
    
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
    def setAx(value: CSSNumericValue): Self = this.set("ax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAy(value: CSSNumericValue): Self = this.set("ay", value.asInstanceOf[js.Any])
  }
}

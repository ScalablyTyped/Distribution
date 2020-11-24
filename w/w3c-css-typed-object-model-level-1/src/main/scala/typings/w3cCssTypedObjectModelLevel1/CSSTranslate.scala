package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSTranslate extends CSSTransformComponent {
  
  var x: CSSNumericValue = js.native
  
  var y: CSSNumericValue = js.native
  
  var z: CSSNumericValue = js.native
}
object CSSTranslate {
  
  @scala.inline
  def apply(
    is2D: Boolean,
    toMatrix: () => DOMMatrix,
    x: CSSNumericValue,
    y: CSSNumericValue,
    z: CSSNumericValue
  ): CSSTranslate = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTranslate]
  }
  
  @scala.inline
  implicit class CSSTranslateOps[Self <: CSSTranslate] (val x: Self) extends AnyVal {
    
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
    def setX(value: CSSNumericValue): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: CSSNumericValue): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: CSSNumericValue): Self = this.set("z", value.asInstanceOf[js.Any])
  }
}

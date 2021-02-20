package typings.w3cCssTypedObjectModelLevel1

import typings.std.DOMMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSScale extends CSSTransformComponent {
  
  var x: CSSNumberish = js.native
  
  var y: CSSNumberish = js.native
  
  var z: CSSNumberish = js.native
}
object CSSScale {
  
  @scala.inline
  def apply(is2D: Boolean, toMatrix: () => DOMMatrix, x: CSSNumberish, y: CSSNumberish, z: CSSNumberish): CSSScale = {
    val __obj = js.Dynamic.literal(is2D = is2D.asInstanceOf[js.Any], toMatrix = js.Any.fromFunction0(toMatrix), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSScale]
  }
  
  @scala.inline
  implicit class CSSScaleMutableBuilder[Self <: CSSScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: CSSNumberish): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: CSSNumberish): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: CSSNumberish): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}

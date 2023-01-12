package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import typings.winrt.anon.OutPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPointerPointTransform extends StObject {
  
  var inverse: IPointerPointTransform
  
  def transformBounds(rect: Rect): Rect
  
  def tryTransform(inPoint: Point): OutPoint
}
object IPointerPointTransform {
  
  inline def apply(inverse: IPointerPointTransform, transformBounds: Rect => Rect, tryTransform: Point => OutPoint): IPointerPointTransform = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any], transformBounds = js.Any.fromFunction1(transformBounds), tryTransform = js.Any.fromFunction1(tryTransform))
    __obj.asInstanceOf[IPointerPointTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPointerPointTransform] (val x: Self) extends AnyVal {
    
    inline def setInverse(value: IPointerPointTransform): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setTransformBounds(value: Rect => Rect): Self = StObject.set(x, "transformBounds", js.Any.fromFunction1(value))
    
    inline def setTryTransform(value: Point => OutPoint): Self = StObject.set(x, "tryTransform", js.Any.fromFunction1(value))
  }
}

package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import typings.winrt.anon.OutPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPointerPointTransform extends js.Object {
  
  var inverse: IPointerPointTransform = js.native
  
  def transformBounds(rect: Rect): Rect = js.native
  
  def tryTransform(inPoint: Point): OutPoint = js.native
}
object IPointerPointTransform {
  
  @scala.inline
  def apply(inverse: IPointerPointTransform, transformBounds: Rect => Rect, tryTransform: Point => OutPoint): IPointerPointTransform = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any], transformBounds = js.Any.fromFunction1(transformBounds), tryTransform = js.Any.fromFunction1(tryTransform))
    __obj.asInstanceOf[IPointerPointTransform]
  }
  
  @scala.inline
  implicit class IPointerPointTransformOps[Self <: IPointerPointTransform] (val x: Self) extends AnyVal {
    
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
    def setInverse(value: IPointerPointTransform): Self = this.set("inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformBounds(value: Rect => Rect): Self = this.set("transformBounds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTryTransform(value: Point => OutPoint): Self = this.set("tryTransform", js.Any.fromFunction1(value))
  }
}

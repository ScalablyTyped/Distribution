package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetCoordinates extends js.Object {
  
  /** This function returns asynchronously. */ var returnValue: IPromiseWithIAsyncAction = js.native
  
  /** The pixel coordinates, mapped to depth image space. */ var targetCoordinates: Point = js.native
}
object TargetCoordinates {
  
  @scala.inline
  def apply(returnValue: IPromiseWithIAsyncAction, targetCoordinates: Point): TargetCoordinates = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], targetCoordinates = targetCoordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetCoordinates]
  }
  
  @scala.inline
  implicit class TargetCoordinatesOps[Self <: TargetCoordinates] (val x: Self) extends AnyVal {
    
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
    def setReturnValue(value: IPromiseWithIAsyncAction): Self = this.set("returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCoordinates(value: Point): Self = this.set("targetCoordinates", value.asInstanceOf[js.Any])
  }
}

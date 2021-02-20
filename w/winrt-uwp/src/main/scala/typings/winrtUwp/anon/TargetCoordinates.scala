package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetCoordinates extends StObject {
  
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
  implicit class TargetCoordinatesMutableBuilder[Self <: TargetCoordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturnValue(value: IPromiseWithIAsyncAction): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCoordinates(value: Point): Self = StObject.set(x, "targetCoordinates", value.asInstanceOf[js.Any])
  }
}

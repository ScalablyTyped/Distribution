package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetCoordinates extends StObject {
  
  /** This function returns asynchronously. */ var returnValue: IPromiseWithIAsyncAction
  
  /** The pixel coordinates, mapped to depth image space. */ var targetCoordinates: Point
}
object TargetCoordinates {
  
  inline def apply(returnValue: IPromiseWithIAsyncAction, targetCoordinates: Point): TargetCoordinates = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], targetCoordinates = targetCoordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetCoordinates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetCoordinates] (val x: Self) extends AnyVal {
    
    inline def setReturnValue(value: IPromiseWithIAsyncAction): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setTargetCoordinates(value: Point): Self = StObject.set(x, "targetCoordinates", value.asInstanceOf[js.Any])
  }
}

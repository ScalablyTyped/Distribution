package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.System.VirtualKeyModifiers
import typings.winrt.Windows.UI.Input.PointerPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPointerEventArgs
  extends StObject
     with ICoreWindowEventArgs {
  
  var currentPoint: PointerPoint
  
  def getIntermediatePoints(): IVector[PointerPoint]
  
  var keyModifiers: VirtualKeyModifiers
}
object IPointerEventArgs {
  
  inline def apply(
    currentPoint: PointerPoint,
    getIntermediatePoints: () => IVector[PointerPoint],
    handled: Boolean,
    keyModifiers: VirtualKeyModifiers
  ): IPointerEventArgs = {
    val __obj = js.Dynamic.literal(currentPoint = currentPoint.asInstanceOf[js.Any], getIntermediatePoints = js.Any.fromFunction0(getIntermediatePoints), handled = handled.asInstanceOf[js.Any], keyModifiers = keyModifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointerEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPointerEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCurrentPoint(value: PointerPoint): Self = StObject.set(x, "currentPoint", value.asInstanceOf[js.Any])
    
    inline def setGetIntermediatePoints(value: () => IVector[PointerPoint]): Self = StObject.set(x, "getIntermediatePoints", js.Any.fromFunction0(value))
    
    inline def setKeyModifiers(value: VirtualKeyModifiers): Self = StObject.set(x, "keyModifiers", value.asInstanceOf[js.Any])
  }
}

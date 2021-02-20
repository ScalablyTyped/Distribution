package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.System.VirtualKeyModifiers
import typings.winrt.Windows.UI.Input.PointerPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPointerEventArgs extends ICoreWindowEventArgs {
  
  var currentPoint: PointerPoint = js.native
  
  def getIntermediatePoints(): IVector[PointerPoint] = js.native
  
  var keyModifiers: VirtualKeyModifiers = js.native
}
object IPointerEventArgs {
  
  @scala.inline
  def apply(
    currentPoint: PointerPoint,
    getIntermediatePoints: () => IVector[PointerPoint],
    handled: Boolean,
    keyModifiers: VirtualKeyModifiers
  ): IPointerEventArgs = {
    val __obj = js.Dynamic.literal(currentPoint = currentPoint.asInstanceOf[js.Any], getIntermediatePoints = js.Any.fromFunction0(getIntermediatePoints), handled = handled.asInstanceOf[js.Any], keyModifiers = keyModifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointerEventArgs]
  }
  
  @scala.inline
  implicit class IPointerEventArgsMutableBuilder[Self <: IPointerEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentPoint(value: PointerPoint): Self = StObject.set(x, "currentPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetIntermediatePoints(value: () => IVector[PointerPoint]): Self = StObject.set(x, "getIntermediatePoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeyModifiers(value: VirtualKeyModifiers): Self = StObject.set(x, "keyModifiers", value.asInstanceOf[js.Any])
  }
}

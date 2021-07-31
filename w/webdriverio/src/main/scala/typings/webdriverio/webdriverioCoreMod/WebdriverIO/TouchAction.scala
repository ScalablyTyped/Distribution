package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchAction extends StObject {
  
  var action: ActionTypes
  
  var element: js.UndefOr[Element] = js.undefined
  
  var ms: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object TouchAction {
  
  @scala.inline
  def apply(action: ActionTypes): TouchAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchAction]
  }
  
  @scala.inline
  implicit class TouchActionMutableBuilder[Self <: TouchAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ActionTypes): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setMs(value: Double): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}

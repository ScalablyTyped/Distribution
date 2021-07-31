package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObserveNodeRect extends StObject {
  
  /**
    * bottom
    */
  var bottom: js.UndefOr[Double] = js.undefined
  
  /**
    * left
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * right
    */
  var right: js.UndefOr[Double] = js.undefined
  
  /**
    * top
    */
  var top: js.UndefOr[Double] = js.undefined
}
object ObserveNodeRect {
  
  @scala.inline
  def apply(): ObserveNodeRect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObserveNodeRect]
  }
  
  @scala.inline
  implicit class ObserveNodeRectMutableBuilder[Self <: ObserveNodeRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}

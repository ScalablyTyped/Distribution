package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INumberPosition
  extends StObject
     with IPosition {
  
  @JSName("left")
  var left_INumberPosition: js.UndefOr[Double] = js.undefined
  
  @JSName("top")
  var top_INumberPosition: js.UndefOr[Double] = js.undefined
}
object INumberPosition {
  
  inline def apply(): INumberPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INumberPosition]
  }
  
  extension [Self <: INumberPosition](x: Self) {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}

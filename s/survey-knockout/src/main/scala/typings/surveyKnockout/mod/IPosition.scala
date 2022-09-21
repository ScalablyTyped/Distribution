package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPosition extends StObject {
  
  var left: js.UndefOr[String | Double] = js.undefined
  
  var top: js.UndefOr[String | Double] = js.undefined
}
object IPosition {
  
  inline def apply(): IPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPosition]
  }
  
  extension [Self <: IPosition](x: Self) {
    
    inline def setLeft(value: String | Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setTop(value: String | Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}

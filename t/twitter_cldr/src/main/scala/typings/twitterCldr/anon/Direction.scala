package typings.twitterCldr.anon

import typings.twitterCldr.mod.TimeUnit
import typings.twitterCldr.twitterCldrStrings.abbreviated
import typings.twitterCldr.twitterCldrStrings.none
import typings.twitterCldr.twitterCldrStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var approximate: js.UndefOr[Boolean] = js.undefined
  
  var direction: none
  
  var `type`: js.UndefOr[short | abbreviated] = js.undefined
  
  var unit: js.UndefOr[TimeUnit] = js.undefined
}
object Direction {
  
  inline def apply(): Direction = {
    val __obj = js.Dynamic.literal(direction = "none")
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
    
    inline def setApproximate(value: Boolean): Self = StObject.set(x, "approximate", value.asInstanceOf[js.Any])
    
    inline def setApproximateUndefined: Self = StObject.set(x, "approximate", js.undefined)
    
    inline def setDirection(value: none): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setType(value: short | abbreviated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnit(value: TimeUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}

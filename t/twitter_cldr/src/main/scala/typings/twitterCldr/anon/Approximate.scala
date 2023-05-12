package typings.twitterCldr.anon

import typings.twitterCldr.mod.TimeUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Approximate extends StObject {
  
  var approximate: js.UndefOr[Boolean] = js.undefined
  
  var unit: js.UndefOr[TimeUnit] = js.undefined
}
object Approximate {
  
  inline def apply(): Approximate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Approximate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Approximate] (val x: Self) extends AnyVal {
    
    inline def setApproximate(value: Boolean): Self = StObject.set(x, "approximate", value.asInstanceOf[js.Any])
    
    inline def setApproximateUndefined: Self = StObject.set(x, "approximate", js.undefined)
    
    inline def setUnit(value: TimeUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}

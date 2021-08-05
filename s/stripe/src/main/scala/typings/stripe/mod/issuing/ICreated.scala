package typings.stripe.mod.issuing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICreated extends StObject {
  
  /**
    * Return results where the created field is greater than this value.
    */
  var gt: js.UndefOr[Double] = js.undefined
  
  /**
    * Return results where the created field is greater than or equal to this value.
    */
  var gte: js.UndefOr[Double] = js.undefined
  
  /**
    * Return results where the created field is less than this value.
    */
  var lt: js.UndefOr[Double] = js.undefined
  
  /**
    * Return results where the created field is less than or equal to this value.
    */
  var lte: js.UndefOr[Double] = js.undefined
}
object ICreated {
  
  inline def apply(): ICreated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreated]
  }
  
  extension [Self <: ICreated](x: Self) {
    
    inline def setGt(value: Double): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    inline def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
    
    inline def setGte(value: Double): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
    
    inline def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
    
    inline def setLt(value: Double): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    inline def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
    
    inline def setLte(value: Double): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
    
    inline def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
  }
}

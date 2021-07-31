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
  
  @scala.inline
  def apply(): ICreated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreated]
  }
  
  @scala.inline
  implicit class ICreatedMutableBuilder[Self <: ICreated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGt(value: Double): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
    
    @scala.inline
    def setGte(value: Double): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
    
    @scala.inline
    def setLt(value: Double): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
    
    @scala.inline
    def setLte(value: Double): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
  }
}

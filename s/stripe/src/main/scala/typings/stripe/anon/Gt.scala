package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gt extends StObject {
  
  /**
    * Return values where the created field is after this timestamp.
    */
  var gt: js.UndefOr[String] = js.undefined
  
  /**
    * Return values where the created field is after or equal to this timestamp.
    */
  var gte: js.UndefOr[String] = js.undefined
  
  /**
    * Return values where the created field is before this timestamp.
    */
  var lt: js.UndefOr[String] = js.undefined
  
  /**
    * Return values where the created field is before or equal to this timestamp.
    */
  var lte: js.UndefOr[String] = js.undefined
}
object Gt {
  
  @scala.inline
  def apply(): Gt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gt]
  }
  
  @scala.inline
  implicit class GtMutableBuilder[Self <: Gt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGt(value: String): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
    
    @scala.inline
    def setGte(value: String): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
    
    @scala.inline
    def setLt(value: String): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
    
    @scala.inline
    def setLte(value: String): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
  }
}

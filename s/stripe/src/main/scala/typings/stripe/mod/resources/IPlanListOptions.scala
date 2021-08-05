package typings.stripe.mod.resources

import typings.stripe.mod.IListOptionsCreated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlanListOptions
  extends StObject
     with IListOptionsCreated {
  
  /**
    * Only return plans that are active or inactive (e.g., pass false to list all inactive products).
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only return plans for the given product.
    */
  var product: js.UndefOr[String] = js.undefined
}
object IPlanListOptions {
  
  inline def apply(): IPlanListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlanListOptions]
  }
  
  extension [Self <: IPlanListOptions](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
  }
}

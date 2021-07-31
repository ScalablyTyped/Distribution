package typings.stripe.mod.accounts

import typings.stripe.mod.IListOptions
import typings.stripe.stripeStrings.card
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICardListOptions
  extends StObject
     with IListOptions {
  
  var `object`: card
}
object ICardListOptions {
  
  @scala.inline
  def apply(): ICardListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")("card")
    __obj.asInstanceOf[ICardListOptions]
  }
  
  @scala.inline
  implicit class ICardListOptionsMutableBuilder[Self <: ICardListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: card): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}

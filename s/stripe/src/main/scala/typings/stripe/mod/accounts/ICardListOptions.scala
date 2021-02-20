package typings.stripe.mod.accounts

import typings.stripe.mod.IListOptions
import typings.stripe.stripeStrings.card
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICardListOptions extends IListOptions {
  
  var `object`: card = js.native
}
object ICardListOptions {
  
  @scala.inline
  def apply(`object`: card): ICardListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardListOptions]
  }
  
  @scala.inline
  implicit class ICardListOptionsMutableBuilder[Self <: ICardListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: card): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}

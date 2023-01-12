package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChargeOptions
  extends StObject
     with Options {
  
  var authorizeOnly: js.UndefOr[Boolean] = js.undefined
  
  var charge: ChargeDropin
  
  def onSuccess(charge: Charge): Unit
  @JSName("onSuccess")
  var onSuccess_Original: ChargeOnSuccess
  
  var tip: js.UndefOr[TipDataDropin] = js.undefined
}
object ChargeOptions {
  
  inline def apply(charge: ChargeDropin, onSuccess: /* charge */ Charge => Unit): ChargeOptions = {
    val __obj = js.Dynamic.literal(charge = charge.asInstanceOf[js.Any], onSuccess = js.Any.fromFunction1(onSuccess))
    __obj.asInstanceOf[ChargeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChargeOptions] (val x: Self) extends AnyVal {
    
    inline def setAuthorizeOnly(value: Boolean): Self = StObject.set(x, "authorizeOnly", value.asInstanceOf[js.Any])
    
    inline def setAuthorizeOnlyUndefined: Self = StObject.set(x, "authorizeOnly", js.undefined)
    
    inline def setCharge(value: ChargeDropin): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
    
    inline def setOnSuccess(value: /* charge */ Charge => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
    
    inline def setTip(value: TipDataDropin): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
    
    inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
  }
}

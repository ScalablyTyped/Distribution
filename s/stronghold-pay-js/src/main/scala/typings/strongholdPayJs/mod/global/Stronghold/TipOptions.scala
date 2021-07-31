package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TipOptions
  extends StObject
     with Options {
  
  var authorizeOnly: js.UndefOr[Boolean] = js.undefined
  
  def onSuccess(tip: Tip): Unit
  @JSName("onSuccess")
  var onSuccess_Original: TipOnSuccess
  
  var tip: TipDropin
}
object TipOptions {
  
  @scala.inline
  def apply(onSuccess: /* tip */ Tip => Unit, tip: TipDropin): TipOptions = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction1(onSuccess), tip = tip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipOptions]
  }
  
  @scala.inline
  implicit class TipOptionsMutableBuilder[Self <: TipOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizeOnly(value: Boolean): Self = StObject.set(x, "authorizeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizeOnlyUndefined: Self = StObject.set(x, "authorizeOnly", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: /* tip */ Tip => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTip(value: TipDropin): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
  }
}

package typings.twitterCldr.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currencycodes extends StObject {
  
  def currency_codes(): js.Array[String]
  
  def for_code(currencyCode: String): typings.twitterCldr.mod.Currency
}
object Currencycodes {
  
  inline def apply(currency_codes: () => js.Array[String], for_code: String => typings.twitterCldr.mod.Currency): Currencycodes = {
    val __obj = js.Dynamic.literal(currency_codes = js.Any.fromFunction0(currency_codes), for_code = js.Any.fromFunction1(for_code))
    __obj.asInstanceOf[Currencycodes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Currencycodes] (val x: Self) extends AnyVal {
    
    inline def setCurrency_codes(value: () => js.Array[String]): Self = StObject.set(x, "currency_codes", js.Any.fromFunction0(value))
    
    inline def setFor_code(value: String => typings.twitterCldr.mod.Currency): Self = StObject.set(x, "for_code", js.Any.fromFunction1(value))
  }
}

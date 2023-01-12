package typings.tpdirect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinePay extends StObject {
  
  def getPrime(callback: js.Function1[/* result */ LinePayGetPrimeResult, Unit]): Unit
}
object LinePay {
  
  inline def apply(getPrime: js.Function1[/* result */ LinePayGetPrimeResult, Unit] => Unit): LinePay = {
    val __obj = js.Dynamic.literal(getPrime = js.Any.fromFunction1(getPrime))
    __obj.asInstanceOf[LinePay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinePay] (val x: Self) extends AnyVal {
    
    inline def setGetPrime(value: js.Function1[/* result */ LinePayGetPrimeResult, Unit] => Unit): Self = StObject.set(x, "getPrime", js.Any.fromFunction1(value))
  }
}

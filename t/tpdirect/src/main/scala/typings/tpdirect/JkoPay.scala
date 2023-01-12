package typings.tpdirect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JkoPay extends StObject {
  
  def getPrime(callback: js.Function1[/* result */ BaseResult, Unit]): Unit
}
object JkoPay {
  
  inline def apply(getPrime: js.Function1[/* result */ BaseResult, Unit] => Unit): JkoPay = {
    val __obj = js.Dynamic.literal(getPrime = js.Any.fromFunction1(getPrime))
    __obj.asInstanceOf[JkoPay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JkoPay] (val x: Self) extends AnyVal {
    
    inline def setGetPrime(value: js.Function1[/* result */ BaseResult, Unit] => Unit): Self = StObject.set(x, "getPrime", js.Any.fromFunction1(value))
  }
}

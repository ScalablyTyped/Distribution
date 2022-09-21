package typings.tpdirect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EasyWallet extends StObject {
  
  def getPrime(callback: js.Function1[/* result */ BaseResult, Unit]): Unit
}
object EasyWallet {
  
  inline def apply(getPrime: js.Function1[/* result */ BaseResult, Unit] => Unit): EasyWallet = {
    val __obj = js.Dynamic.literal(getPrime = js.Any.fromFunction1(getPrime))
    __obj.asInstanceOf[EasyWallet]
  }
  
  extension [Self <: EasyWallet](x: Self) {
    
    inline def setGetPrime(value: js.Function1[/* result */ BaseResult, Unit] => Unit): Self = StObject.set(x, "getPrime", js.Any.fromFunction1(value))
  }
}

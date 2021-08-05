package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGetActivationFactory extends StObject {
  
  def getActivationFactory(activatableClassId: String): js.Any
}
object IGetActivationFactory {
  
  inline def apply(getActivationFactory: String => js.Any): IGetActivationFactory = {
    val __obj = js.Dynamic.literal(getActivationFactory = js.Any.fromFunction1(getActivationFactory))
    __obj.asInstanceOf[IGetActivationFactory]
  }
  
  extension [Self <: IGetActivationFactory](x: Self) {
    
    inline def setGetActivationFactory(value: String => js.Any): Self = StObject.set(x, "getActivationFactory", js.Any.fromFunction1(value))
  }
}

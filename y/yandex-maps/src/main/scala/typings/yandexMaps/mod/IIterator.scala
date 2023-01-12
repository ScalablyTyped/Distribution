package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIterator extends StObject {
  
  def getNext(): js.Object | Null
}
object IIterator {
  
  inline def apply(getNext: () => js.Object | Null): IIterator = {
    val __obj = js.Dynamic.literal(getNext = js.Any.fromFunction0(getNext))
    __obj.asInstanceOf[IIterator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IIterator] (val x: Self) extends AnyVal {
    
    inline def setGetNext(value: () => js.Object | Null): Self = StObject.set(x, "getNext", js.Any.fromFunction0(value))
  }
}

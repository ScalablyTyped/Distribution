package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICollection
  extends StObject
     with IEventEmitter {
  
  def add(`object`: js.Object): this.type
  
  def getIterator(): IIterator
  
  def remove(`object`: js.Object): this.type
}
object ICollection {
  
  inline def apply(
    add: js.Object => ICollection,
    events: IEventManager[js.Object],
    getIterator: () => IIterator,
    remove: js.Object => ICollection
  ): ICollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), events = events.asInstanceOf[js.Any], getIterator = js.Any.fromFunction0(getIterator), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[ICollection]
  }
  
  extension [Self <: ICollection](x: Self) {
    
    inline def setAdd(value: js.Object => ICollection): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setGetIterator(value: () => IIterator): Self = StObject.set(x, "getIterator", js.Any.fromFunction0(value))
    
    inline def setRemove(value: js.Object => ICollection): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}

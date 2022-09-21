package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.DataAny
import typings.wxServerSdk.anon.Id
import typings.wxServerSdk.anon.Stats
import typings.wxServerSdk.anon.Stats1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  def get(): js.Promise[DataAny]
  
  def remove(): js.Promise[Stats1]
  
  def set(options: CommonOption[Any]): js.Promise[Id]
  
  def update(options: CommonOption[Any]): js.Promise[Stats]
}
object Document {
  
  inline def apply(
    get: () => js.Promise[DataAny],
    remove: () => js.Promise[Stats1],
    set: CommonOption[Any] => js.Promise[Id],
    update: CommonOption[Any] => js.Promise[Stats]
  ): Document = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), remove = js.Any.fromFunction0(remove), set = js.Any.fromFunction1(set), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Document]
  }
  
  extension [Self <: Document](x: Self) {
    
    inline def setGet(value: () => js.Promise[DataAny]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => js.Promise[Stats1]): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setSet(value: CommonOption[Any] => js.Promise[Id]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: CommonOption[Any] => js.Promise[Stats]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}

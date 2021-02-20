package typings.wxServerSdk.mod

import typings.wxServerSdk.anon.DataAny
import typings.wxServerSdk.anon.Id
import typings.wxServerSdk.anon.Stats
import typings.wxServerSdk.anon.Stats1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends StObject {
  
  def get(): js.Promise[DataAny] = js.native
  
  def remove(): js.Promise[Stats1] = js.native
  
  def set(options: CommonOption[_]): js.Promise[Id] = js.native
  
  def update(options: CommonOption[_]): js.Promise[Stats] = js.native
}
object Document {
  
  @scala.inline
  def apply(
    get: () => js.Promise[DataAny],
    remove: () => js.Promise[Stats1],
    set: CommonOption[_] => js.Promise[Id],
    update: CommonOption[_] => js.Promise[Stats]
  ): Document = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), remove = js.Any.fromFunction0(remove), set = js.Any.fromFunction1(set), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: () => js.Promise[DataAny]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => js.Promise[Stats1]): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: CommonOption[_] => js.Promise[Id]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: CommonOption[_] => js.Promise[Stats]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}

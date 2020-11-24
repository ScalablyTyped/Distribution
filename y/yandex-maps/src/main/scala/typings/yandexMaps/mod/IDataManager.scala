package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataManager extends IEventEmitter {
  
  def get(path: String, defaultValue: js.Object): js.Object = js.native
}
object IDataManager {
  
  @scala.inline
  def apply(events: IEventManager[js.Object], get: (String, js.Object) => js.Object): IDataManager = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[IDataManager]
  }
  
  @scala.inline
  implicit class IDataManagerOps[Self <: IDataManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: (String, js.Object) => js.Object): Self = this.set("get", js.Any.fromFunction2(value))
  }
}

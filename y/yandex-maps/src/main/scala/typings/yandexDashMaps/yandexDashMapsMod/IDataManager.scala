package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataManager extends IEventEmitter {
  def get(path: String, defaultValue: js.Object): js.Object
}

object IDataManager {
  @scala.inline
  def apply(events: IEventManager, get: (String, js.Object) => js.Object): IDataManager = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], get = js.Any.fromFunction2(get))
  
    __obj.asInstanceOf[IDataManager]
  }
}


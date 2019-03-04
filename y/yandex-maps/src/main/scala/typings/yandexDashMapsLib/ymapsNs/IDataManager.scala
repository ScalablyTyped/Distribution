package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataManager extends IEventEmitter {
  def get(path: java.lang.String, defaultValue: js.Object): js.Object
}

object IDataManager {
  @scala.inline
  def apply(events: IEventManager, get: js.Function2[java.lang.String, js.Object, js.Object]): IDataManager = {
    val __obj = js.Dynamic.literal(events = events, get = get)
  
    __obj.asInstanceOf[IDataManager]
  }
}


package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeometryEditorModel extends IEventEmitter {
  def destroy(): Unit
  def getPixels(): js.Array[Double]
}

object IGeometryEditorModel {
  @scala.inline
  def apply(destroy: () => Unit, events: IEventManager, getPixels: () => js.Array[Double]): IGeometryEditorModel = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], getPixels = js.Any.fromFunction0(getPixels))
  
    __obj.asInstanceOf[IGeometryEditorModel]
  }
}


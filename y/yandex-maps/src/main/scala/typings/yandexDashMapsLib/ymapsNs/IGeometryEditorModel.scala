package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeometryEditorModel extends IEventEmitter {
  def destroy(): scala.Unit
  def getPixels(): js.Array[scala.Double]
}

object IGeometryEditorModel {
  @scala.inline
  def apply(destroy: () => scala.Unit, events: IEventManager, getPixels: () => js.Array[scala.Double]): IGeometryEditorModel = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), events = events, getPixels = js.Any.fromFunction0(getPixels))
  
    __obj.asInstanceOf[IGeometryEditorModel]
  }
}


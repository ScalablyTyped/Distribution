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
  def apply(
    destroy: js.Function0[scala.Unit],
    events: IEventManager,
    getPixels: js.Function0[js.Array[scala.Double]]
  ): IGeometryEditorModel = {
    val __obj = js.Dynamic.literal(destroy = destroy, events = events, getPixels = getPixels)
  
    __obj.asInstanceOf[IGeometryEditorModel]
  }
}


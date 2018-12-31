package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapAction extends IEventEmitter {
  def begin(mapActionManager: yandexDashMapsLib.ymapsNs.mapNs.actionNs.Manager): scala.Unit
  def end(): scala.Unit
}


package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoutePanel extends js.Object {
  var options: IOptionManager
  var state: IDataManager
  def getRoute(): yandexDashMapsLib.ymapsNs.multiRouterNs.MultiRoute
  def switchPoints(): scala.Unit
}


package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeometryEditor extends ICustomizable {
  var geometry: IGeometry
  var state: IDataManager
  def startEditing(): scala.Unit
  def stopEditing(): scala.Unit
}


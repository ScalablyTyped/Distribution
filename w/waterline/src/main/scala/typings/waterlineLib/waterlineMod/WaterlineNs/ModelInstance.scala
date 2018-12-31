package typings
package waterlineLib.waterlineMod.WaterlineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelInstance extends js.Object {
  var createdAt: js.UndefOr[stdLib.Date] = js.undefined
  var id: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var updatedAt: js.UndefOr[stdLib.Date] = js.undefined
  def save(): WaterlinePromise[this.type]
  def toJSON(): js.Any
}


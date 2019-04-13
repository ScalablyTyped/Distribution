package typings
package waterlineLib.waterlineMod

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

object ModelInstance {
  @scala.inline
  def apply(
    save: () => WaterlinePromise[ModelInstance],
    toJSON: () => js.Any,
    createdAt: stdLib.Date = null,
    id: scala.Double | java.lang.String = null,
    updatedAt: stdLib.Date = null
  ): ModelInstance = {
    val __obj = js.Dynamic.literal(save = js.Any.fromFunction0(save), toJSON = js.Any.fromFunction0(toJSON))
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt)
    __obj.asInstanceOf[ModelInstance]
  }
}


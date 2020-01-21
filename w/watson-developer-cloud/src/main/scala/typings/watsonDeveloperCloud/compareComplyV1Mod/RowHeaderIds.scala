package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An array of values, each being the `id` value of a row header that is applicable to this body cell. */
trait RowHeaderIds extends js.Object {
  /** The `id` values of a row header. */
  var id: js.UndefOr[String] = js.undefined
}

object RowHeaderIds {
  @scala.inline
  def apply(id: String = null): RowHeaderIds = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowHeaderIds]
  }
}


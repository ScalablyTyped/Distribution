package typings.superstruct

import typings.std.Record
import typings.superstruct.typesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<superstruct.superstruct/lib/superstruct.SuperstructSettings> */
trait PartialSuperstructSetting extends js.Object {
  var error: js.UndefOr[AnonInstantiable] = js.undefined
  var types: js.UndefOr[Record[String, Validator]] = js.undefined
}

object PartialSuperstructSetting {
  @scala.inline
  def apply(error: AnonInstantiable = null, types: Record[String, Validator] = null): PartialSuperstructSetting = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSuperstructSetting]
  }
}


package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Field. */
trait Field extends js.Object {
  /** The name of the field. */
  var field_name: js.UndefOr[String] = js.undefined
  /** The type of the field. */
  var field_type: js.UndefOr[String] = js.undefined
}

object Field {
  @scala.inline
  def apply(field_name: String = null, field_type: String = null): Field = {
    val __obj = js.Dynamic.literal()
    if (field_name != null) __obj.updateDynamic("field_name")(field_name.asInstanceOf[js.Any])
    if (field_type != null) __obj.updateDynamic("field_type")(field_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}


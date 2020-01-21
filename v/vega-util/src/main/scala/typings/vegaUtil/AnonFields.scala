package typings.vegaUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFields extends js.Object {
  var fields: js.Array[String]
  var fname: js.UndefOr[String] = js.undefined
}

object AnonFields {
  @scala.inline
  def apply(fields: js.Array[String], fname: String = null): AnonFields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    if (fname != null) __obj.updateDynamic("fname")(fname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFields]
  }
}


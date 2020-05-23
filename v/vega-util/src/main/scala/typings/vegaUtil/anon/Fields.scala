package typings.vegaUtil.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  var fields: js.Array[String]
  var fname: js.UndefOr[String] = js.undefined
}

object Fields {
  @scala.inline
  def apply(fields: js.Array[String], fname: String = null): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    if (fname != null) __obj.updateDynamic("fname")(fname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}


package typings.ts3DashNodejsDashLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: String
  var value: js.UndefOr[String] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(key: String, value: String = null): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}


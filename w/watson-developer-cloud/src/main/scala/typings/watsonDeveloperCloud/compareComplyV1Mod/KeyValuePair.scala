package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Key-value pairs detected across cell boundaries. */
trait KeyValuePair extends js.Object {
  /** A key in a key-value pair. */
  var key: js.UndefOr[Key] = js.undefined
  /** A value in a key-value pair. */
  var value: js.UndefOr[Value] = js.undefined
}

object KeyValuePair {
  @scala.inline
  def apply(key: Key = null, value: Value = null): KeyValuePair = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValuePair]
  }
}


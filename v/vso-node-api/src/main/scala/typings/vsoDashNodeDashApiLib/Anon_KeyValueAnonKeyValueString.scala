package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValueAnonKeyValueString extends js.Object {
  var key: java.lang.String
  var value: js.Array[Anon_KeyValueString]
}

object Anon_KeyValueAnonKeyValueString {
  @scala.inline
  def apply(key: java.lang.String, value: js.Array[Anon_KeyValueString]): Anon_KeyValueAnonKeyValueString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_KeyValueAnonKeyValueString]
  }
}


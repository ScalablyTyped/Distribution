package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValueAny extends js.Object {
  var key: java.lang.String
  var value: js.Any
}

object Anon_KeyValueAny {
  @scala.inline
  def apply(key: java.lang.String, value: js.Any): Anon_KeyValueAny = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_KeyValueAny]
  }
}


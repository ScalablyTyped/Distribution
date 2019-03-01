package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValueString extends js.Object {
  var key: java.lang.String
  var value: java.lang.String
}

object Anon_KeyValueString {
  @scala.inline
  def apply(key: java.lang.String, value: java.lang.String): Anon_KeyValueString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_KeyValueString]
  }
}


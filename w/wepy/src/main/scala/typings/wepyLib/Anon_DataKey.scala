package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataKey extends js.Object {
  var data: java.lang.String | js.Object
  var key: java.lang.String
}

object Anon_DataKey {
  @scala.inline
  def apply(data: java.lang.String | js.Object, key: java.lang.String): Anon_DataKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_DataKey]
  }
}


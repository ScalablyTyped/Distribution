package typings.web3Core.mod

import typings.web3CoreMethod.mod.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends js.Object {
  var methods: js.Array[Method]
  var property: js.UndefOr[String] = js.undefined
}

object Extension {
  @scala.inline
  def apply(methods: js.Array[Method], property: String = null): Extension = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
}


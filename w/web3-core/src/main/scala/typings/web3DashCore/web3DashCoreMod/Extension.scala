package typings.web3DashCore.web3DashCoreMod

import typings.web3DashCoreDashMethod.web3DashCoreDashMethodMod.Method
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
    val __obj = js.Dynamic.literal(methods = methods)
    if (property != null) __obj.updateDynamic("property")(property)
    __obj.asInstanceOf[Extension]
  }
}


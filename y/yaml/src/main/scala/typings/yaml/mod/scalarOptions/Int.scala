package typings.yaml.mod.scalarOptions

import typings.yaml.yamlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Int extends js.Object {
  /**
    * Whether integers should be parsed into BigInt values.
    *
    * Default: `false`
    */
  var asBigInt: `false`
}

object Int {
  @scala.inline
  def apply(asBigInt: `false`): Int = {
    val __obj = js.Dynamic.literal(asBigInt = asBigInt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Int]
  }
}


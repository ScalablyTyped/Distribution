package typings.yaml.mod.scalarOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bool extends js.Object {
  /**
    * String representation for `false`. With the core schema, use `'false' | 'False' | 'FALSE'`.
    *
    * Default: `'false'`
    */
  var falseStr: String
  /**
    * String representation for `true`. With the core schema, use `'true' | 'True' | 'TRUE'`.
    *
    * Default: `'true'`
    */
  var trueStr: String
}

object Bool {
  @scala.inline
  def apply(falseStr: String, trueStr: String): Bool = {
    val __obj = js.Dynamic.literal(falseStr = falseStr.asInstanceOf[js.Any], trueStr = trueStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bool]
  }
}


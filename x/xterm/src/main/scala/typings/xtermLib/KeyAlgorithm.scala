package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyAlgorithm extends js.Object {
  var name: java.lang.String
}

object KeyAlgorithm {
  @scala.inline
  def apply(name: java.lang.String): KeyAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[KeyAlgorithm]
  }
}


package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesKeyAlgorithm extends KeyAlgorithm {
  var length: scala.Double
}

object AesKeyAlgorithm {
  @scala.inline
  def apply(length: scala.Double, name: java.lang.String): AesKeyAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AesKeyAlgorithm]
  }
}


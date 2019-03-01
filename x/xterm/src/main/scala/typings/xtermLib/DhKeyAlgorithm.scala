package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DhKeyAlgorithm extends KeyAlgorithm {
  var generator: stdLib.Uint8Array
  var prime: stdLib.Uint8Array
}

object DhKeyAlgorithm {
  @scala.inline
  def apply(generator: stdLib.Uint8Array, name: java.lang.String, prime: stdLib.Uint8Array): DhKeyAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generator")(generator)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("prime")(prime)
    __obj.asInstanceOf[DhKeyAlgorithm]
  }
}


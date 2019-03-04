package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DhKeyGenParams extends Algorithm {
  var generator: stdLib.Uint8Array
  var prime: stdLib.Uint8Array
}

object DhKeyGenParams {
  @scala.inline
  def apply(generator: stdLib.Uint8Array, name: java.lang.String, prime: stdLib.Uint8Array): DhKeyGenParams = {
    val __obj = js.Dynamic.literal(generator = generator, name = name, prime = prime)
  
    __obj.asInstanceOf[DhKeyGenParams]
  }
}


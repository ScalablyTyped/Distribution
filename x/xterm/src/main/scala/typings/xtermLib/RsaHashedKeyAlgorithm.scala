package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaHashedKeyAlgorithm extends RsaKeyAlgorithm {
  var hash: KeyAlgorithm
}

object RsaHashedKeyAlgorithm {
  @scala.inline
  def apply(
    hash: KeyAlgorithm,
    modulusLength: scala.Double,
    name: java.lang.String,
    publicExponent: BigInteger
  ): RsaHashedKeyAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("modulusLength")(modulusLength)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("publicExponent")(publicExponent)
    __obj.asInstanceOf[RsaHashedKeyAlgorithm]
  }
}


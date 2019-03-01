package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EcKeyGenParams extends Algorithm {
  var namedCurve: NamedCurve
}

object EcKeyGenParams {
  @scala.inline
  def apply(name: java.lang.String, namedCurve: NamedCurve): EcKeyGenParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namedCurve")(namedCurve)
    __obj.asInstanceOf[EcKeyGenParams]
  }
}


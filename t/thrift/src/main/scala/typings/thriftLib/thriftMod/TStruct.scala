package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TStruct extends js.Object {
  var fname: java.lang.String
}

object TStruct {
  @scala.inline
  def apply(fname: java.lang.String): TStruct = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fname")(fname)
    __obj.asInstanceOf[TStruct]
  }
}


package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSet extends js.Object {
  var etype: thriftLib.thriftMod.ThriftNs.Type
  var size: scala.Double
}

object TSet {
  @scala.inline
  def apply(etype: thriftLib.thriftMod.ThriftNs.Type, size: scala.Double): TSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("etype")(etype)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[TSet]
  }
}


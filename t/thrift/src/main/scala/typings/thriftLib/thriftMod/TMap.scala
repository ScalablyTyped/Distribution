package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TMap extends js.Object {
  var ktype: thriftLib.thriftMod.ThriftNs.Type
  var size: scala.Double
  var vtype: thriftLib.thriftMod.ThriftNs.Type
}

object TMap {
  @scala.inline
  def apply(
    ktype: thriftLib.thriftMod.ThriftNs.Type,
    size: scala.Double,
    vtype: thriftLib.thriftMod.ThriftNs.Type
  ): TMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ktype")(ktype)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("vtype")(vtype)
    __obj.asInstanceOf[TMap]
  }
}


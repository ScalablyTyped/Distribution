package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TList extends js.Object {
  var etype: thriftLib.thriftMod.ThriftNs.Type
  var size: scala.Double
}

object TList {
  @scala.inline
  def apply(etype: thriftLib.thriftMod.ThriftNs.Type, size: scala.Double): TList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("etype")(etype)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[TList]
  }
}


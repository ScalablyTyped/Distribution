package typings.thrift.thriftMod

import typings.thrift.thriftMod.ThriftNs.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TMap extends js.Object {
  var ktype: Type
  var size: Double
  var vtype: Type
}

object TMap {
  @scala.inline
  def apply(ktype: Type, size: Double, vtype: Type): TMap = {
    val __obj = js.Dynamic.literal(ktype = ktype, size = size, vtype = vtype)
  
    __obj.asInstanceOf[TMap]
  }
}


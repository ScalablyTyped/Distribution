package typings.thrift.thriftMod

import typings.thrift.thriftMod.Thrift.Type
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
    val __obj = js.Dynamic.literal(ktype = ktype.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], vtype = vtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TMap]
  }
}


package typings.thrift.thriftMod

import typings.thrift.thriftMod.Thrift.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSet extends js.Object {
  var etype: Type
  var size: Double
}

object TSet {
  @scala.inline
  def apply(etype: Type, size: Double): TSet = {
    val __obj = js.Dynamic.literal(etype = etype.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TSet]
  }
}


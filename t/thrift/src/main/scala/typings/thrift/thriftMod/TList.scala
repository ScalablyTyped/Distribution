package typings.thrift.thriftMod

import typings.thrift.thriftMod.Thrift.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TList extends js.Object {
  var etype: Type
  var size: Double
}

object TList {
  @scala.inline
  def apply(etype: Type, size: Double): TList = {
    val __obj = js.Dynamic.literal(etype = etype, size = size)
  
    __obj.asInstanceOf[TList]
  }
}


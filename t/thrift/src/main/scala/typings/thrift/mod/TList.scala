package typings.thrift.mod

import typings.thrift.mod.Thrift.Type
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
    val __obj = js.Dynamic.literal(etype = etype.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TList]
  }
}


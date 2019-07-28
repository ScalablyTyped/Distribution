package typings.thrift.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TStruct extends js.Object {
  var fname: String
}

object TStruct {
  @scala.inline
  def apply(fname: String): TStruct = {
    val __obj = js.Dynamic.literal(fname = fname)
  
    __obj.asInstanceOf[TStruct]
  }
}


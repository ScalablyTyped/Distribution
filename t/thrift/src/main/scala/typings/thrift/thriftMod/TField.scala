package typings.thrift.thriftMod

import typings.thrift.thriftMod.ThriftNs.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TField extends js.Object {
  var fid: Double
  var fname: String
  var ftype: Type
}

object TField {
  @scala.inline
  def apply(fid: Double, fname: String, ftype: Type): TField = {
    val __obj = js.Dynamic.literal(fid = fid, fname = fname, ftype = ftype)
  
    __obj.asInstanceOf[TField]
  }
}


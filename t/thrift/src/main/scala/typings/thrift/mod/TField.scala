package typings.thrift.mod

import typings.thrift.mod.Thrift.Type
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
    val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], fname = fname.asInstanceOf[js.Any], ftype = ftype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TField]
  }
}


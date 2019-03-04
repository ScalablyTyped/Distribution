package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TField extends js.Object {
  var fid: scala.Double
  var fname: java.lang.String
  var ftype: thriftLib.thriftMod.ThriftNs.Type
}

object TField {
  @scala.inline
  def apply(fid: scala.Double, fname: java.lang.String, ftype: thriftLib.thriftMod.ThriftNs.Type): TField = {
    val __obj = js.Dynamic.literal(fid = fid, fname = fname, ftype = ftype)
  
    __obj.asInstanceOf[TField]
  }
}


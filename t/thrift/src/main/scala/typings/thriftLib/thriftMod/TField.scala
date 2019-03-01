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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fid")(fid)
    __obj.updateDynamic("fname")(fname)
    __obj.updateDynamic("ftype")(ftype)
    __obj.asInstanceOf[TField]
  }
}


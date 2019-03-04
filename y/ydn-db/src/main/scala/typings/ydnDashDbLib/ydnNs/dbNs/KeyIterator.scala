package typings
package ydnDashDbLib.ydnNs.dbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ydn.db.KeyIterator")
@js.native
class KeyIterator protected () extends Iterator {
  def this(store_name: java.lang.String) = this()
  def this(store_name: java.lang.String, key_range: js.Any) = this()
  def this(store_name: java.lang.String, key_range: js.Any, reverse: scala.Boolean) = this()
}

/* static members */
@JSGlobal("ydn.db.KeyIterator")
@js.native
object KeyIterator extends js.Object {
  def where(
    store_name: java.lang.String,
    op: ydnDashDbLib.ydnNs.dbNs.Op,
    value: js.Any,
    op2: ydnDashDbLib.ydnNs.dbNs.Op,
    value2: js.Any
  ): js.Any = js.native
}


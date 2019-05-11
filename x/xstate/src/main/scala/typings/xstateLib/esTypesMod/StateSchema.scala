package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateSchema extends js.Object {
  var meta: js.UndefOr[js.Any] = js.undefined
  var states: js.UndefOr[stdLib.Record[java.lang.String | scala.Double, StateSchema]] = js.undefined
}

object StateSchema {
  @scala.inline
  def apply(meta: js.Any = null, states: stdLib.Record[java.lang.String | scala.Double, StateSchema] = null): StateSchema = {
    val __obj = js.Dynamic.literal()
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (states != null) __obj.updateDynamic("states")(states)
    __obj.asInstanceOf[StateSchema]
  }
}


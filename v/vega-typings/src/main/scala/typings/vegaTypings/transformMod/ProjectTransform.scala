package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.project
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectTransform extends _Transforms {
  var as: js.UndefOr[(js.Array[String | SignalRef | Null]) | SignalRef] = js.undefined
  var fields: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  var `type`: project
}

object ProjectTransform {
  @scala.inline
  def apply(
    `type`: project,
    as: (js.Array[String | SignalRef | Null]) | SignalRef = null,
    fields: js.Array[FieldRef] | SignalRef = null
  ): ProjectTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectTransform]
  }
}


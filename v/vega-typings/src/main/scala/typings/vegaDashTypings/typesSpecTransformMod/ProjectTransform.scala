package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.project
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectTransform extends Transforms {
  var as: js.UndefOr[String | Null | SignalRef] = js.undefined
  var fields: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  var `type`: project
}

object ProjectTransform {
  @scala.inline
  def apply(`type`: project, as: String | SignalRef = null, fields: js.Array[FieldRef] | SignalRef = null): ProjectTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectTransform]
  }
}


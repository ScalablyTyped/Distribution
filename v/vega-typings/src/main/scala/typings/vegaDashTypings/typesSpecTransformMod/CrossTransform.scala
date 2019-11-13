package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecUtilMod.Vector2
import typings.vegaDashTypings.vegaDashTypingsStrings.cross
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossTransform extends Transforms {
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  var filter: js.UndefOr[ExprString] = js.undefined
  var `type`: cross
}

object CrossTransform {
  @scala.inline
  def apply(`type`: cross, as: (Vector2[String | SignalRef]) | SignalRef = null, filter: ExprString = null): CrossTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[CrossTransform]
  }
}


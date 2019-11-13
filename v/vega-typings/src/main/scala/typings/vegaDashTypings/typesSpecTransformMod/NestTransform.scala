package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.nest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestTransform extends Transforms {
  var generate: js.UndefOr[Boolean | SignalRef] = js.undefined
  var keys: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  var `type`: nest
}

object NestTransform {
  @scala.inline
  def apply(`type`: nest, generate: Boolean | SignalRef = null, keys: js.Array[FieldRef] | SignalRef = null): NestTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (generate != null) __obj.updateDynamic("generate")(generate.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestTransform]
  }
}


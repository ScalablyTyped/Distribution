package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.sample
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SampleTransform extends _Transforms {
  var size: Double | SignalRef
  var `type`: sample
}

object SampleTransform {
  @scala.inline
  def apply(size: Double | SignalRef, `type`: sample): SampleTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SampleTransform]
  }
}


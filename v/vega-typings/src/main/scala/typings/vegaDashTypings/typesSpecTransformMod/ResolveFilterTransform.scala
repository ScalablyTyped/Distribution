package typings.vegaDashTypings.typesSpecTransformMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.vegaDashTypingsStrings.resolvefilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveFilterTransform extends Transforms {
  var filter: SignalRef
  var ignore: Double | SignalRef
  var `type`: resolvefilter
}

object ResolveFilterTransform {
  @scala.inline
  def apply(filter: SignalRef, ignore: Double | SignalRef, `type`: resolvefilter): ResolveFilterTransform = {
    val __obj = js.Dynamic.literal(filter = filter, ignore = ignore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResolveFilterTransform]
  }
}


package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.resolvefilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveFilterTransform extends _Transforms {
  var filter: SignalRef
  var ignore: Double | SignalRef
  var `type`: resolvefilter
}

object ResolveFilterTransform {
  @scala.inline
  def apply(filter: SignalRef, ignore: Double | SignalRef, `type`: resolvefilter): ResolveFilterTransform = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveFilterTransform]
  }
}


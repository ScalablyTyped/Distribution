package typings
package svgDashPanDashZoomLib.SvgPanZoomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomEventHandler extends js.Object {
  var destroy: js.Function
  var haltEventListeners: js.Array[java.lang.String]
  def init(options: CustomEventOptions): scala.Unit
}

object CustomEventHandler {
  @scala.inline
  def apply(
    destroy: js.Function,
    haltEventListeners: js.Array[java.lang.String],
    init: js.Function1[CustomEventOptions, scala.Unit]
  ): CustomEventHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("haltEventListeners")(haltEventListeners)
    __obj.updateDynamic("init")(init)
    __obj.asInstanceOf[CustomEventHandler]
  }
}


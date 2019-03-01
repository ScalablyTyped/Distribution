package typings
package atUifabricUtilitiesLib.libDelayedRenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDelayedRenderState extends js.Object {
  /**
    * Whether the component is rendered or not.
    */
  var isRendered: scala.Boolean
}

object IDelayedRenderState {
  @scala.inline
  def apply(isRendered: scala.Boolean): IDelayedRenderState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isRendered")(isRendered)
    __obj.asInstanceOf[IDelayedRenderState]
  }
}


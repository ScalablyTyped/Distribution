package typings.uifabricUtilities.delayedRenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDelayedRenderState extends js.Object {
  /**
    * Whether the component is rendered or not.
    */
  var isRendered: Boolean
}

object IDelayedRenderState {
  @scala.inline
  def apply(isRendered: Boolean): IDelayedRenderState = {
    val __obj = js.Dynamic.literal(isRendered = isRendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDelayedRenderState]
  }
}


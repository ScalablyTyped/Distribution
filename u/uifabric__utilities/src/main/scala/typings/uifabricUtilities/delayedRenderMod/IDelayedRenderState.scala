package typings.uifabricUtilities.delayedRenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDelayedRenderState extends js.Object {
  /**
    * Whether the component is rendered or not.
    */
  var isRendered: Boolean = js.native
}

object IDelayedRenderState {
  @scala.inline
  def apply(isRendered: Boolean): IDelayedRenderState = {
    val __obj = js.Dynamic.literal(isRendered = isRendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDelayedRenderState]
  }
  @scala.inline
  implicit class IDelayedRenderStateOps[Self <: IDelayedRenderState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsRendered(value: Boolean): Self = this.set("isRendered", value.asInstanceOf[js.Any])
  }
  
}


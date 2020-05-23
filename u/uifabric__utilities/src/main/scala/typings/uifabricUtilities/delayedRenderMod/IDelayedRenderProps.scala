package typings.uifabricUtilities.delayedRenderMod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDelayedRenderProps
  extends Props[js.Object] {
  /**
    * Number of milliseconds to delay rendering children.
    */
  var delay: js.UndefOr[Double] = js.undefined
}

object IDelayedRenderProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    delay: js.UndefOr[Double] = js.undefined,
    key: Key = null,
    ref: js.UndefOr[Null | LegacyRef[js.Object]] = js.undefined
  ): IDelayedRenderProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDelayedRenderProps]
  }
}


package typings.atUifabricUtilities.libDelayedRenderMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
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
    delay: Int | Double = null,
    key: Key = null,
    ref: LegacyRef[js.Object] = null
  ): IDelayedRenderProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDelayedRenderProps]
  }
}


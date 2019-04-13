package typings
package atUifabricUtilitiesLib.libDelayedRenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDelayedRenderProps
  extends reactLib.reactMod.Props[js.Object] {
  /**
    * Number of milliseconds to delay rendering children.
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
}

object IDelayedRenderProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    delay: scala.Int | scala.Double = null,
    key: reactLib.reactMod.Key = null,
    ref: reactLib.reactMod.LegacyRef[js.Object] = null
  ): IDelayedRenderProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDelayedRenderProps]
  }
}


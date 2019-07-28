package typings.vegaDashLite.buildSrcCompileSelectionSelectionMod

import typings.vegaDashLite.buildSrcChannelMod.ScaleChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectComponent extends js.Object {
  var channel: js.UndefOr[ScaleChannel] = js.undefined
  var field: js.UndefOr[String] = js.undefined
}

object ProjectComponent {
  @scala.inline
  def apply(channel: ScaleChannel = null, field: String = null): ProjectComponent = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[ProjectComponent]
  }
}


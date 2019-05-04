package typings
package vegaDashLiteLib.buildSrcCompileSelectionSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectComponent extends js.Object {
  var channel: js.UndefOr[vegaDashLiteLib.buildSrcChannelMod.ScaleChannel] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
}

object ProjectComponent {
  @scala.inline
  def apply(channel: vegaDashLiteLib.buildSrcChannelMod.ScaleChannel = null, field: java.lang.String = null): ProjectComponent = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[ProjectComponent]
  }
}


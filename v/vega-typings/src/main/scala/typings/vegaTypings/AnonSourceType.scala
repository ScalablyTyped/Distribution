package typings.vegaTypings

import typings.vegaTypings.streamMod.WindowEventType
import typings.vegaTypings.vegaTypingsStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSourceType extends js.Object {
  var source: window
  var `type`: WindowEventType
}

object AnonSourceType {
  @scala.inline
  def apply(source: window, `type`: WindowEventType): AnonSourceType = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSourceType]
  }
}


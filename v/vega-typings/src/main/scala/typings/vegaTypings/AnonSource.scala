package typings.vegaTypings

import typings.vegaTypings.streamMod.EventType
import typings.vegaTypings.vegaTypingsStrings.scope
import typings.vegaTypings.vegaTypingsStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSource extends js.Object {
  var source: js.UndefOr[view | scope] = js.undefined
  var `type`: EventType
}

object AnonSource {
  @scala.inline
  def apply(`type`: EventType, source: view | scope = null): AnonSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSource]
  }
}


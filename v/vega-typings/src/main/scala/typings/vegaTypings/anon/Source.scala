package typings.vegaTypings.anon

import typings.vegaTypings.streamMod.EventType
import typings.vegaTypings.vegaTypingsStrings.scope
import typings.vegaTypings.vegaTypingsStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var source: js.UndefOr[view | scope] = js.undefined
  var `type`: EventType
}

object Source {
  @scala.inline
  def apply(`type`: EventType, source: view | scope = null): Source = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}


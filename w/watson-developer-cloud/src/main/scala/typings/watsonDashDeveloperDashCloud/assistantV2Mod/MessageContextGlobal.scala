package typings.watsonDashDeveloperDashCloud.assistantV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information that is shared by all skills used by the Assistant. */
trait MessageContextGlobal extends js.Object {
  /** Built-in system properties that apply to all skills used by the assistant. */
  var system: js.UndefOr[MessageContextGlobalSystem] = js.undefined
}

object MessageContextGlobal {
  @scala.inline
  def apply(system: MessageContextGlobalSystem = null): MessageContextGlobal = {
    val __obj = js.Dynamic.literal()
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageContextGlobal]
  }
}


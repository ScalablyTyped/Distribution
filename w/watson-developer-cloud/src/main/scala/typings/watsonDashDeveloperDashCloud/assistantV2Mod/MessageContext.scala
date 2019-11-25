package typings.watsonDashDeveloperDashCloud.assistantV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** MessageContext. */
trait MessageContext extends js.Object {
  /** Information that is shared by all skills used by the Assistant. */
  var global: js.UndefOr[MessageContextGlobal] = js.undefined
  /** Information specific to particular skills used by the Assistant. **Note:** Currently, only a single property named `main skill` is supported. This object contains variables that apply to the dialog skill used by the assistant. */
  var skills: js.UndefOr[MessageContextSkills] = js.undefined
}

object MessageContext {
  @scala.inline
  def apply(global: MessageContextGlobal = null, skills: MessageContextSkills = null): MessageContext = {
    val __obj = js.Dynamic.literal()
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (skills != null) __obj.updateDynamic("skills")(skills.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageContext]
  }
}


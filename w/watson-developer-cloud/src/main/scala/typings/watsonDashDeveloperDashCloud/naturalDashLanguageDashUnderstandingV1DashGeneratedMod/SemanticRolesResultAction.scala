package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The extracted action from the sentence. */
trait SemanticRolesResultAction extends js.Object {
  /** normalized version of the action. */
  var normalized: js.UndefOr[String] = js.undefined
  /** Analyzed text that corresponds to the action. */
  var text: js.UndefOr[String] = js.undefined
  var verb: js.UndefOr[SemanticRolesVerb] = js.undefined
}

object SemanticRolesResultAction {
  @scala.inline
  def apply(normalized: String = null, text: String = null, verb: SemanticRolesVerb = null): SemanticRolesResultAction = {
    val __obj = js.Dynamic.literal()
    if (normalized != null) __obj.updateDynamic("normalized")(normalized)
    if (text != null) __obj.updateDynamic("text")(text)
    if (verb != null) __obj.updateDynamic("verb")(verb)
    __obj.asInstanceOf[SemanticRolesResultAction]
  }
}


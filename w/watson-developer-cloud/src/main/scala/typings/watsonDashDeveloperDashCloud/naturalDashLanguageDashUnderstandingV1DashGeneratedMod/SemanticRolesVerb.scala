package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SemanticRolesVerb. */
trait SemanticRolesVerb extends js.Object {
  /** Verb tense. */
  var tense: js.UndefOr[String] = js.undefined
  /** The keyword text. */
  var text: js.UndefOr[String] = js.undefined
}

object SemanticRolesVerb {
  @scala.inline
  def apply(tense: String = null, text: String = null): SemanticRolesVerb = {
    val __obj = js.Dynamic.literal()
    if (tense != null) __obj.updateDynamic("tense")(tense)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[SemanticRolesVerb]
  }
}


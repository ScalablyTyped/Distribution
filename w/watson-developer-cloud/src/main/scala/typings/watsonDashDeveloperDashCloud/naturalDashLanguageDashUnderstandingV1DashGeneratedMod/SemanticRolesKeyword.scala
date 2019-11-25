package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SemanticRolesKeyword. */
trait SemanticRolesKeyword extends js.Object {
  /** The keyword text. */
  var text: js.UndefOr[String] = js.undefined
}

object SemanticRolesKeyword {
  @scala.inline
  def apply(text: String = null): SemanticRolesKeyword = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticRolesKeyword]
  }
}


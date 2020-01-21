package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SemanticRolesEntity. */
trait SemanticRolesEntity extends js.Object {
  /** The entity text. */
  var text: js.UndefOr[String] = js.undefined
  /** Entity type. */
  var `type`: js.UndefOr[String] = js.undefined
}

object SemanticRolesEntity {
  @scala.inline
  def apply(text: String = null, `type`: String = null): SemanticRolesEntity = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticRolesEntity]
  }
}


package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The extracted object from the sentence. */
trait SemanticRolesResultObject extends js.Object {
  /** An array of extracted keywords. */
  var keywords: js.UndefOr[js.Array[SemanticRolesKeyword]] = js.undefined
  /** Object text. */
  var text: js.UndefOr[String] = js.undefined
}

object SemanticRolesResultObject {
  @scala.inline
  def apply(keywords: js.Array[SemanticRolesKeyword] = null, text: String = null): SemanticRolesResultObject = {
    val __obj = js.Dynamic.literal()
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticRolesResultObject]
  }
}


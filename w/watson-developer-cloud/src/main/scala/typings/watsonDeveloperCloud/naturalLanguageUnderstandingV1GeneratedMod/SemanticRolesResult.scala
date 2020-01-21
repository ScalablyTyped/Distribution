package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The object containing the actions and the objects the actions act upon. */
trait SemanticRolesResult extends js.Object {
  /** The extracted action from the sentence. */
  var action: js.UndefOr[SemanticRolesResultAction] = js.undefined
  /** The extracted object from the sentence. */
  var `object`: js.UndefOr[SemanticRolesResultObject] = js.undefined
  /** Sentence from the source that contains the subject, action, and object. */
  var sentence: js.UndefOr[String] = js.undefined
  /** The extracted subject from the sentence. */
  var subject: js.UndefOr[SemanticRolesResultSubject] = js.undefined
}

object SemanticRolesResult {
  @scala.inline
  def apply(
    action: SemanticRolesResultAction = null,
    `object`: SemanticRolesResultObject = null,
    sentence: String = null,
    subject: SemanticRolesResultSubject = null
  ): SemanticRolesResult = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (sentence != null) __obj.updateDynamic("sentence")(sentence.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticRolesResult]
  }
}


package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The original labeling from the input document, without the submitted feedback. */
trait OriginalLabelsIn extends js.Object {
  /** List of functional categories into which the element falls; in other words, the subject matter of the element. */
  var categories: js.Array[Category]
  /** Description of the action specified by the element and whom it affects. */
  var types: js.Array[TypeLabel]
}

object OriginalLabelsIn {
  @scala.inline
  def apply(categories: js.Array[Category], types: js.Array[TypeLabel]): OriginalLabelsIn = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OriginalLabelsIn]
  }
}


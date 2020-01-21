package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Custom models that are available for entities and relations. */
trait ListModelsResults extends js.Object {
  /** An array of available models. */
  var models: js.UndefOr[js.Array[Model]] = js.undefined
}

object ListModelsResults {
  @scala.inline
  def apply(models: js.Array[Model] = null): ListModelsResults = {
    val __obj = js.Dynamic.literal()
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelsResults]
  }
}


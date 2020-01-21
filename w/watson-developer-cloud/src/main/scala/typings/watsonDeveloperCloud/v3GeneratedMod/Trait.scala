package typings.watsonDeveloperCloud.v3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Trait. */
trait Trait extends js.Object {
  /** The category of the characteristic: `personality` for Big Five personality characteristics, `needs` for Needs, and `values` for Values. */
  var category: String
  /** For `personality` (Big Five) dimensions, more detailed results for the facets of each dimension as inferred from the input text. */
  var children: js.UndefOr[js.Array[Trait]] = js.undefined
  /** The user-visible, localized name of the characteristic. */
  var name: String
  /** The normalized percentile score for the characteristic. The range is 0 to 1. For example, if the percentage for Openness is 0.60, the author scored in the 60th percentile; the author is more open than 59 percent of the population and less open than 39 percent of the population. */
  var percentile: Double
  /** The raw score for the characteristic. The range is 0 to 1. A higher score generally indicates a greater likelihood that the author has that characteristic, but raw scores must be considered in aggregate: The range of values in practice might be much smaller than 0 to 1, so an individual score must be considered in the context of the overall scores and their range. The raw score is computed based on the input and the service model; it is not normalized or compared with a sample population. The raw score enables comparison of the results against a different sampling population and with a custom normalization approach. */
  var raw_score: js.UndefOr[Double] = js.undefined
  /** **`2017-10-13`**: Indicates whether the characteristic is meaningful for the input language. The field is always `true` for all characteristics of English, Spanish, and Japanese input. The field is `false` for the subset of characteristics of Arabic and Korean input for which the service's models are unable to generate meaningful results. **`2016-10-19`**: Not returned. */
  var significant: js.UndefOr[Boolean] = js.undefined
  /** The unique, non-localized identifier of the characteristic to which the results pertain. IDs have the form * `big5_{characteristic}` for Big Five personality dimensions * `facet_{characteristic}` for Big Five personality facets * `need_{characteristic}` for Needs *`value_{characteristic}` for Values. */
  var trait_id: String
}

object Trait {
  @scala.inline
  def apply(
    category: String,
    name: String,
    percentile: Double,
    trait_id: String,
    children: js.Array[Trait] = null,
    raw_score: Int | Double = null,
    significant: js.UndefOr[Boolean] = js.undefined
  ): Trait = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], percentile = percentile.asInstanceOf[js.Any], trait_id = trait_id.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (raw_score != null) __obj.updateDynamic("raw_score")(raw_score.asInstanceOf[js.Any])
    if (!js.isUndefined(significant)) __obj.updateDynamic("significant")(significant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trait]
  }
}


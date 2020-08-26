package typings.watsonDeveloperCloud.v3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Trait. */
@js.native
trait Trait extends js.Object {
  /** The category of the characteristic: `personality` for Big Five personality characteristics, `needs` for Needs, and `values` for Values. */
  var category: String = js.native
  /** For `personality` (Big Five) dimensions, more detailed results for the facets of each dimension as inferred from the input text. */
  var children: js.UndefOr[js.Array[Trait]] = js.native
  /** The user-visible, localized name of the characteristic. */
  var name: String = js.native
  /** The normalized percentile score for the characteristic. The range is 0 to 1. For example, if the percentage for Openness is 0.60, the author scored in the 60th percentile; the author is more open than 59 percent of the population and less open than 39 percent of the population. */
  var percentile: Double = js.native
  /** The raw score for the characteristic. The range is 0 to 1. A higher score generally indicates a greater likelihood that the author has that characteristic, but raw scores must be considered in aggregate: The range of values in practice might be much smaller than 0 to 1, so an individual score must be considered in the context of the overall scores and their range. The raw score is computed based on the input and the service model; it is not normalized or compared with a sample population. The raw score enables comparison of the results against a different sampling population and with a custom normalization approach. */
  var raw_score: js.UndefOr[Double] = js.native
  /** **`2017-10-13`**: Indicates whether the characteristic is meaningful for the input language. The field is always `true` for all characteristics of English, Spanish, and Japanese input. The field is `false` for the subset of characteristics of Arabic and Korean input for which the service's models are unable to generate meaningful results. **`2016-10-19`**: Not returned. */
  var significant: js.UndefOr[Boolean] = js.native
  /** The unique, non-localized identifier of the characteristic to which the results pertain. IDs have the form * `big5_{characteristic}` for Big Five personality dimensions * `facet_{characteristic}` for Big Five personality facets * `need_{characteristic}` for Needs *`value_{characteristic}` for Values. */
  var trait_id: String = js.native
}

object Trait {
  @scala.inline
  def apply(category: String, name: String, percentile: Double, trait_id: String): Trait = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], percentile = percentile.asInstanceOf[js.Any], trait_id = trait_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trait]
  }
  @scala.inline
  implicit class TraitOps[Self <: Trait] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentile(value: Double): Self = this.set("percentile", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrait_id(value: String): Self = this.set("trait_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: Trait*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[Trait]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setRaw_score(value: Double): Self = this.set("raw_score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw_score: Self = this.set("raw_score", js.undefined)
    @scala.inline
    def setSignificant(value: Boolean): Self = this.set("significant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignificant: Self = this.set("significant", js.undefined)
  }
  
}


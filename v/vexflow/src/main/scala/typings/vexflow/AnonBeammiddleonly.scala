package typings.vexflow

import typings.vexflow.Vex.Flow.Fraction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBeammiddleonly extends js.Object {
  var beam_middle_only: js.UndefOr[Boolean] = js.undefined
  var beam_rests: js.UndefOr[Boolean] = js.undefined
  var groups: js.UndefOr[js.Array[Fraction]] = js.undefined
  var maintain_stem_directions: js.UndefOr[Boolean] = js.undefined
  var show_stemlets: js.UndefOr[Boolean] = js.undefined
  var stem_direction: js.UndefOr[Double] = js.undefined
}

object AnonBeammiddleonly {
  @scala.inline
  def apply(
    beam_middle_only: js.UndefOr[Boolean] = js.undefined,
    beam_rests: js.UndefOr[Boolean] = js.undefined,
    groups: js.Array[Fraction] = null,
    maintain_stem_directions: js.UndefOr[Boolean] = js.undefined,
    show_stemlets: js.UndefOr[Boolean] = js.undefined,
    stem_direction: Int | Double = null
  ): AnonBeammiddleonly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beam_middle_only)) __obj.updateDynamic("beam_middle_only")(beam_middle_only.asInstanceOf[js.Any])
    if (!js.isUndefined(beam_rests)) __obj.updateDynamic("beam_rests")(beam_rests.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(maintain_stem_directions)) __obj.updateDynamic("maintain_stem_directions")(maintain_stem_directions.asInstanceOf[js.Any])
    if (!js.isUndefined(show_stemlets)) __obj.updateDynamic("show_stemlets")(show_stemlets.asInstanceOf[js.Any])
    if (stem_direction != null) __obj.updateDynamic("stem_direction")(stem_direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBeammiddleonly]
  }
}


package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A pair of `nature` and `party` objects. The `nature` object identifies the effect of the element on the identified `party`, and the `party` object identifies the affected party. */
trait Label extends js.Object {
  /** The identified `nature` of the element. */
  var nature: String
  /** The identified `party` of the element. */
  var party: String
}

object Label {
  @scala.inline
  def apply(nature: String, party: String): Label = {
    val __obj = js.Dynamic.literal(nature = nature.asInstanceOf[js.Any], party = party.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}


package typings.victory.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Negative extends js.Object {
  var negative: js.UndefOr[String] = js.undefined
  var positive: js.UndefOr[String] = js.undefined
}

object Negative {
  @scala.inline
  def apply(negative: String = null, positive: String = null): Negative = {
    val __obj = js.Dynamic.literal()
    if (negative != null) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (positive != null) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Negative]
  }
}


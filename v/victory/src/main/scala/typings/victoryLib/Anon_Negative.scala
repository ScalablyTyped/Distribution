package typings
package victoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Negative extends js.Object {
  var negative: java.lang.String
  var positive: java.lang.String
}

object Anon_Negative {
  @scala.inline
  def apply(negative: java.lang.String, positive: java.lang.String): Anon_Negative = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("negative")(negative)
    __obj.updateDynamic("positive")(positive)
    __obj.asInstanceOf[Anon_Negative]
  }
}


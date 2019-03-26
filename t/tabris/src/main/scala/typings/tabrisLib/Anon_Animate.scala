package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animate extends js.Object {
  var animate: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Animate {
  @scala.inline
  def apply(animate: js.UndefOr[scala.Boolean] = js.undefined): Anon_Animate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    __obj.asInstanceOf[Anon_Animate]
  }
}


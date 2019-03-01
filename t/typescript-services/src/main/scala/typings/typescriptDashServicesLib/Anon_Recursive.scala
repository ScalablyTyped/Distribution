package typings
package typescriptDashServicesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Recursive extends js.Object {
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Recursive {
  @scala.inline
  def apply(recursive: js.UndefOr[scala.Boolean] = js.undefined): Anon_Recursive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    __obj.asInstanceOf[Anon_Recursive]
  }
}


package typings.vegaDashEmbed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Png extends js.Object {
  var png: js.UndefOr[Boolean] = js.undefined
  var svg: js.UndefOr[Boolean] = js.undefined
}

object Anon_Png {
  @scala.inline
  def apply(png: js.UndefOr[Boolean] = js.undefined, svg: js.UndefOr[Boolean] = js.undefined): Anon_Png = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(png)) __obj.updateDynamic("png")(png)
    if (!js.isUndefined(svg)) __obj.updateDynamic("svg")(svg)
    __obj.asInstanceOf[Anon_Png]
  }
}


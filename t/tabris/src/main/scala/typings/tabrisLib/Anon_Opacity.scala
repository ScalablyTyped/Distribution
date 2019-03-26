package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Opacity extends js.Object {
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var transform: js.UndefOr[tabrisLib.tabrisMod.Transformation] = js.undefined
}

object Anon_Opacity {
  @scala.inline
  def apply(opacity: scala.Int | scala.Double = null, transform: tabrisLib.tabrisMod.Transformation = null): Anon_Opacity = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[Anon_Opacity]
  }
}


package typings
package victoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PropsStyle extends js.Object {
  var props: Anon_ColorScale
  var style: victoryLib.victoryMod.VictoryStyleInterface
}

object Anon_PropsStyle {
  @scala.inline
  def apply(props: Anon_ColorScale, style: victoryLib.victoryMod.VictoryStyleInterface): Anon_PropsStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("props")(props)
    __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Anon_PropsStyle]
  }
}


package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: vegaDashTypingsLib.typesRuntimeSceneMod.SceneTextAlign
  var angle: scala.Double
  var baseline: vegaDashTypingsLib.typesRuntimeSceneMod.SceneTextBaseline
  var fill: java.lang.String
  var font: java.lang.String
  var fontSize: scala.Double
  var text: java.lang.String
}

object Anon_Align {
  @scala.inline
  def apply(
    align: vegaDashTypingsLib.typesRuntimeSceneMod.SceneTextAlign,
    angle: scala.Double,
    baseline: vegaDashTypingsLib.typesRuntimeSceneMod.SceneTextBaseline,
    fill: java.lang.String,
    font: java.lang.String,
    fontSize: scala.Double,
    text: java.lang.String
  ): Anon_Align = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("align")(align)
    __obj.updateDynamic("angle")(angle)
    __obj.updateDynamic("baseline")(baseline)
    __obj.updateDynamic("fill")(fill)
    __obj.updateDynamic("font")(font)
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Align]
  }
}


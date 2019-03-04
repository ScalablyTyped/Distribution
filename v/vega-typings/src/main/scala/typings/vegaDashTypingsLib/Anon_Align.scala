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
    val __obj = js.Dynamic.literal(align = align, angle = angle, baseline = baseline, fill = fill, font = font, fontSize = fontSize, text = text)
  
    __obj.asInstanceOf[Anon_Align]
  }
}


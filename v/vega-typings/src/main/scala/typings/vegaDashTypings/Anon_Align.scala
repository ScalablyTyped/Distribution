package typings.vegaDashTypings

import typings.vegaDashTypings.typesRuntimeSceneMod.SceneTextAlign
import typings.vegaDashTypings.typesRuntimeSceneMod.SceneTextBaseline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: SceneTextAlign
  var angle: Double
  var baseline: SceneTextBaseline
  var fill: String
  var font: String
  var fontSize: Double
  var text: String
}

object Anon_Align {
  @scala.inline
  def apply(
    align: SceneTextAlign,
    angle: Double,
    baseline: SceneTextBaseline,
    fill: String,
    font: String,
    fontSize: Double,
    text: String
  ): Anon_Align = {
    val __obj = js.Dynamic.literal(align = align, angle = angle, baseline = baseline, fill = fill, font = font, fontSize = fontSize, text = text)
  
    __obj.asInstanceOf[Anon_Align]
  }
}


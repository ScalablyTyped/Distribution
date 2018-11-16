package typings
package threeLib.threeDashCanvasrendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-canvasrenderer", "SpriteCanvasMaterial")
@js.native
class SpriteCanvasMaterial ()
  extends threeLib.threeDashCoreMod.Material {
  def this(parameters: SpriteCanvasMaterialParameters) = this()
  var color: threeLib.threeDashCoreMod.Color = js.native
  def program(context: stdLib.CanvasRenderingContext2D, color: threeLib.threeDashCoreMod.Color): scala.Unit = js.native
}


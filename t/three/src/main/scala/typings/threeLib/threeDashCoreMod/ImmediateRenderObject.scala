package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "ImmediateRenderObject")
@js.native
class ImmediateRenderObject protected () extends Object3D {
  def this(material: Material) = this()
  var material: Material = js.native
  def render(renderCallback: js.Function): scala.Unit = js.native
}


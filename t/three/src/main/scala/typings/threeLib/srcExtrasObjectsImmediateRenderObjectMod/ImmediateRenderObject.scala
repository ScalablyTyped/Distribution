package typings
package threeLib.srcExtrasObjectsImmediateRenderObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/objects/ImmediateRenderObject", "ImmediateRenderObject")
@js.native
class ImmediateRenderObject protected ()
  extends threeLib.srcCoreObject3DMod.Object3D {
  def this(material: threeLib.srcMaterialsMaterialMod.Material) = this()
  var material: threeLib.srcMaterialsMaterialMod.Material = js.native
  def render(renderCallback: js.Function): scala.Unit = js.native
}


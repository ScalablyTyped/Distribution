package typings.three

import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/objects/ImmediateRenderObject", JSImport.Namespace)
@js.native
object immediateRenderObjectMod extends js.Object {
  @js.native
  class ImmediateRenderObject protected () extends Object3D {
    def this(material: Material) = this()
    var material: Material = js.native
    def render(renderCallback: js.Function): Unit = js.native
  }
  
}


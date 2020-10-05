package typings.three

import typings.std.Float32Array
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/extras/objects/ImmediateRenderObject", JSImport.Namespace)
@js.native
object immediateRenderObjectMod extends js.Object {
  @js.native
  class ImmediateRenderObject protected () extends Object3D {
    def this(material: Material) = this()
    var colorArray: Null | Float32Array = js.native
    var count: Double = js.native
    var hasColors: Boolean = js.native
    var hasNormals: Boolean = js.native
    var hasPositions: Boolean = js.native
    var hasUvs: Boolean = js.native
    val isImmediateRenderObject: `true` = js.native
    var material: Material = js.native
    var normalArray: Null | Float32Array = js.native
    var positionArray: Null | Float32Array = js.native
    var uvArray: Null | Float32Array = js.native
    def render(renderCallback: js.Function): Unit = js.native
  }
  
}


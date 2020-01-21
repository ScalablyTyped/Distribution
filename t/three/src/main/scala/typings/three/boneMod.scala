package typings.three

import typings.three.object3DMod.Object3D
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/objects/Bone", JSImport.Namespace)
@js.native
object boneMod extends js.Object {
  @js.native
  class Bone () extends Object3D {
    var isBone: `true` = js.native
    @JSName("type")
    var type_Bone: typings.three.threeStrings.Bone = js.native
  }
  
}


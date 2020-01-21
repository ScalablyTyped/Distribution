package typings.wonderJs

import typings.wonderJs.engineMaterialMod.EngineMaterial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/material/StandardBasicMaterial", JSImport.Namespace)
@js.native
object standardBasicMaterialMod extends js.Object {
  @js.native
  abstract class StandardBasicMaterial () extends EngineMaterial {
    var alphaTest: Double = js.native
    var opacity: Double = js.native
    /* protected */ def addExtendShaderLib(): Unit = js.native
  }
  
}


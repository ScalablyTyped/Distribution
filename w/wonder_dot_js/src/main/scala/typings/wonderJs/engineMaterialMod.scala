package typings.wonderJs

import typings.wonderJs.materialMod.Material
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/material/EngineMaterial", JSImport.Namespace)
@js.native
object engineMaterialMod extends js.Object {
  @js.native
  abstract class EngineMaterial () extends Material {
    /* protected */ def addShaderLib(): Unit = js.native
  }
  
}


package typings.wonderJs

import typings.wonderJs.standardBasicMaterialMod.StandardBasicMaterial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/material/BasicMaterial", JSImport.Namespace)
@js.native
object basicMaterialMod extends js.Object {
  @js.native
  class BasicMaterial () extends StandardBasicMaterial
  
  /* static members */
  @js.native
  object BasicMaterial extends js.Object {
    def create(): BasicMaterial = js.native
  }
  
}


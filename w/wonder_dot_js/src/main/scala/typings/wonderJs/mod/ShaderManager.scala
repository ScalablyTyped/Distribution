package typings.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "ShaderManager")
@js.native
class ShaderManager protected ()
  extends typings.wonderJs.shaderManagerMod.ShaderManager {
  def this(material: typings.wonderJs.materialMod.Material) = this()
}

/* static members */
@JSImport("wonder.js/dist/es2015", "ShaderManager")
@js.native
object ShaderManager extends js.Object {
  def create(material: typings.wonderJs.materialMod.Material): typings.wonderJs.shaderManagerMod.ShaderManager = js.native
}


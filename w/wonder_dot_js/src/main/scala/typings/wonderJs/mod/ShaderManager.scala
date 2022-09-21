package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "ShaderManager")
@js.native
open class ShaderManager protected ()
  extends typings.wonderJs.shaderManagerMod.ShaderManager {
  def this(material: typings.wonderJs.materialMod.Material) = this()
}
/* static members */
object ShaderManager {
  
  @JSImport("wonder.js/dist/es2015", "ShaderManager")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(material: typings.wonderJs.materialMod.Material): typings.wonderJs.shaderManagerMod.ShaderManager = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(material.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.shaderManagerMod.ShaderManager]
}

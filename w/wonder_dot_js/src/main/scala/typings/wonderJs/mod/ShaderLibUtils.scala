package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "ShaderLibUtils")
@js.native
class ShaderLibUtils ()
  extends typings.wonderJs.shaderLibUtilsMod.ShaderLibUtils
/* static members */
object ShaderLibUtils {
  
  @JSImport("wonder.js/dist/es2015", "ShaderLibUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addVerticeShaderLib(geometry: typings.wonderJs.geometryMod.Geometry, shader: typings.wonderJs.shaderMod.Shader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addVerticeShaderLib")(geometry.asInstanceOf[js.Any], shader.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

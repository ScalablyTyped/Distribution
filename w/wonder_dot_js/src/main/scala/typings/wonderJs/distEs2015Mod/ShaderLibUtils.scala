package typings.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "ShaderLibUtils")
@js.native
open class ShaderLibUtils ()
  extends typings.wonderJs.distEs2015UtilsShaderLibUtilsMod.ShaderLibUtils
/* static members */
object ShaderLibUtils {
  
  @JSImport("wonder.js/dist/es2015", "ShaderLibUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addVerticeShaderLib(
    geometry: typings.wonderJs.distEs2015ComponentGeometryGeometryMod.Geometry,
    shader: typings.wonderJs.distEs2015RendererShaderShaderShaderMod.Shader
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addVerticeShaderLib")(geometry.asInstanceOf[js.Any], shader.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

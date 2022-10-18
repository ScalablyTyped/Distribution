package typings.wonderJs

import typings.wonderJs.distEs2015ComponentGeometryGeometryMod.Geometry
import typings.wonderJs.distEs2015RendererShaderShaderShaderMod.Shader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015UtilsShaderLibUtilsMod {
  
  @JSImport("wonder.js/dist/es2015/utils/ShaderLibUtils", "ShaderLibUtils")
  @js.native
  open class ShaderLibUtils () extends StObject
  /* static members */
  object ShaderLibUtils {
    
    @JSImport("wonder.js/dist/es2015/utils/ShaderLibUtils", "ShaderLibUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addVerticeShaderLib(geometry: Geometry, shader: Shader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addVerticeShaderLib")(geometry.asInstanceOf[js.Any], shader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}

package typings.wonderJs

import typings.wonderJs.geometryMod.Geometry
import typings.wonderJs.shaderMod.Shader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaderLibUtilsMod {
  
  @JSImport("wonder.js/dist/es2015/utils/ShaderLibUtils", "ShaderLibUtils")
  @js.native
  class ShaderLibUtils () extends StObject
  /* static members */
  object ShaderLibUtils {
    
    @JSImport("wonder.js/dist/es2015/utils/ShaderLibUtils", "ShaderLibUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addVerticeShaderLib(geometry: Geometry, shader: Shader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addVerticeShaderLib")(geometry.asInstanceOf[js.Any], shader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}

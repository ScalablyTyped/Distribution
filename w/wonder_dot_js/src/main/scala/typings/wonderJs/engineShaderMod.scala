package typings.wonderJs

import typings.wonderJs.engineShaderSourceBuilderMod.EngineShaderSourceBuilder
import typings.wonderJs.shaderMod.Shader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineShaderMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/shader/EngineShader", "EngineShader")
  @js.native
  abstract class EngineShader () extends Shader {
    
    @JSName("sourceBuilder")
    var sourceBuilder_EngineShader: EngineShaderSourceBuilder = js.native
  }
}

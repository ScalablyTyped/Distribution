package typings.wonderJs

import typings.wonderJs.distEs2015MaterialStandardBasicMaterialMod.StandardBasicMaterial
import typings.wonderJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typings.wonderJs.distEs2015RendererShaderLibEngineShaderLibMod.EngineShaderLib
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererShaderLibBasicEndBasicShaderLibMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/EndBasicShaderLib", "EndBasicShaderLib")
  @js.native
  open class EndBasicShaderLib () extends EngineShaderLib {
    
    def setShaderDefinition(cmd: QuadCommand, material: StandardBasicMaterial): Unit = js.native
  }
  /* static members */
  object EndBasicShaderLib {
    
    @JSImport("wonder.js/dist/es2015/renderer/shader/lib/basic/EndBasicShaderLib", "EndBasicShaderLib")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): EndBasicShaderLib = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[EndBasicShaderLib]
  }
}

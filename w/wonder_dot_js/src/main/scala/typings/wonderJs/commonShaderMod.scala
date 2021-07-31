package typings.wonderJs

import typings.wonderJs.engineShaderMod.EngineShader
import typings.wonderJs.materialMod.Material
import typings.wonderJs.quadCommandMod.QuadCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonShaderMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/shader/shader/CommonShader", "CommonShader")
  @js.native
  class CommonShader () extends EngineShader {
    
    def update(cmd: QuadCommand, material: Material): Unit = js.native
  }
  /* static members */
  object CommonShader {
    
    @JSImport("wonder.js/dist/es2015/renderer/shader/shader/CommonShader", "CommonShader")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): CommonShader = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CommonShader]
  }
}

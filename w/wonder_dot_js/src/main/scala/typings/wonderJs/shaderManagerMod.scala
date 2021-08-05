package typings.wonderJs

import typings.wonderJs.materialMod.Material
import typings.wonderJs.quadCommandMod.QuadCommand
import typings.wonderJs.shaderMod.Shader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaderManagerMod {
  
  @JSImport("wonder.js/dist/es2015/material/ShaderManager", "ShaderManager")
  @js.native
  class ShaderManager protected () extends StObject {
    def this(material: Material) = this()
    
    def dispose(): Unit = js.native
    
    def init(): Unit = js.native
    
    def setShader(shader: Shader): Unit = js.native
    
    val shader: Shader = js.native
    
    def update(quadCmd: QuadCommand): Unit = js.native
  }
  /* static members */
  object ShaderManager {
    
    @JSImport("wonder.js/dist/es2015/material/ShaderManager", "ShaderManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(material: Material): ShaderManager = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(material.asInstanceOf[js.Any]).asInstanceOf[ShaderManager]
  }
}

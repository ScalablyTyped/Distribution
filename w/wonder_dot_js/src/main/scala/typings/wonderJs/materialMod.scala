package typings.wonderJs

import typings.wonderJs.colorMod.Color
import typings.wonderJs.geometryMod.Geometry
import typings.wonderJs.programMod.Program
import typings.wonderJs.quadCommandMod.QuadCommand
import typings.wonderJs.shaderMod.Shader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialMod {
  
  @JSImport("wonder.js/dist/es2015/material/Material", "Material")
  @js.native
  abstract class Material () extends StObject {
    
    var color: Color = js.native
    
    /* protected */ def createShader(): Shader = js.native
    
    def dispose(): Unit = js.native
    
    var geometry: Geometry = js.native
    
    def init(): Unit = js.native
    
    def initWhenCreate(): Unit = js.native
    
    val program: Program = js.native
    
    val shader: Shader = js.native
    
    def updateShader(quadCmd: QuadCommand): Unit = js.native
  }
}

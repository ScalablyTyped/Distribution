package typings.wonderJs

import typings.wonderJs.distEs2015ComponentGeometryGeometryMod.Geometry
import typings.wonderJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typings.wonderJs.distEs2015RendererProgramProgramMod.Program
import typings.wonderJs.distEs2015RendererShaderShaderShaderMod.Shader
import typings.wonderJs.distEs2015StructureColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015MaterialMaterialMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/material/Material", "Material")
  @js.native
  open class Material () extends StObject {
    
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

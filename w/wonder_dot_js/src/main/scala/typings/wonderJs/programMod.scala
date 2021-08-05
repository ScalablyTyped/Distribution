package typings.wonderJs

import typings.std.Float32Array
import typings.wonderJs.arrayBufferMod.ArrayBuffer
import typings.wonderJs.entityMod.Entity
import typings.wonderJs.evariabletypeMod.EVariableType
import typings.wonderJs.shaderMod.Shader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object programMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/program/Program", "Program")
  @js.native
  class Program () extends Entity {
    
    def dispose(): Unit = js.native
    
    def getAttribLocation(name: String): js.Any = js.native
    
    def getUniformLocation(name: String): js.Any = js.native
    
    var glProgram: js.Any = js.native
    
    def initWithShader(shader: Shader): this.type = js.native
    
    def sendAllBufferData(): Unit = js.native
    
    def sendAttributeBuffer(name: String, `type`: EVariableType, buffer: ArrayBuffer): Unit = js.native
    
    def sendColor3(name: String, data: js.Any): Unit = js.native
    
    def sendFloat1(name: String, data: js.Any): Unit = js.native
    
    def sendFloat2(name: String, data: js.Any): Unit = js.native
    
    def sendFloat3(name: String, data: js.Any): Unit = js.native
    
    def sendFloat4(name: String, data: js.Any): Unit = js.native
    
    def sendMatrix3(name: String, data: js.Any): Unit = js.native
    
    def sendMatrix4(name: String, data: js.Any): Unit = js.native
    
    def sendMatrix4Array(name: String, data: Float32Array): Unit = js.native
    
    def sendNum1(name: String, data: js.Any): Unit = js.native
    
    def sendSampleArray(name: String, data: js.Any): Unit = js.native
    
    def sendStructureData(name: String, `type`: EVariableType, data: js.Any): Unit = js.native
    
    def sendUniformData(name: String, `type`: EVariableType, data: js.Any): Unit = js.native
    
    def sendVector2(name: String, data: js.Any): Unit = js.native
    
    def sendVector3(name: String, data: js.Any): Unit = js.native
    
    def sendVector4(name: String, data: js.Any): Unit = js.native
    
    def use(): Unit = js.native
  }
  /* static members */
  object Program {
    
    @JSImport("wonder.js/dist/es2015/renderer/program/Program", "Program")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Program]
  }
}

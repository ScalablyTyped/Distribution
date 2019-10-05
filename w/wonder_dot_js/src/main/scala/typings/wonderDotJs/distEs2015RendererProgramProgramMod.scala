package typings.wonderDotJs

import typings.std.Float32Array
import typings.wonderDotJs.distEs2015CoreEntityMod.Entity
import typings.wonderDotJs.distEs2015RendererBufferArrayBufferMod.ArrayBuffer
import typings.wonderDotJs.distEs2015RendererProgramProgramMod.Program
import typings.wonderDotJs.distEs2015RendererShaderShaderShaderMod.Shader
import typings.wonderDotJs.distEs2015RendererShaderVariableEVariableTypeMod.EVariableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/program/Program", JSImport.Namespace)
@js.native
object distEs2015RendererProgramProgramMod extends js.Object {
  @js.native
  class Program () extends Entity {
    var glProgram: js.Any = js.native
    def dispose(): Unit = js.native
    def getAttribLocation(name: String): js.Any = js.native
    def getUniformLocation(name: String): js.Any = js.native
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
  @js.native
  object Program extends js.Object {
    def create(): Program = js.native
  }
  
}


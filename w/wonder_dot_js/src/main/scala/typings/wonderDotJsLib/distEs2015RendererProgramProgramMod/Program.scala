package typings
package wonderDotJsLib.distEs2015RendererProgramProgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/program/Program", "Program")
@js.native
class Program ()
  extends wonderDotJsLib.distEs2015CoreEntityMod.Entity {
  var glProgram: js.Any = js.native
  def dispose(): scala.Unit = js.native
  def getAttribLocation(name: java.lang.String): js.Any = js.native
  def getUniformLocation(name: java.lang.String): js.Any = js.native
  def initWithShader(shader: wonderDotJsLib.distEs2015RendererShaderShaderShaderMod.Shader): this.type = js.native
  def sendAllBufferData(): scala.Unit = js.native
  def sendAttributeBuffer(
    name: java.lang.String,
    `type`: wonderDotJsLib.distEs2015RendererShaderVariableEVariableTypeMod.EVariableType,
    buffer: wonderDotJsLib.distEs2015RendererBufferArrayBufferMod.ArrayBuffer
  ): scala.Unit = js.native
  def sendColor3(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendFloat1(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendFloat2(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendFloat3(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendFloat4(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendMatrix3(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendMatrix4(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendMatrix4Array(name: java.lang.String, data: stdLib.Float32Array): scala.Unit = js.native
  def sendNum1(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendSampleArray(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendStructureData(
    name: java.lang.String,
    `type`: wonderDotJsLib.distEs2015RendererShaderVariableEVariableTypeMod.EVariableType,
    data: js.Any
  ): scala.Unit = js.native
  def sendUniformData(
    name: java.lang.String,
    `type`: wonderDotJsLib.distEs2015RendererShaderVariableEVariableTypeMod.EVariableType,
    data: js.Any
  ): scala.Unit = js.native
  def sendVector2(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendVector3(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendVector4(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def use(): scala.Unit = js.native
}

@JSImport("wonder.js/dist/es2015/renderer/program/Program", "Program")
@js.native
object Program extends js.Object {
  def create(): wonderDotJsLib.distEs2015RendererProgramProgramMod.Program = js.native
}


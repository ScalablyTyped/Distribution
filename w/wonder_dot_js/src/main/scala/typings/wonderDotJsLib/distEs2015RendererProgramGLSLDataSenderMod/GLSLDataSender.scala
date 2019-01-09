package typings
package wonderDotJsLib.distEs2015RendererProgramGLSLDataSenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/program/GLSLDataSender", "GLSLDataSender")
@js.native
class GLSLDataSender protected () extends js.Object {
  def this(program: wonderDotJsLib.distEs2015RendererProgramProgramMod.Program) = this()
  def addBufferToToSendList(pos: scala.Double, buffer: wonderDotJsLib.distEs2015RendererBufferArrayBufferMod.ArrayBuffer): scala.Unit = js.native
  def clearAllCache(): scala.Unit = js.native
  def clearBufferList(): scala.Unit = js.native
  def disableVertexAttribArray(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def getUniformLocation(name: java.lang.String): js.Any = js.native
  def sendAllBufferData(): scala.Unit = js.native
  def sendBuffer(pos: scala.Double, buffer: wonderDotJsLib.distEs2015RendererBufferArrayBufferMod.ArrayBuffer): scala.Unit = js.native
  def sendColor3(name: java.lang.String, data: wonderDotJsLib.distEs2015StructureColorMod.Color): scala.Unit = js.native
  def sendFloat1(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendFloat2(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendFloat3(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendFloat4(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendMatrix3(name: java.lang.String, data: wonderDotJsLib.distEs2015MathMatrix3Mod.Matrix3): scala.Unit = js.native
  def sendMatrix4(name: java.lang.String, data: wonderDotJsLib.distEs2015MathMatrix4Mod.Matrix4): scala.Unit = js.native
  def sendMatrix4Array(name: java.lang.String, data: js.Array[scala.Double]): scala.Unit = js.native
  def sendMatrix4Array(name: java.lang.String, data: stdLib.Float32Array): scala.Unit = js.native
  def sendNum1(name: java.lang.String, data: scala.Double): scala.Unit = js.native
  def sendSampleArray(name: java.lang.String, data: js.Array[scala.Double]): scala.Unit = js.native
  def sendVector2(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendVector3(name: java.lang.String, data: js.Any): scala.Unit = js.native
  def sendVector4(name: java.lang.String, data: js.Any): scala.Unit = js.native
}

@JSImport("wonder.js/dist/es2015/renderer/program/GLSLDataSender", "GLSLDataSender")
@js.native
object GLSLDataSender extends js.Object {
  def create(program: wonderDotJsLib.distEs2015RendererProgramProgramMod.Program): wonderDotJsLib.distEs2015RendererProgramGLSLDataSenderMod.GLSLDataSender = js.native
}


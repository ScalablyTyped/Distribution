package typings.wonderJs

import typings.wonderJs.arrayBufferMod.ArrayBuffer
import typings.wonderJs.colorMod.Color
import typings.wonderJs.matrix3Mod.Matrix3
import typings.wonderJs.matrix4Mod.Matrix4
import typings.wonderJs.programMod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glsldatasenderMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/program/GLSLDataSender", "GLSLDataSender")
  @js.native
  open class GLSLDataSender protected () extends StObject {
    def this(program: Program) = this()
    
    def addBufferToToSendList(pos: Double, buffer: ArrayBuffer): Unit = js.native
    
    def clearAllCache(): Unit = js.native
    
    def clearBufferList(): Unit = js.native
    
    def disableVertexAttribArray(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def getUniformLocation(name: String): Any = js.native
    
    def sendAllBufferData(): Unit = js.native
    
    def sendBuffer(pos: Double, buffer: ArrayBuffer): Unit = js.native
    
    def sendColor3(name: String, data: Color): Unit = js.native
    
    def sendFloat1(name: String, data: Any): Unit = js.native
    
    def sendFloat2(name: String, data: Any): Unit = js.native
    
    def sendFloat3(name: String, data: Any): Unit = js.native
    
    def sendFloat4(name: String, data: Any): Unit = js.native
    
    def sendMatrix3(name: String, data: Matrix3): Unit = js.native
    
    def sendMatrix4(name: String, data: Matrix4): Unit = js.native
    
    def sendMatrix4Array(name: String, data: js.Array[Double]): Unit = js.native
    def sendMatrix4Array(name: String, data: js.typedarray.Float32Array): Unit = js.native
    
    def sendNum1(name: String, data: Double): Unit = js.native
    
    def sendSampleArray(name: String, data: js.Array[Double]): Unit = js.native
    
    def sendVector2(name: String, data: Any): Unit = js.native
    
    def sendVector3(name: String, data: Any): Unit = js.native
    
    def sendVector4(name: String, data: Any): Unit = js.native
  }
  /* static members */
  object GLSLDataSender {
    
    @JSImport("wonder.js/dist/es2015/renderer/program/GLSLDataSender", "GLSLDataSender")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(program: Program): GLSLDataSender = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(program.asInstanceOf[js.Any]).asInstanceOf[GLSLDataSender]
  }
}

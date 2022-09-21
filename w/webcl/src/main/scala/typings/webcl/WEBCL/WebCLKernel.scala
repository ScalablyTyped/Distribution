package typings.webcl.WEBCL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.9
@js.native
trait WebCLKernel extends StObject {
  
  def getArgInfo(index: Double): WebCLKernelArgInfo = js.native
  
  def getInfo(name: KernelInfo): Any = js.native
  
  def getWorkGroupInfo(device: WebCLDevice, name: KernelWorkGroupInfo): Any = js.native
  
  def release(): Unit = js.native
  
  def setArg(index: Double, buffer: WebCLBuffer): Unit = js.native
  def setArg(index: Double, image: WebCLImage): Unit = js.native
  def setArg(index: Double, value: js.typedarray.ArrayBufferView): Unit = js.native
  def setArg(index: Double, value: WebCLSampler): Unit = js.native
}

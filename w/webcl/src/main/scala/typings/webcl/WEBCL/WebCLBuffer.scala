package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.6.1
@js.native
trait WebCLBuffer extends WebCLMemoryObject {
  
  def createSubBuffer(memFlags: MemFlagsBits, origin: Double, sizeInBytes: Double): WebCLBuffer = js.native
}
object WebCLBuffer {
  
  @scala.inline
  def apply(
    createSubBuffer: (MemFlagsBits, Double, Double) => WebCLBuffer,
    getInfo: MemInfo => js.Any,
    release: () => Unit
  ): WebCLBuffer = {
    val __obj = js.Dynamic.literal(createSubBuffer = js.Any.fromFunction3(createSubBuffer), getInfo = js.Any.fromFunction1(getInfo), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[WebCLBuffer]
  }
  
  @scala.inline
  implicit class WebCLBufferOps[Self <: WebCLBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateSubBuffer(value: (MemFlagsBits, Double, Double) => WebCLBuffer): Self = this.set("createSubBuffer", js.Any.fromFunction3(value))
  }
}

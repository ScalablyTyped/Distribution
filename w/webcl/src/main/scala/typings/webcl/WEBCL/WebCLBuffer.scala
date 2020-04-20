package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.6.1
trait WebCLBuffer extends WebCLMemoryObject {
  def createSubBuffer(memFlags: MemFlagsBits, origin: Double, sizeInBytes: Double): WebCLBuffer
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
}


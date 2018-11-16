package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.6.1

trait WebCLBuffer extends WebCLMemoryObject {
  def createSubBuffer(memFlags: MemFlagsBits, origin: scala.Double, sizeInBytes: scala.Double): WebCLBuffer
}


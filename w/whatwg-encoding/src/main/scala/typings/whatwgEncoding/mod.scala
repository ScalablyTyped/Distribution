package typings.whatwgEncoding

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("whatwg-encoding", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def decode(buffer: Buffer, fallbackEncodingName: String): String = js.native
  def getBOMEncoding(buffer: Buffer): String | Null = js.native
  def isSupported(name: String): Boolean = js.native
  def labelToName(label: String): String | Null = js.native
}


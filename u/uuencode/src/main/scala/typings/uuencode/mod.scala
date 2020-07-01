package typings.uuencode

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuencode", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def decode(str: String): String = js.native
  def decode(str: Buffer): String = js.native
  def encode(str: String): String = js.native
  def encode(str: Buffer): String = js.native
}


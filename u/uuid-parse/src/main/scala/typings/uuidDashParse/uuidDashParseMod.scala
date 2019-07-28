package typings.uuidDashParse

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuid-parse", JSImport.Namespace)
@js.native
object uuidDashParseMod extends js.Object {
  def parse(id: String): Buffer = js.native
  def parse(id: String, buffer: js.Array[_]): Buffer = js.native
  def parse(id: String, buffer: js.Array[_], offset: Double): Buffer = js.native
  def parse(id: String, buffer: Buffer): Buffer = js.native
  def parse(id: String, buffer: Buffer, offset: Double): Buffer = js.native
  def unparse(buffer: Buffer): String = js.native
  def unparse(buffer: Buffer, offset: Double): String = js.native
}


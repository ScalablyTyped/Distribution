package typings.uidDashGenerator.uidDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIDGenerator extends js.Object {
  val base: Double = js.native
  val baseEncoding: String = js.native
  val bitSize: Double = js.native
  val uidLength: Double = js.native
  def generate(): js.Promise[String] = js.native
  def generate(cb: js.Function1[/* uid */ String, _]): Unit = js.native
  def generateSync(): String = js.native
}

@JSImport("uid-generator", "UIDGenerator")
@js.native
class UIDGeneratorCls () extends UIDGenerator {
  def this(baseEncoding: String) = this()
  def this(bitSize: Double) = this()
  def this(bitSize: Double, baseEncoding: String) = this()
}


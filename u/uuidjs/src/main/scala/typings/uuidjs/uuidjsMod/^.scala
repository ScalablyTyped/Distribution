package typings.uuidjs.uuidjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuidjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FIELD_NAMES: js.Array[String] = js.native
  val FIELD_SIZES: js.Array[Double] = js.native
  val NIL: UUID = js.native
  var overwrittenUUID: js.Any = js.native
  def genV1(): UUID = js.native
  def genV4(): UUID = js.native
  def generate(): String = js.native
  def parse(strId: String): UUID = js.native
  def resetState(): Unit = js.native
  def useMathRandom(): Unit = js.native
}


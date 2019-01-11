package typings
package uuidjsLib.uuidjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuidjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FIELD_NAMES: js.Array[java.lang.String] = js.native
  val FIELD_SIZES: js.Array[scala.Double] = js.native
  val NIL: uuidjsLib.uuidjsMod.UUID = js.native
  var overwrittenUUID: js.Any = js.native
  def genV1(): uuidjsLib.uuidjsMod.UUID = js.native
  def genV4(): uuidjsLib.uuidjsMod.UUID = js.native
  def generate(): java.lang.String = js.native
  def parse(strId: java.lang.String): uuidjsLib.uuidjsMod.UUID = js.native
  def resetState(): scala.Unit = js.native
  def useMathRandom(): scala.Unit = js.native
}


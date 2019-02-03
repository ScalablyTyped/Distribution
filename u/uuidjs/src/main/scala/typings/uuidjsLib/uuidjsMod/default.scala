package typings
package uuidjsLib.uuidjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuidjs", JSImport.Default)
@js.native
class default () extends UUIDClass {
  /* CompleteClass */
  override val bitFields: UUIDFields[java.lang.String] = js.native
  /* CompleteClass */
  override val bitString: java.lang.String = js.native
  /* CompleteClass */
  override val hexFields: UUIDFields[java.lang.String] = js.native
  /* CompleteClass */
  override val hexNoDelim: java.lang.String = js.native
  /* CompleteClass */
  override val hexString: java.lang.String = js.native
  /* CompleteClass */
  override val intFields: UUIDFields[scala.Double] = js.native
  /* CompleteClass */
  override val urn: java.lang.String = js.native
  /* CompleteClass */
  override val version: scala.Double = js.native
  /* CompleteClass */
  override def equals(uuid: UUIDClass): scala.Boolean = js.native
}

/* static members */
@JSImport("uuidjs", JSImport.Default)
@js.native
object default extends js.Object {
  val FIELD_NAMES: js.Array[java.lang.String] = js.native
  val FIELD_SIZES: js.Array[scala.Double] = js.native
  val NIL: uuidjsLib.uuidjsMod.UUIDClass = js.native
  // Hide unnecessary methods
  var overwrittenUUID: js.Any = js.native
  def genV1(): uuidjsLib.uuidjsMod.UUIDClass = js.native
  def genV4(): uuidjsLib.uuidjsMod.UUIDClass = js.native
  def generate(): java.lang.String = js.native
  def parse(strId: java.lang.String): uuidjsLib.uuidjsMod.UUIDClass = js.native
  def resetState(): scala.Unit = js.native
  def useMathRandom(): scala.Unit = js.native
}


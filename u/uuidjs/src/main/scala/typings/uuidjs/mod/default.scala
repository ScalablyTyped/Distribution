package typings.uuidjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuidjs", JSImport.Default)
@js.native
class default () extends UUIDClass {
  /* CompleteClass */
  override val bitFields: UUIDFields[String] = js.native
  /* CompleteClass */
  override val bitString: String = js.native
  /* CompleteClass */
  override val hexFields: UUIDFields[String] = js.native
  /* CompleteClass */
  override val hexNoDelim: String = js.native
  /* CompleteClass */
  override val hexString: String = js.native
  /* CompleteClass */
  override val intFields: UUIDFields[Double] = js.native
  /* CompleteClass */
  override val urn: String = js.native
  /* CompleteClass */
  override val version: Double = js.native
  /* CompleteClass */
  override def equals(uuid: UUIDClass): Boolean = js.native
}

/* static members */
@JSImport("uuidjs", JSImport.Default)
@js.native
object default extends js.Object {
  val FIELD_NAMES: js.Array[String] = js.native
  val FIELD_SIZES: js.Array[Double] = js.native
  val NIL: UUIDClass = js.native
  // Hide unnecessary methods
  var overwrittenUUID: js.Any = js.native
  def genV1(): UUIDClass = js.native
  def genV4(): UUIDClass = js.native
  def generate(): String = js.native
  def parse(strId: String): UUIDClass = js.native
  def resetState(): Unit = js.native
  def useMathRandom(): Unit = js.native
}


package typings.uuidjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UUIDClass extends js.Object {
  val bitFields: UUIDFields[String]
  val bitString: String
  val hexFields: UUIDFields[String]
  val hexNoDelim: String
  val hexString: String
  val intFields: UUIDFields[Double]
  val urn: String
  val version: Double
  def equals(uuid: UUIDClass): Boolean
}

object UUIDClass {
  @scala.inline
  def apply(
    bitFields: UUIDFields[String],
    bitString: String,
    equals: UUIDClass => Boolean,
    hexFields: UUIDFields[String],
    hexNoDelim: String,
    hexString: String,
    intFields: UUIDFields[Double],
    urn: String,
    version: Double
  ): UUIDClass = {
    val __obj = js.Dynamic.literal(bitFields = bitFields.asInstanceOf[js.Any], bitString = bitString.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), hexFields = hexFields.asInstanceOf[js.Any], hexNoDelim = hexNoDelim.asInstanceOf[js.Any], hexString = hexString.asInstanceOf[js.Any], intFields = intFields.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUIDClass]
  }
}


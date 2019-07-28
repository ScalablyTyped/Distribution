package typings.uuidjs.uuidjsMod

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
    toString: () => String,
    urn: String,
    version: Double
  ): UUIDClass = {
    val __obj = js.Dynamic.literal(bitFields = bitFields, bitString = bitString, equals = js.Any.fromFunction1(equals), hexFields = hexFields, hexNoDelim = hexNoDelim, hexString = hexString, intFields = intFields, toString = js.Any.fromFunction0(toString), urn = urn, version = version)
  
    __obj.asInstanceOf[UUIDClass]
  }
}


package typings.uuidjs.uuidjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Use class-based API */
trait UUID extends js.Object {
  var bitFields: UUIDFields[String]
  var bitString: String
  var hexFields: UUIDFields[String]
  var hexNoDelim: String
  var hexString: String
  var intFields: UUIDFields[Double]
  var urn: String
  var version: Double
  def equals(uuid: UUID): Boolean
}

object UUID {
  @scala.inline
  def apply(
    bitFields: UUIDFields[String],
    bitString: String,
    equals: UUID => Boolean,
    hexFields: UUIDFields[String],
    hexNoDelim: String,
    hexString: String,
    intFields: UUIDFields[Double],
    toString: () => String,
    urn: String,
    version: Double
  ): UUID = {
    val __obj = js.Dynamic.literal(bitFields = bitFields, bitString = bitString, equals = js.Any.fromFunction1(equals), hexFields = hexFields, hexNoDelim = hexNoDelim, hexString = hexString, intFields = intFields, toString = js.Any.fromFunction0(toString), urn = urn, version = version)
  
    __obj.asInstanceOf[UUID]
  }
}


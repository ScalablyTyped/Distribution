package typings
package uuidjsLib.uuidjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Use class-based API */
trait UUID extends js.Object {
  var bitFields: UUIDFields[java.lang.String]
  var bitString: java.lang.String
  var hexFields: UUIDFields[java.lang.String]
  var hexNoDelim: java.lang.String
  var hexString: java.lang.String
  var intFields: UUIDFields[scala.Double]
  var urn: java.lang.String
  var version: scala.Double
  def equals(uuid: UUID): scala.Boolean
}

object UUID {
  @scala.inline
  def apply(
    bitFields: UUIDFields[java.lang.String],
    bitString: java.lang.String,
    equals: js.Function1[UUID, scala.Boolean],
    hexFields: UUIDFields[java.lang.String],
    hexNoDelim: java.lang.String,
    hexString: java.lang.String,
    intFields: UUIDFields[scala.Double],
    toString: js.Function0[java.lang.String],
    urn: java.lang.String,
    version: scala.Double
  ): UUID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bitFields")(bitFields)
    __obj.updateDynamic("bitString")(bitString)
    __obj.updateDynamic("equals")(equals)
    __obj.updateDynamic("hexFields")(hexFields)
    __obj.updateDynamic("hexNoDelim")(hexNoDelim)
    __obj.updateDynamic("hexString")(hexString)
    __obj.updateDynamic("intFields")(intFields)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("urn")(urn)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[UUID]
  }
}


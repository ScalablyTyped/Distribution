package typings
package uuidjsLib.uuidjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UUIDClass extends js.Object {
  val bitFields: UUIDFields[java.lang.String]
  val bitString: java.lang.String
  val hexFields: UUIDFields[java.lang.String]
  val hexNoDelim: java.lang.String
  val hexString: java.lang.String
  val intFields: UUIDFields[scala.Double]
  val urn: java.lang.String
  val version: scala.Double
  def equals(uuid: UUIDClass): scala.Boolean
}

object UUIDClass {
  @scala.inline
  def apply(
    bitFields: UUIDFields[java.lang.String],
    bitString: java.lang.String,
    equals: js.Function1[UUIDClass, scala.Boolean],
    hexFields: UUIDFields[java.lang.String],
    hexNoDelim: java.lang.String,
    hexString: java.lang.String,
    intFields: UUIDFields[scala.Double],
    toString: js.Function0[java.lang.String],
    urn: java.lang.String,
    version: scala.Double
  ): UUIDClass = {
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
    __obj.asInstanceOf[UUIDClass]
  }
}


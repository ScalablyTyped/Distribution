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


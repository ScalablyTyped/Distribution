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


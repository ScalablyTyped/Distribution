package typings
package winrtLib.WindowsNs.DataNs.JsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonValueStatics extends js.Object {
  def createBooleanValue(input: scala.Boolean): JsonValue
  def createNumberValue(input: scala.Double): JsonValue
  def createStringValue(input: java.lang.String): JsonValue
  def parse(input: java.lang.String): JsonValue
  def tryParse(input: java.lang.String): winrtLib.Anon_Result
}


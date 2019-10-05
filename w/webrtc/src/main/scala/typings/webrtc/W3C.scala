package typings.webrtc

import typings.webrtc.W3C.ConstrainNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("W3C")
@js.native
object W3C extends js.Object {
  type ConstrainBoolean = Boolean | ConstrainBooleanParameters
  type ConstrainDouble = ConstrainNumber
  type ConstrainLong = ConstrainNumber
  type ConstrainNumber = Double | ConstrainNumberRange
  type ConstrainString = String | js.Array[String] | ConstrainStringParameters
  type DoubleRange = NumberRange
  type LongRange = NumberRange
}


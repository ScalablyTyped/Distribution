package typings.webrtc

import typings.webrtc.ConstrainBooleanParameters
import typings.webrtc.ConstrainNumberRange
import typings.webrtc.ConstrainStringParameters
import typings.webrtc.NumberRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object W3CNs {
  type ConstrainBoolean = Boolean | ConstrainBooleanParameters
  type ConstrainDouble = ConstrainNumber
  type ConstrainLong = ConstrainNumber
  type ConstrainNumber = Double | ConstrainNumberRange
  type ConstrainString = String | js.Array[String] | ConstrainStringParameters
  type DoubleRange = NumberRange
  type LongRange = NumberRange
}

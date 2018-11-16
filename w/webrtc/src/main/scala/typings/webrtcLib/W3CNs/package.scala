package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object W3CNs {
  type ConstrainBoolean = scala.Boolean | webrtcLib.ConstrainBooleanParameters
  type ConstrainDouble = ConstrainNumber
  type ConstrainLong = ConstrainNumber
  type ConstrainNumber = scala.Double | webrtcLib.ConstrainNumberRange
  type ConstrainString = java.lang.String | js.Array[java.lang.String] | webrtcLib.ConstrainStringParameters
  type DoubleRange = webrtcLib.NumberRange
  type LongRange = webrtcLib.NumberRange
}

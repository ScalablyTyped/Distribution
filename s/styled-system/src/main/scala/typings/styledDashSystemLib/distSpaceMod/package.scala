package typings
package styledDashSystemLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSpaceMod {
  type ResponsiveSpaceValue = ResponsiveValue[SpaceValue]
  type ResponsiveValue[T] = T | (js.Array[T | scala.Null])
  type SpaceValue = scala.Double | java.lang.String
}

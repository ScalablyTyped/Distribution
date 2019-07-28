package typings.uiDashBox

import org.scalablytyped.runtime.StringDictionary
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distUtilsSplitDashPropsMod {
  type Dictionary[T] = StringDictionary[T]
  type Omit[T /* <: Dictionary[_] */, K /* <: String */] = Pick[T, Exclude[String, K]]
}

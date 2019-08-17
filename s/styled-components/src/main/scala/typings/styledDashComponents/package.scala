package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashComponents {
  import typings.std.Exclude
  import typings.std.Pick

  // Helper type operators
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}

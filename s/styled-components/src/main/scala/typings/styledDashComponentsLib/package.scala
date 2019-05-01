package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashComponentsLib {
  // abuse Pick to strip the call signature from ForwardRefExoticComponent
  type ForwardRefExoticBase[P] = stdLib.Pick[reactLib.reactMod.ForwardRefExoticComponent[P], java.lang.String]
  // Helper type operators
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
}

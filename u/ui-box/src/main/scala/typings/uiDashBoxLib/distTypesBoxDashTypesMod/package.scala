package typings
package uiDashBoxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesBoxDashTypesMod {
  type BoxProps[T /* <: Is[_] */] = (Without[reactLib.reactMod.ComponentProps[T], uiDashBoxLib.uiDashBoxLibStrings.is]) with uiDashBoxLib.distTypesEnhancersMod.EnhancerProps with uiDashBoxLib.Anon_InnerRef[T]
  type Is[P] = reactLib.reactMod.ElementType[P]
  type Without[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
}

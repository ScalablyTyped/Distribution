package typings.uiDashBox

import typings.react.reactMod.ComponentProps
import typings.react.reactMod.ElementType
import typings.std.Exclude
import typings.std.Pick
import typings.uiDashBox.Anon_InnerRef
import typings.uiDashBox.distTypesEnhancersMod.EnhancerProps
import typings.uiDashBox.uiDashBoxStrings.is
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesBoxDashTypesMod {
  type BoxProps[T /* <: Is[_] */] = (Without[ComponentProps[T], is]) with EnhancerProps with Anon_InnerRef[T]
  type Is[P] = ElementType[P]
  type Without[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}

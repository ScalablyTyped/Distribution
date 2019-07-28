package typings.styledDashComponents

import typings.react.reactMod.ComponentType
import typings.styledDashComponents.styledDashComponentsMod.ThemedStyledFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nativeMod {
  type AnyIfEmpty[T /* <: js.Object */] = T
  type ReactNativeThemedStyledFunction[C /* <: ComponentType[_] */, T /* <: js.Object */] = ThemedStyledFunction[C, T, js.Object, scala.Nothing]
  type ReactNativeThemedStyledInterface[T /* <: js.Object */] = ReactNativeThemedBaseStyledInterface[AnyIfEmpty[T]]
}

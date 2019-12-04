package typings.styledDashComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nativeMod {
  import typings.react.reactMod.ComponentType
  import typings.styledDashComponents.styledDashComponentsMod.ThemedStyledFunction

  type AnyIfEmpty[T /* <: js.Object */] = T
  type ReactNativeThemedStyledFunction[C /* <: ComponentType[_] */, T /* <: js.Object */] = ThemedStyledFunction[C, T, js.Object, scala.Nothing]
  type ReactNativeThemedStyledInterface[T /* <: js.Object */] = ReactNativeThemedBaseStyledInterface[AnyIfEmpty[T]]
}

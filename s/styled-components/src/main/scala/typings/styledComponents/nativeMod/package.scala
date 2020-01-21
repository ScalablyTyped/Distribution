package typings.styledComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nativeMod {
  type AnyIfEmpty[T /* <: js.Object */] = T
  type ReactNativeThemedStyledFunction[C /* <: typings.react.mod.ComponentType[_] */, T /* <: js.Object */] = typings.styledComponents.styledComponentsMod.ThemedStyledFunction[C, T, js.Object, scala.Nothing]
  type ReactNativeThemedStyledInterface[T /* <: js.Object */] = typings.styledComponents.nativeMod.ReactNativeThemedBaseStyledInterface[typings.styledComponents.nativeMod.AnyIfEmpty[T]]
}

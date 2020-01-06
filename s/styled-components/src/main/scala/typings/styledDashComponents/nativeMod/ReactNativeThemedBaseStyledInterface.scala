package typings.styledDashComponents.nativeMod

import typings.react.reactMod.ComponentType
import typings.styledDashComponents.styledDashComponentsMod.ThemedStyledFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Copied over from "ThemedBaseStyledInterface" in index.d.ts in order to remove DOM element typings
@js.native
trait ReactNativeThemedBaseStyledInterface[T /* <: js.Object */] extends js.Object {
  def apply[C /* <: ComponentType[_] */](
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: C
  ): ThemedStyledFunction[C, T, js.Object, scala.Nothing] = js.native
}


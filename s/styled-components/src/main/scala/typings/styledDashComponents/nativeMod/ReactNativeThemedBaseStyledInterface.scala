package typings.styledDashComponents.nativeMod

import typings.styledDashComponents.styledDashComponentsMod.AnyStyledComponent
import typings.styledDashComponents.styledDashComponentsMod.StyledComponentInnerAttrs
import typings.styledDashComponents.styledDashComponentsMod.StyledComponentInnerComponent
import typings.styledDashComponents.styledDashComponentsMod.StyledComponentInnerOtherProps
import typings.styledDashComponents.styledDashComponentsMod.ThemedStyledFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Copied over from "ThemedBaseStyledInterface" in index.d.ts in order to remove DOM element typings
@js.native
trait ReactNativeThemedBaseStyledInterface[T /* <: js.Object */] extends js.Object {
  def apply[C /* <: AnyStyledComponent */](component: C): ThemedStyledFunction[
    StyledComponentInnerComponent[C], 
    T, 
    StyledComponentInnerOtherProps[C], 
    StyledComponentInnerAttrs[C]
  ] = js.native
}


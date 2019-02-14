package typings
package styledDashComponentsLib.nativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Copied over from "ThemedBaseStyledInterface" in index.d.ts in order to remove DOM element typings
@js.native
trait ReactNativeThemedBaseStyledInterface[T /* <: js.Object */] extends js.Object {
  def apply[C /* <: styledDashComponentsLib.styledDashComponentsMod.AnyStyledComponent */](component: C): styledDashComponentsLib.styledDashComponentsMod.ThemedStyledFunction[
    styledDashComponentsLib.styledDashComponentsMod.StyledComponentInnerComponent[C], 
    T, 
    styledDashComponentsLib.styledDashComponentsMod.StyledComponentInnerOtherProps[C], 
    styledDashComponentsLib.styledDashComponentsMod.StyledComponentInnerAttrs[C]
  ] = js.native
}


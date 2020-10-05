package typings.styledComponents.nativeMod

import typings.styledComponents.styledComponentsMod.AnyStyledComponent
import typings.styledComponents.styledComponentsMod.StyledComponentInnerAttrs
import typings.styledComponents.styledComponentsMod.StyledComponentInnerComponent
import typings.styledComponents.styledComponentsMod.StyledComponentInnerOtherProps
import typings.styledComponents.styledComponentsMod.ThemedStyledFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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


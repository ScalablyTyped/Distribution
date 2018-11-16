package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(styled-components.ThemedStyledComponentFactories) */ @js.native
trait ThemedBaseStyledInterface[T /* <: js.Object */] extends js.Object {
  def apply[C /* <: AnyStyledComponent */](component: C): ThemedStyledFunction[
    styledDashComponentsLib.StyledComponentInnerComponent[C], 
    T, 
    styledDashComponentsLib.StyledComponentInnerOtherProps[C], 
    styledDashComponentsLib.StyledComponentInnerAttrs[C]
  ] = js.native
}


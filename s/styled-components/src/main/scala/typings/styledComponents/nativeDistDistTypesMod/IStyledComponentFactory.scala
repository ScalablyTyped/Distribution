package typings.styledComponents.nativeDistDistTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type IStyledComponentFactory = (target : Target, options : styled-components.styled-components/native/dist/dist/types.StyledOptions<Props>, rules : styled-components.styled-components/native/dist/dist/types.RuleSet<Props>): styled-components.styled-components/native/dist/dist/types.IStyledComponent<Target, Props> & Statics
}}}
to avoid circular code involving: 
- styled-components.styled-components/native/dist/dist/types.IStyledComponentFactory
- styled-components.styled-components/native/dist/dist/types.Interpolation
- styled-components.styled-components/native/dist/dist/types.RuleSet
*/
@js.native
trait IStyledComponentFactory[Target /* <: WebTarget */, Props, Statics] extends StObject {
  
  def apply(target: Target, options: StyledOptions[Props], rules: RuleSet[Props]): (IStyledComponent[Target, Props]) & Statics = js.native
}

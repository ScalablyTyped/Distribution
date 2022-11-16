package typings.styledComponents.nativeDistDistTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type IStyledNativeComponentFactory = (target : Target, options : styled-components.styled-components/native/dist/dist/types.StyledNativeOptions<Props>, rules : styled-components.styled-components/native/dist/dist/types.RuleSet<Props>): styled-components.styled-components/native/dist/dist/types.IStyledNativeComponent<Target, Props> & Statics
}}}
to avoid circular code involving: 
- styled-components.styled-components/native/dist/dist/types.IStyledNativeComponentFactory
- styled-components.styled-components/native/dist/dist/types.Interpolation
- styled-components.styled-components/native/dist/dist/types.RuleSet
*/
@js.native
trait IStyledNativeComponentFactory[Target /* <: NativeTarget */, Props, Statics] extends StObject {
  
  def apply(target: Target, options: StyledNativeOptions[Props], rules: RuleSet[Props]): (IStyledNativeComponent[Target, Props]) & Statics = js.native
}

package typings.styledComponents.nativeDistDistTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type StyleFunction = (executionContext : styled-components.styled-components/native/dist/dist/types.ExecutionContext & Props): string | number | styled-components.styled-components/native/dist/dist/types.StyledObject | styled-components.styled-components/native/dist/dist/types.CSSConstructor<Props> | styled-components.styled-components/native/dist/dist/types.StyleFunction<Props>
}}}
to avoid circular code involving: 
- styled-components.styled-components/native/dist/dist/types.Flattener
- styled-components.styled-components/native/dist/dist/types.FlattenerResult
- styled-components.styled-components/native/dist/dist/types.IStyledComponentFactory
- styled-components.styled-components/native/dist/dist/types.IStyledNativeComponentFactory
- styled-components.styled-components/native/dist/dist/types.Interpolation
- styled-components.styled-components/native/dist/dist/types.RuleSet
- styled-components.styled-components/native/dist/dist/types.StyleFunction
- styled-components.styled-components/native/dist/dist/types.StyledObject
- styled-components.styled-components/native/dist/dist/types.Styles
*/
@js.native
trait StyleFunction[Props]
  extends StObject
     with _Interpolation[Props] {
  
  def apply(executionContext: ExecutionContext & Props): String | Double | StyledObject | CSSConstructor[Props] | StyleFunction[Props] = js.native
}

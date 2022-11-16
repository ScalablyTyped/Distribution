package typings.styledComponents.nativeDistDistTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type CSSConstructor = (strings : std.Array<string>, interpolations : ...styled-components.styled-components/native/dist/dist/types.Interpolation<Props>): styled-components.styled-components/native/dist/dist/types.RuleSet<Props>
}}}
to avoid circular code involving: 
- styled-components.styled-components/native/dist/dist/types.CSSConstructor
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
trait CSSConstructor[Props] extends StObject {
  
  def apply(strings: js.Array[String], interpolations: Interpolation[Props]*): RuleSet[Props] = js.native
}

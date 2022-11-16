package typings.styledComponents.nativeDistDistTypesMod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type RuleSet = std.Array<styled-components.styled-components/native/dist/dist/types.Interpolation<Props>>
}}}
to avoid circular code involving: 
- styled-components.styled-components/native/dist/dist/types.FlattenerResult
- styled-components.styled-components/native/dist/dist/types.Interpolation
- styled-components.styled-components/native/dist/dist/types.RuleSet
*/
@js.native
trait RuleSet[Props]
  extends StObject
     with Array[Interpolation[Props]]
     with _FlattenerResult[Props]

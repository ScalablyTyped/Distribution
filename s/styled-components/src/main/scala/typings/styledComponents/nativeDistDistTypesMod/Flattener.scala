package typings.styledComponents.nativeDistDistTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type Flattener = (chunks : std.Array<styled-components.styled-components/native/dist/dist/types.Interpolation<Props>>, executionContext : std.Object | null | undefined, styleSheet : std.Object | null | undefined): std.Array<styled-components.styled-components/native/dist/dist/types.Interpolation<Props>>
}}}
to avoid circular code involving: 
- styled-components.styled-components/native/dist/dist/types.Flattener
- styled-components.styled-components/native/dist/dist/types.Interpolation
*/
@js.native
trait Flattener[Props] extends StObject {
  
  def apply(chunks: js.Array[Interpolation[Props]]): js.Array[Interpolation[Props]] = js.native
  def apply(chunks: js.Array[Interpolation[Props]], executionContext: js.Object): js.Array[Interpolation[Props]] = js.native
  def apply(chunks: js.Array[Interpolation[Props]], executionContext: js.Object, styleSheet: js.Object): js.Array[Interpolation[Props]] = js.native
  def apply(chunks: js.Array[Interpolation[Props]], executionContext: Null, styleSheet: js.Object): js.Array[Interpolation[Props]] = js.native
  def apply(chunks: js.Array[Interpolation[Props]], executionContext: Unit, styleSheet: js.Object): js.Array[Interpolation[Props]] = js.native
}

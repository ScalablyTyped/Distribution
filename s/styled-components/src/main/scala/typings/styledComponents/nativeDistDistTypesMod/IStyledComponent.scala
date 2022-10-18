package typings.styledComponents.nativeDistDistTypesMod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStyledComponent[Target /* <: WebTarget */, Props]
  extends StObject
     with CustomComponent[Target, Props, ExecutionContext]
     with IStyledStatics[Props] {
  
  @JSName("defaultProps")
  var defaultProps_IStyledComponent: js.UndefOr[
    Partial[
      ExtensibleObject & (/* import warning: importer.ImportType#apply Failed type conversion: Target extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentProps<Target> : {} */ js.Any) & Props
    ]
  ] = js.native
}

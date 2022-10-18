package typings.styledComponents.nativeDistDistTypesMod

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStyledNativeComponent[Target /* <: NativeTarget */, Props]
  extends StObject
     with CustomComponent[Target, Props, ExecutionContext]
     with IStyledNativeStatics[Props] {
  
  @JSName("defaultProps")
  var defaultProps_IStyledNativeComponent: js.UndefOr[
    Partial[
      ExtensibleObject & (/* import warning: importer.ImportType#apply Failed type conversion: Target extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentProps<Target> : {} */ js.Any) & Props
    ]
  ] = js.native
}

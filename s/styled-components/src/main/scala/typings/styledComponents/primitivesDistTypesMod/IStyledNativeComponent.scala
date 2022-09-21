package typings.styledComponents.primitivesDistTypesMod

import typings.react.mod.ComponentProps
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStyledNativeComponent[Target /* <: NativeTarget */, Props]
  extends StObject
     with PolymorphicComponent[Target, Props, ExecutionContext]
     with IStyledNativeStatics[Props] {
  
  @JSName("defaultProps")
  var defaultProps_IStyledNativeComponent: js.UndefOr[Partial[ExtensibleObject & (js.Object | ComponentProps[Target]) & Props]] = js.native
}

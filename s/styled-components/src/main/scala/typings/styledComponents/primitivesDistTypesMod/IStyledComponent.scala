package typings.styledComponents.primitivesDistTypesMod

import typings.react.mod.ComponentProps
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStyledComponent[Target /* <: WebTarget */, Props]
  extends StObject
     with PolymorphicComponent[Target, Props, ExecutionContext]
     with IStyledStatics[Props] {
  
  @JSName("defaultProps")
  var defaultProps_IStyledComponent: js.UndefOr[Partial[ExtensibleObject & (js.Object | ComponentProps[Target]) & Props]] = js.native
}

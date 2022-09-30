package typings.styledComponents.anon

import typings.styledComponents.nativeDistTypesMod.ExecutionContext
import typings.styledComponents.nativeDistTypesMod.ExtensibleObject
import typings.styledComponents.nativeDistTypesMod.IStyledComponent
import typings.styledComponents.nativeDistTypesMod.Interpolation
import typings.styledComponents.nativeDistTypesMod.Runtime
import typings.styledComponents.nativeDistTypesMod.StyledOptions
import typings.styledComponents.nativeDistTypesMod.StyledTarget
import typings.styledComponents.nativeDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call[DerivedProps, OuterProps, R /* <: Runtime */, Target /* <: StyledTarget[R] */, // used for styled<{}>().attrs() so attrs() gets the generic prop context
OuterStatics] extends StObject {
  
  def apply[Props /* <: js.Object */, Statics](
    initialStyles: Styles[DerivedProps & OuterProps & Props],
    interpolations: (Interpolation[ExecutionContext & DerivedProps & OuterProps & Props])*
  ): (IStyledComponent[R, Target, DerivedProps & OuterProps & Props]) & OuterStatics & Statics = js.native
  
  def attrs(
    attrs: typings.styledComponents.nativeDistTypesMod.Attrs[ExtensibleObject & DerivedProps & OuterProps]
  ): Any = js.native
  
  /**
    * If config methods are called, wrap up a new template function and merge options */
  def withConfig(config: StyledOptions[R, DerivedProps & OuterProps]): Any = js.native
}

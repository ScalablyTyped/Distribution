package typings.styledComponents

import typings.styledComponents.anon.Call
import typings.styledComponents.nativeDistTypesMod.Attrs
import typings.styledComponents.nativeDistTypesMod.ExecutionContext
import typings.styledComponents.nativeDistTypesMod.ExtensibleObject
import typings.styledComponents.nativeDistTypesMod.IStyledComponent
import typings.styledComponents.nativeDistTypesMod.IStyledComponentFactory
import typings.styledComponents.nativeDistTypesMod.Interpolation
import typings.styledComponents.nativeDistTypesMod.Runtime
import typings.styledComponents.nativeDistTypesMod.StyledOptions
import typings.styledComponents.nativeDistTypesMod.StyledTarget
import typings.styledComponents.nativeDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistConstructorsConstructWithOptionsMod {
  
  @JSImport("styled-components/native/dist/constructors/constructWithOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[R /* <: Runtime */, Target /* <: StyledTarget[R] */, DerivedProps, OuterProps, // used for styled<{}>().attrs() so attrs() gets the generic prop context
  OuterStatics](componentConstructor: IStyledComponentFactory[R, Any, Any, Any], tag: Target): Call[DerivedProps, OuterProps, R, Target, OuterStatics] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentConstructor.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[Call[DerivedProps, OuterProps, R, Target, OuterStatics]]
  inline def default[R /* <: Runtime */, Target /* <: StyledTarget[R] */, DerivedProps, OuterProps, // used for styled<{}>().attrs() so attrs() gets the generic prop context
  OuterStatics](
    componentConstructor: IStyledComponentFactory[R, Any, Any, Any],
    tag: Target,
    options: StyledOptions[R, DerivedProps & OuterProps]
  ): Call[DerivedProps, OuterProps, R, Target, OuterStatics] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentConstructor.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Call[DerivedProps, OuterProps, R, Target, OuterStatics]]
  
  @js.native
  trait Styled[R /* <: Runtime */, Target /* <: StyledTarget[R] */, DerivedProps, OuterProps /* <: js.Object */, OuterStatics] extends StObject {
    
    def apply[Props, Statics](
      initialStyles: Styles[DerivedProps & OuterProps & Props],
      interpolations: (Interpolation[ExecutionContext & DerivedProps & OuterProps & Props])*
    ): (IStyledComponent[R, Target, DerivedProps & OuterProps & Props]) & OuterStatics & Statics = js.native
    
    def attrs(attrs: Attrs[ExtensibleObject & DerivedProps & OuterProps]): Styled[R, Target, DerivedProps, OuterProps, OuterStatics] = js.native
    
    def withConfig(config: StyledOptions[R, DerivedProps & OuterProps]): Styled[R, Target, DerivedProps, OuterProps, OuterStatics] = js.native
  }
}

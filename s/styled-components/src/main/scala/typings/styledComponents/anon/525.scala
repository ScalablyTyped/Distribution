package typings.styledComponents.anon

import typings.std.ReturnType
import typings.styledComponents.primitivesDistTypesMod.IStyledComponentFactory
import typings.styledComponents.primitivesDistTypesMod.IStyledNativeComponentFactory
import typings.styledComponents.primitivesDistTypesMod.Interpolation
import typings.styledComponents.primitivesDistTypesMod.StyledNativeOptions
import typings.styledComponents.primitivesDistTypesMod.StyledOptions
import typings.styledComponents.primitivesDistTypesMod.Styles
import typings.styledComponents.styledComponentsStrings.native
import typings.styledComponents.styledComponentsStrings.view
import typings.styledComponents.styledComponentsStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `525`[OuterProps, Environment /* <: web | native */, // used for styled<{}>().attrs() so attrs() gets the generic prop context
OuterStatics] extends StObject {
  
  def apply[Props, Statics](initialStyles: Styles[OuterProps & Props], interpolations: (Interpolation[OuterProps & Props])*): ReturnType[
    (IStyledNativeComponentFactory[view, OuterProps & Props, OuterStatics & Statics]) | (IStyledComponentFactory[view, OuterProps & Props, OuterStatics & Statics])
  ] = js.native
  
  def attrs(attrs: typings.styledComponents.primitivesDistTypesMod.Attrs[OuterProps]): Any = js.native
  
  /**
    * If config methods are called, wrap up a new template function and merge options */
  @JSName("withConfig")
  def withConfig_web(config: StyledNativeOptions[OuterProps] | StyledOptions[OuterProps]): Any = js.native
}

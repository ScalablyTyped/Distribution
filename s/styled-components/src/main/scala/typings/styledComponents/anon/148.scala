package typings.styledComponents.anon

import typings.std.ReturnType
import typings.styledComponents.nativeDistTypesMod.IStyledComponentFactory
import typings.styledComponents.nativeDistTypesMod.IStyledNativeComponentFactory
import typings.styledComponents.nativeDistTypesMod.Interpolation
import typings.styledComponents.nativeDistTypesMod.StyledNativeOptions
import typings.styledComponents.nativeDistTypesMod.StyledOptions
import typings.styledComponents.nativeDistTypesMod.Styles
import typings.styledComponents.styledComponentsStrings.marker
import typings.styledComponents.styledComponentsStrings.native
import typings.styledComponents.styledComponentsStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `148`[OuterProps, Environment /* <: web | native */, // used for styled<{}>().attrs() so attrs() gets the generic prop context
OuterStatics] extends StObject {
  
  def apply[Props, Statics](initialStyles: Styles[OuterProps & Props], interpolations: (Interpolation[OuterProps & Props])*): ReturnType[
    (IStyledNativeComponentFactory[marker, OuterProps & Props, OuterStatics & Statics]) | (IStyledComponentFactory[marker, OuterProps & Props, OuterStatics & Statics])
  ] = js.native
  
  def attrs(attrs: typings.styledComponents.nativeDistTypesMod.Attrs[OuterProps]): Any = js.native
  
  /**
    * If config methods are called, wrap up a new template function and merge options */
  @JSName("withConfig")
  def withConfig_web(config: StyledNativeOptions[OuterProps] | StyledOptions[OuterProps]): Any = js.native
}

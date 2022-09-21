package typings.styledComponents.anon

import typings.std.ReturnType
import typings.styledComponents.distDistTypesMod.IStyledComponentFactory
import typings.styledComponents.distDistTypesMod.IStyledNativeComponentFactory
import typings.styledComponents.distDistTypesMod.Interpolation
import typings.styledComponents.distDistTypesMod.StyledNativeOptions
import typings.styledComponents.distDistTypesMod.StyledOptions
import typings.styledComponents.distDistTypesMod.Styles
import typings.styledComponents.styledComponentsStrings.image
import typings.styledComponents.styledComponentsStrings.native
import typings.styledComponents.styledComponentsStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `683`[OuterProps, Environment /* <: web | native */, // used for styled<{}>().attrs() so attrs() gets the generic prop context
OuterStatics] extends StObject {
  
  def apply[Props, Statics](initialStyles: Styles[OuterProps & Props], interpolations: (Interpolation[OuterProps & Props])*): ReturnType[
    (IStyledNativeComponentFactory[image, OuterProps & Props, OuterStatics & Statics]) | (IStyledComponentFactory[image, OuterProps & Props, OuterStatics & Statics])
  ] = js.native
  
  def attrs(attrs: typings.styledComponents.distDistTypesMod.Attrs[OuterProps]): Any = js.native
  
  /**
    * If config methods are called, wrap up a new template function and merge options */
  @JSName("withConfig")
  def withConfig_web(config: StyledNativeOptions[OuterProps] | StyledOptions[OuterProps]): Any = js.native
}

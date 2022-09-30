package typings.styledComponents.anon

import typings.std.ReturnType
import typings.styledComponents.distTypesMod.IStyledComponentFactory
import typings.styledComponents.distTypesMod.IStyledNativeComponentFactory
import typings.styledComponents.distTypesMod.Interpolation
import typings.styledComponents.distTypesMod.StyledNativeOptions
import typings.styledComponents.distTypesMod.StyledOptions
import typings.styledComponents.distTypesMod.Styles
import typings.styledComponents.styledComponentsStrings.bdi
import typings.styledComponents.styledComponentsStrings.native
import typings.styledComponents.styledComponentsStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2`[OuterProps, Environment /* <: web | native */, // used for styled<{}>().attrs() so attrs() gets the generic prop context
OuterStatics] extends StObject {
  
  def apply[Props, Statics](initialStyles: Styles[OuterProps & Props], interpolations: (Interpolation[OuterProps & Props])*): ReturnType[
    (IStyledNativeComponentFactory[bdi, OuterProps & Props, OuterStatics & Statics]) | (IStyledComponentFactory[bdi, OuterProps & Props, OuterStatics & Statics])
  ] = js.native
  
  def attrs(attrs: typings.styledComponents.distTypesMod.Attrs[OuterProps]): Any = js.native
  
  /**
    * If config methods are called, wrap up a new template function and merge options */
  @JSName("withConfig")
  def withConfig_web(config: StyledNativeOptions[OuterProps] | StyledOptions[OuterProps]): Any = js.native
}

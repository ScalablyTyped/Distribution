package typings.styledComponents.anon

import typings.std.ReturnType
import typings.styledComponents.nativeDistDistTypesMod.Interpolation
import typings.styledComponents.nativeDistDistTypesMod.Styles
import typings.styledComponents.styledComponentsStrings.native
import typings.styledComponents.styledComponentsStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `145`[OuterProps, Environment /* <: web | native */, // used for styled<{}>().attrs() so attrs() gets the generic prop context
OuterStatics] extends StObject {
  
  def apply[Props, Statics](initialStyles: Styles[OuterProps & Props], interpolations: (Interpolation[OuterProps & Props])*): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: Environment extends 'web' ? styled-components.styled-components/native/dist/dist/types.IStyledComponentFactory<'foreignObject', OuterProps & Props, OuterStatics & Statics> : styled-components.styled-components/native/dist/dist/types.IStyledNativeComponentFactory<'foreignObject', OuterProps & Props, OuterStatics & Statics> */ js.Any
  ] = js.native
  
  def attrs(attrs: typings.styledComponents.nativeDistDistTypesMod.Attrs[OuterProps]): Any = js.native
  
  /**
    * If config methods are called, wrap up a new template function and merge options */
  @JSName("withConfig")
  def withConfig_web(
    config: /* import warning: importer.ImportType#apply Failed type conversion: Environment extends 'web' ? styled-components.styled-components/native/dist/dist/types.StyledOptions<OuterProps> : styled-components.styled-components/native/dist/dist/types.StyledNativeOptions<OuterProps> */ js.Any
  ): Any = js.native
}

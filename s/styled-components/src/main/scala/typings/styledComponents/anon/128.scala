package typings.styledComponents.anon

import typings.std.ReturnType
import typings.styledComponents.nativeDistDistTypesMod.Interpolation
import typings.styledComponents.nativeDistDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `128`[OuterProps, Environment /* <: "web" | "native" */, // used for styled<{}>().attrs() so attrs() gets the generic prop context
OuterStatics] extends StObject {
  
  def apply[Props, Statics](initialStyles: Styles[OuterProps & Props], interpolations: (Interpolation[OuterProps & Props])*): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: Environment extends 'web' ? styled-components.styled-components/native/dist/dist/types.IStyledComponentFactory<'feFlood', OuterProps & Props, OuterStatics & Statics> : styled-components.styled-components/native/dist/dist/types.IStyledNativeComponentFactory<'feFlood', OuterProps & Props, OuterStatics & Statics> */ js.Any
  ] = js.native
  
  def attrs(attrs: typings.styledComponents.nativeDistDistTypesMod.Attrs[OuterProps]): Any = js.native
  
  /**
    * If config methods are called, wrap up a new template function and merge options */
  @JSName("withConfig")
  @scala.annotation.targetName("withConfig_web")
  def withConfig(
    config: /* import warning: importer.ImportType#apply Failed type conversion: Environment extends 'web' ? styled-components.styled-components/native/dist/dist/types.StyledOptions<OuterProps> : styled-components.styled-components/native/dist/dist/types.StyledNativeOptions<OuterProps> */ js.Any
  ): Any = js.native
}

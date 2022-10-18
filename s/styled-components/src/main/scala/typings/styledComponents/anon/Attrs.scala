package typings.styledComponents.anon

import typings.styledComponents.nativeDistTypesMod.ExecutionContext
import typings.styledComponents.nativeDistTypesMod.ExtensibleObject
import typings.styledComponents.nativeDistTypesMod.IStyledComponent
import typings.styledComponents.nativeDistTypesMod.Interpolation
import typings.styledComponents.nativeDistTypesMod.StyledOptions
import typings.styledComponents.nativeDistTypesMod.Styles
import typings.styledComponents.nativeDistTypesMod.WebTarget
import typings.styledComponents.styledComponentsStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attrs[Target /* <: WebTarget */] extends StObject {
  
  def apply[Props /* <: js.Object */, Statics](
    initialStyles: Styles[
      (/* import warning: importer.ImportType#apply Failed type conversion: Target extends styled-components.styled-components/native/dist/types.KnownTarget ? react.react.ComponentProps<Target> : unknown */ js.Any) & Props
    ],
    interpolations: (Interpolation[
      ExecutionContext & (/* import warning: importer.ImportType#apply Failed type conversion: Target extends styled-components.styled-components/native/dist/types.KnownTarget ? react.react.ComponentProps<Target> : unknown */ js.Any) & Props
    ])*
  ): (IStyledComponent[
    web, 
    Target, 
    (/* import warning: importer.ImportType#apply Failed type conversion: Target extends styled-components.styled-components/native/dist/types.KnownTarget ? react.react.ComponentProps<Target> : unknown */ js.Any) & Props
  ]) & Statics = js.native
  
  def attrs(
    attrs: typings.styledComponents.nativeDistTypesMod.Attrs[
      ExtensibleObject & (/* import warning: importer.ImportType#apply Failed type conversion: Target extends styled-components.styled-components/native/dist/types.KnownTarget ? react.react.ComponentProps<Target> : unknown */ js.Any)
    ]
  ): Any = js.native
  
  @JSName("withConfig")
  def withConfig_web(
    config: StyledOptions[
      web, 
      /* import warning: importer.ImportType#apply Failed type conversion: Target extends styled-components.styled-components/native/dist/types.KnownTarget ? react.react.ComponentProps<Target> : unknown */ js.Any
    ]
  ): Any = js.native
}

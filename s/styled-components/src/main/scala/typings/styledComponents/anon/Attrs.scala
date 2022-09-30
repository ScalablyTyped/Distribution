package typings.styledComponents.anon

import typings.react.mod.ComponentProps
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
    initialStyles: Styles[(Any | ComponentProps[Target]) & Props],
    interpolations: (Interpolation[ExecutionContext & (Any | ComponentProps[Target]) & Props])*
  ): (IStyledComponent[web, Target, (Any | ComponentProps[Target]) & Props]) & Statics = js.native
  
  def attrs(
    attrs: typings.styledComponents.nativeDistTypesMod.Attrs[ExtensibleObject & (Any | ComponentProps[Target])]
  ): Any = js.native
  
  @JSName("withConfig")
  def withConfig_web(config: StyledOptions[web, Any | ComponentProps[Target]]): Any = js.native
}

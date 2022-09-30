package typings.styledComponents.anon

import typings.react.mod.ComponentProps
import typings.styledComponents.nativeDistTypesMod.ExecutionContext
import typings.styledComponents.nativeDistTypesMod.ExtensibleObject
import typings.styledComponents.nativeDistTypesMod.IStyledComponent
import typings.styledComponents.nativeDistTypesMod.Interpolation
import typings.styledComponents.nativeDistTypesMod.NativeTarget
import typings.styledComponents.nativeDistTypesMod.StyledOptions
import typings.styledComponents.nativeDistTypesMod.Styles
import typings.styledComponents.styledComponentsStrings.native
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `173`[Target /* <: NativeTarget */] extends StObject {
  
  def apply[Props /* <: js.Object */, Statics](
    initialStyles: Styles[(Any | ComponentProps[Target]) & Props],
    interpolations: (Interpolation[ExecutionContext & (Any | ComponentProps[Target]) & Props])*
  ): (IStyledComponent[native, Target, (Any | ComponentProps[Target]) & Props]) & Statics = js.native
  
  def attrs(
    attrs: typings.styledComponents.nativeDistTypesMod.Attrs[ExtensibleObject & (Any | ComponentProps[Target])]
  ): Any = js.native
  
  @JSName("withConfig")
  def withConfig_native(config: StyledOptions[native, Any | ComponentProps[Target]]): Any = js.native
}

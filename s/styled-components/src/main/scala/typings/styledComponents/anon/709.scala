package typings.styledComponents.anon

import typings.styledComponents.primitivesDistTypesMod.IStyledNativeComponent
import typings.styledComponents.primitivesDistTypesMod.Interpolation
import typings.styledComponents.primitivesDistTypesMod.NativeTarget
import typings.styledComponents.primitivesDistTypesMod.StyledNativeOptions
import typings.styledComponents.primitivesDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `709`[Target /* <: NativeTarget */] extends StObject {
  
  def apply[Props, Statics](initialStyles: Styles[Props], interpolations: Interpolation[Props]*): (IStyledNativeComponent[Target, Props]) & Statics = js.native
  
  def attrs(attrs: typings.styledComponents.primitivesDistTypesMod.Attrs[Any]): Any = js.native
  
  def withConfig(config: StyledNativeOptions[Any]): Any = js.native
}

package typings.styledComponents.anon

import typings.styledComponents.distTypesMod.IStyledNativeComponent
import typings.styledComponents.distTypesMod.Interpolation
import typings.styledComponents.distTypesMod.NativeTarget
import typings.styledComponents.distTypesMod.StyledNativeOptions
import typings.styledComponents.distTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `171`[Target /* <: NativeTarget */] extends StObject {
  
  def apply[Props, Statics](initialStyles: Styles[Props], interpolations: Interpolation[Props]*): (IStyledNativeComponent[Target, Props]) & Statics = js.native
  
  def attrs(attrs: typings.styledComponents.distTypesMod.Attrs[Any]): Any = js.native
  
  def withConfig(config: StyledNativeOptions[Any]): Any = js.native
}

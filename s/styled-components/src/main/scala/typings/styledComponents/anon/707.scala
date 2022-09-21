package typings.styledComponents.anon

import typings.styledComponents.distDistTypesMod.IStyledNativeComponent
import typings.styledComponents.distDistTypesMod.Interpolation
import typings.styledComponents.distDistTypesMod.NativeTarget
import typings.styledComponents.distDistTypesMod.StyledNativeOptions
import typings.styledComponents.distDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `707`[Target /* <: NativeTarget */] extends StObject {
  
  def apply[Props, Statics](initialStyles: Styles[Props], interpolations: Interpolation[Props]*): (IStyledNativeComponent[Target, Props]) & Statics = js.native
  
  def attrs(attrs: typings.styledComponents.distDistTypesMod.Attrs[Any]): Any = js.native
  
  def withConfig(config: StyledNativeOptions[Any]): Any = js.native
}

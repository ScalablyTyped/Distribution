package typings.styledComponents.anon

import typings.styledComponents.nativeDistDistTypesMod.IStyledNativeComponent
import typings.styledComponents.nativeDistDistTypesMod.StyledNativeOptions
import typings.styledComponents.nativeDistTypesMod.Interpolation
import typings.styledComponents.nativeDistTypesMod.NativeTarget
import typings.styledComponents.nativeDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `175`[Target /* <: NativeTarget */] extends StObject {
  
  def apply[Props, Statics](initialStyles: Styles[Props], interpolations: Interpolation[Props]*): (IStyledNativeComponent[Target, Props]) & Statics = js.native
  
  def attrs(attrs: typings.styledComponents.nativeDistTypesMod.Attrs[Any]): Any = js.native
  
  def withConfig(config: StyledNativeOptions[Any]): Any = js.native
}

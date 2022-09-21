package typings.styledComponents.anon

import typings.styledComponents.distTypesMod.IStyledComponent
import typings.styledComponents.distTypesMod.Interpolation
import typings.styledComponents.distTypesMod.StyledOptions
import typings.styledComponents.distTypesMod.Styles
import typings.styledComponents.distTypesMod.WebTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `346`[Target /* <: WebTarget */] extends StObject {
  
  def apply[Props, Statics](initialStyles: Styles[Props], interpolations: Interpolation[Props]*): (IStyledComponent[Target, Props]) & Statics = js.native
  
  def attrs(attrs: typings.styledComponents.distTypesMod.Attrs[Any]): Any = js.native
  
  def withConfig(config: StyledOptions[Any]): Any = js.native
}

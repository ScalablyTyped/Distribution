package typings.styledComponents.anon

import typings.styledComponents.distDistTypesMod.IStyledComponent
import typings.styledComponents.distDistTypesMod.Interpolation
import typings.styledComponents.distDistTypesMod.StyledOptions
import typings.styledComponents.distDistTypesMod.Styles
import typings.styledComponents.distDistTypesMod.WebTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `706`[Target /* <: WebTarget */] extends StObject {
  
  def apply[Props, Statics](initialStyles: Styles[Props], interpolations: Interpolation[Props]*): (IStyledComponent[Target, Props]) & Statics = js.native
  
  def attrs(attrs: typings.styledComponents.distDistTypesMod.Attrs[Any]): Any = js.native
  
  def withConfig(config: StyledOptions[Any]): Any = js.native
}

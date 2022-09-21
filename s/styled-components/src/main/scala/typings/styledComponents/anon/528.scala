package typings.styledComponents.anon

import typings.styledComponents.primitivesDistTypesMod.IStyledComponent
import typings.styledComponents.primitivesDistTypesMod.Interpolation
import typings.styledComponents.primitivesDistTypesMod.StyledOptions
import typings.styledComponents.primitivesDistTypesMod.Styles
import typings.styledComponents.primitivesDistTypesMod.WebTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `528`[Target /* <: WebTarget */] extends StObject {
  
  def apply[Props, Statics](initialStyles: Styles[Props], interpolations: Interpolation[Props]*): (IStyledComponent[Target, Props]) & Statics = js.native
  
  def attrs(attrs: typings.styledComponents.primitivesDistTypesMod.Attrs[Any]): Any = js.native
  
  def withConfig(config: StyledOptions[Any]): Any = js.native
}

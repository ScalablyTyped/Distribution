package typings.styledComponents.anon

import typings.styledComponents.nativeDistTypesMod.IStyledComponent
import typings.styledComponents.nativeDistTypesMod.Interpolation
import typings.styledComponents.nativeDistTypesMod.StyledOptions
import typings.styledComponents.nativeDistTypesMod.Styles
import typings.styledComponents.nativeDistTypesMod.WebTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `172`[Target /* <: WebTarget */] extends StObject {
  
  def apply[Props, Statics](initialStyles: Styles[Props], interpolations: Interpolation[Props]*): (IStyledComponent[Target, Props, js.Object]) & Statics = js.native
  
  def attrs(attrs: typings.styledComponents.nativeDistTypesMod.Attrs[Any]): Any = js.native
  
  def withConfig(
    config: StyledOptions[
      Any, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Props */ Any
    ]
  ): Any = js.native
}

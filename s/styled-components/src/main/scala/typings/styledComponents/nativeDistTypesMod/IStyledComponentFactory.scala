package typings.styledComponents.nativeDistTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStyledComponentFactory[Target /* <: WebTarget */, Props, Statics] extends StObject {
  
  def apply(target: Target, options: StyledOptions[Props], rules: RuleSet[Props]): (IStyledComponent[Target, Props]) & Statics = js.native
}

package typings.styledComponents.primitivesDistTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStyledNativeComponentFactory[Target /* <: NativeTarget */, Props, Statics] extends StObject {
  
  def apply(target: Target, options: StyledNativeOptions[Props], rules: RuleSet[Props]): (IStyledNativeComponent[Target, Props]) & Statics = js.native
}

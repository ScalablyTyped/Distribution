package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.wixStyleReact.wixStyleReactInts.`15`
import typings.wixStyleReact.wixStyleReactStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimeInputTimeInputMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/TimeInput/TimeInput", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RefAttributes[Any]] = js.native
  
  @JSImport("wix-style-react/dist/types/TimeInput/TimeInput", "DEFAULT_STEP")
  @js.native
  val DEFAULT_STEP: `15` = js.native
  
  @JSImport("wix-style-react/dist/types/TimeInput/TimeInput", "DEFAULT_TIME_STYLE")
  @js.native
  val DEFAULT_TIME_STYLE: short = js.native
  
  type _To = ForwardRefExoticComponent[RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesTimeInputTimeInputMod.foo` */
  override def _to: ForwardRefExoticComponent[RefAttributes[Any]] = default
}

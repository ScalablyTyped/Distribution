package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.wixStyleReact.distTypesTooltipTooltipDottypesMod.TooltipActions
import typings.wixStyleReact.distTypesTooltipTooltipDottypesMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTooltipTooltipMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/Tooltip/Tooltip", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TooltipProps & RefAttributes[TooltipActions]] = js.native
  
  type _To = ForwardRefExoticComponent[TooltipProps & RefAttributes[TooltipActions]]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesTooltipTooltipMod.foo` */
  override def _to: ForwardRefExoticComponent[TooltipProps & RefAttributes[TooltipActions]] = default
}

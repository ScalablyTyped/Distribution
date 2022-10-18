package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUsaTooltipMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-tooltip", JSImport.Default)
  @js.native
  val default: Tooltip = js.native
  
  @js.native
  trait Tooltip extends StObject {
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    def off(el: HTMLElement): Unit = js.native
    
    def on(el: HTMLElement): Unit = js.native
  }
  
  type _To = Tooltip
  
  /* This means you don't have to write `default`, but can instead just say `jsUsaTooltipMod.foo` */
  override def _to: Tooltip = default
}

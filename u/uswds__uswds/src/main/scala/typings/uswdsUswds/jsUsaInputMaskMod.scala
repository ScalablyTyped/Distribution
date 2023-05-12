package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUsaInputMaskMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-input-mask", JSImport.Default)
  @js.native
  val default: InputMask = js.native
  
  @js.native
  trait InputMask extends StObject {
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    def off(root: Document): Unit = js.native
    def off(root: HTMLElement): Unit = js.native
    
    def on(root: Document): Unit = js.native
    def on(root: HTMLElement): Unit = js.native
  }
  
  type _To = InputMask
  
  /* This means you don't have to write `default`, but can instead just say `jsUsaInputMaskMod.foo` */
  override def _to: InputMask = default
}

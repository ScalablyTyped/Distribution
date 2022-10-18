package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUsaAccordionMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-accordion", JSImport.Default)
  @js.native
  val default: Accordion = js.native
  
  @js.native
  trait Accordion extends StObject {
    
    var ACCORDION: String = js.native
    
    var BUTTON: String = js.native
    
    /**
      * Get an Array of button elements belonging directly to the given
      * accordion element.
      * @param accordion
      * @return buttons
      */
    def getButtons(accordion: HTMLElement): js.Array[HTMLButtonElement] = js.native
    
    def hide(button: HTMLButtonElement): Boolean = js.native
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    def off(el: HTMLElement): Unit = js.native
    
    def on(el: HTMLElement): Unit = js.native
    
    def show(button: HTMLButtonElement): Boolean = js.native
    
    /**
      * Toggle a button's "pressed" state, optionally providing a target
      * state.
      *
      * @param button
      * @param expanded If no state is provided, the current
      * state will be toggled (from false to true, and vice-versa).
      * @return the resulting state
      */
    def toggle(button: HTMLButtonElement): Boolean = js.native
    def toggle(button: HTMLButtonElement, expanded: Boolean): Boolean = js.native
  }
  
  type _To = Accordion
  
  /* This means you don't have to write `default`, but can instead just say `jsUsaAccordionMod.foo` */
  override def _to: Accordion = default
}

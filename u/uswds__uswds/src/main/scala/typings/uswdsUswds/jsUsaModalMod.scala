package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUsaModalMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-modal", JSImport.Default)
  @js.native
  val default: Modal = js.native
  
  @js.native
  trait Modal extends StObject {
    
    var focusTrap: Null = js.native
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    def off(el: HTMLElement): Unit = js.native
    
    def on(el: HTMLElement): Unit = js.native
    
    /**
      *  Toggle the visibility of a modal window
      *
      * @param event the keydown event
      * @returns safeActive if mobile is open
      */
    def toggleModal(event: KeyboardEvent): Boolean = js.native
  }
  
  type _To = Modal
  
  /* This means you don't have to write `default`, but can instead just say `jsUsaModalMod.foo` */
  override def _to: Modal = default
}

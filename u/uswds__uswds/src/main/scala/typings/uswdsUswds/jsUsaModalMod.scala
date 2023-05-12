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
    
    def off(root: Document): Unit = js.native
    def off(root: HTMLElement): Unit = js.native
    
    def on(root: Document): Unit = js.native
    def on(root: HTMLElement): Unit = js.native
    
    def teardown(root: Document): Unit = js.native
    def teardown(root: HTMLElement): Unit = js.native
    
    /**
      *  Toggle the visibility of a modal window
      */
    def toggleModal(event: KeyboardEvent): Boolean = js.native
  }
  
  type _To = Modal
  
  /* This means you don't have to write `default`, but can instead just say `jsUsaModalMod.foo` */
  override def _to: Modal = default
}

package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usaHeaderMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-header", JSImport.Default)
  @js.native
  val default: Navigation = js.native
  
  @js.native
  trait Navigation extends StObject {
    
    var focusTrap: Null = js.native
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    def off(el: HTMLElement): Unit = js.native
    
    def on(el: HTMLElement): Unit = js.native
    
    def teardown(): Unit = js.native
    
    def toggleNav(active: Boolean): Boolean = js.native
  }
  
  type _To = Navigation
  
  /* This means you don't have to write `default`, but can instead just say `usaHeaderMod.foo` */
  override def _to: Navigation = default
}

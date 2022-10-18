package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUsaFooterMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-footer", JSImport.Default)
  @js.native
  val default: Footer = js.native
  
  @js.native
  trait Footer extends StObject {
    
    var HIDE_MAX_WIDTH: Double = js.native
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    def off(el: HTMLElement): Unit = js.native
    
    def on(el: HTMLElement): Unit = js.native
    
    def teardown(): Unit = js.native
  }
  
  type _To = Footer
  
  /* This means you don't have to write `default`, but can instead just say `jsUsaFooterMod.foo` */
  override def _to: Footer = default
}

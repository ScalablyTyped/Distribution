package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUsaSearchMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-search", JSImport.Default)
  @js.native
  val default: Search = js.native
  
  @js.native
  trait Search extends StObject {
    
    def init(target: Document): Unit = js.native
    def init(target: HTMLElement): Unit = js.native
    
    def off(el: HTMLElement): Unit = js.native
    
    def on(el: HTMLElement): Unit = js.native
    
    def teardown(): Unit = js.native
  }
  
  type _To = Search
  
  /* This means you don't have to write `default`, but can instead just say `jsUsaSearchMod.foo` */
  override def _to: Search = default
}

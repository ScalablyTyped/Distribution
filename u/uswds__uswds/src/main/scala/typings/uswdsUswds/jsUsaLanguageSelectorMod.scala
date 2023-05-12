package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUsaLanguageSelectorMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-language-selector", JSImport.Default)
  @js.native
  val default: LanguageSelector = js.native
  
  @js.native
  trait LanguageSelector extends StObject {
    
    var focusTrap: Null = js.native
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    def off(root: Document): Unit = js.native
    def off(root: HTMLElement): Unit = js.native
    
    def on(root: Document): Unit = js.native
    def on(root: HTMLElement): Unit = js.native
    
    def teardown(): Unit = js.native
  }
  
  type _To = LanguageSelector
  
  /* This means you don't have to write `default`, but can instead just say `jsUsaLanguageSelectorMod.foo` */
  override def _to: LanguageSelector = default
}

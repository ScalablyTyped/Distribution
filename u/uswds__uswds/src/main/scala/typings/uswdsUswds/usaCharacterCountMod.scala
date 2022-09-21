package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usaCharacterCountMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-character-count", JSImport.Default)
  @js.native
  val default: CharacterCount = js.native
  
  @js.native
  trait CharacterCount extends StObject {
    
    var MESSAGE_INVALID_CLASS: String = js.native
    
    var VALIDATION_MESSAGE: String = js.native
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    def off(el: HTMLElement): Unit = js.native
    
    def on(el: HTMLElement): Unit = js.native
  }
  
  type _To = CharacterCount
  
  /* This means you don't have to write `default`, but can instead just say `usaCharacterCountMod.foo` */
  override def _to: CharacterCount = default
}

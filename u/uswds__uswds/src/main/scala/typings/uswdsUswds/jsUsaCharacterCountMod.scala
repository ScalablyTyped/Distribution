package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUsaCharacterCountMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-character-count", JSImport.Default)
  @js.native
  val default: CharacterCount = js.native
  
  @js.native
  trait CharacterCount extends StObject {
    
    var DEFAULT_STATUS_LABEL: String = js.native
    
    var MESSAGE_INVALID_CLASS: String = js.native
    
    var STATUS_MESSAGE_CLASS: String = js.native
    
    var STATUS_MESSAGE_SR_ONLY_CLASS: String = js.native
    
    var VALIDATION_MESSAGE: String = js.native
    
    /**
      * Create and append status messages for visual and screen readers
      */
    def createStatusMessages(characterCountEl: HTMLDivElement): Unit = js.native
    
    /**
      * Returns message with how many characters are left
      */
    def getCountMessage(currentLength: Double, maxLength: Double): String = js.native
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    def off(el: HTMLElement): Unit = js.native
    
    def on(el: HTMLElement): Unit = js.native
    
    /**
      * Update the character count component
      */
    def updateCountMessage(inputEl: HTMLInputElement): Unit = js.native
    def updateCountMessage(inputEl: HTMLTextAreaElement): Unit = js.native
  }
  
  type _To = CharacterCount
  
  /* This means you don't have to write `default`, but can instead just say `jsUsaCharacterCountMod.foo` */
  override def _to: CharacterCount = default
}

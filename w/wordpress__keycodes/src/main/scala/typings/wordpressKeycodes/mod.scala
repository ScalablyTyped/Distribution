package typings.wordpressKeycodes

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/keycodes", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ALT: /* "alt" */ String = js.native
  
  val BACKSPACE: /* 8 */ Double = js.native
  
  val COMMAND: /* "meta" */ String = js.native
  
  val CTRL: /* "ctrl" */ String = js.native
  
  val DELETE: /* 46 */ Double = js.native
  
  val DOWN: /* 40 */ Double = js.native
  
  val ENTER: /* 13 */ Double = js.native
  
  val ESCAPE: /* 27 */ Double = js.native
  
  val F10: /* 121 */ Double = js.native
  
  val LEFT: /* 37 */ Double = js.native
  
  val RIGHT: /* 39 */ Double = js.native
  
  val SHIFT: /* "shift" */ String = js.native
  
  val SPACE: /* 32 */ Double = js.native
  
  val TAB: /* 9 */ Double = js.native
  
  val UP: /* 38 */ Double = js.native
  
  @js.native
  object displayShortcut extends js.Object {
    
    def access(character: String): String = js.native
    
    def alt(character: String): String = js.native
    
    def ctrl(character: String): String = js.native
    
    def ctrlShift(character: String): String = js.native
    
    def primary(character: String): String = js.native
    
    def primaryAlt(character: String): String = js.native
    
    def primaryShift(character: String): String = js.native
    
    def secondary(character: String): String = js.native
    
    def shift(character: String): String = js.native
    
    def shiftAlt(character: String): String = js.native
  }
  
  @js.native
  object displayShortcutList extends js.Object {
    
    def access(character: String): js.Array[String] = js.native
    
    def alt(character: String): js.Array[String] = js.native
    
    def ctrl(character: String): js.Array[String] = js.native
    
    def ctrlShift(character: String): js.Array[String] = js.native
    
    def primary(character: String): js.Array[String] = js.native
    
    def primaryAlt(character: String): js.Array[String] = js.native
    
    def primaryShift(character: String): js.Array[String] = js.native
    
    def secondary(character: String): js.Array[String] = js.native
    
    def shift(character: String): js.Array[String] = js.native
    
    def shiftAlt(character: String): js.Array[String] = js.native
  }
  
  @js.native
  object isKeyboardEvent extends js.Object {
    
    def access(event: Event, character: String): Boolean = js.native
    
    def alt(event: Event, character: String): Boolean = js.native
    
    def ctrl(event: Event, character: String): Boolean = js.native
    
    def ctrlShift(event: Event, character: String): Boolean = js.native
    
    def primary(event: Event, character: String): Boolean = js.native
    
    def primaryAlt(event: Event, character: String): Boolean = js.native
    
    def primaryShift(event: Event, character: String): Boolean = js.native
    
    def secondary(event: Event, character: String): Boolean = js.native
    
    def shift(event: Event, character: String): Boolean = js.native
    
    def shiftAlt(event: Event, character: String): Boolean = js.native
  }
  
  @js.native
  object modifiers extends js.Object {
    
    def access(isApple: js.Function0[Boolean]): js.Array[String] = js.native
    
    def alt(): js.Array[String] = js.native
    
    def ctrl(): js.Array[String] = js.native
    
    def ctrlShift(): js.Array[String] = js.native
    
    def primary(isApple: js.Function0[Boolean]): js.Array[String] = js.native
    
    def primaryAlt(isApple: js.Function0[Boolean]): js.Array[String] = js.native
    
    def primaryShift(isApple: js.Function0[Boolean]): js.Array[String] = js.native
    
    def secondary(isApple: js.Function0[Boolean]): js.Array[String] = js.native
    
    def shift(): js.Array[String] = js.native
    
    def shiftAlt(): js.Array[String] = js.native
  }
  
  @js.native
  object rawShortcut extends js.Object {
    
    def access(character: String): String = js.native
    
    def alt(character: String): String = js.native
    
    def ctrl(character: String): String = js.native
    
    def ctrlShift(character: String): String = js.native
    
    def primary(character: String): String = js.native
    
    def primaryAlt(character: String): String = js.native
    
    def primaryShift(character: String): String = js.native
    
    def secondary(character: String): String = js.native
    
    def shift(character: String): String = js.native
    
    def shiftAlt(character: String): String = js.native
  }
  
  @js.native
  object shortcutAriaLabel extends js.Object {
    
    def access(character: String): String = js.native
    
    def alt(character: String): String = js.native
    
    def ctrl(character: String): String = js.native
    
    def ctrlShift(character: String): String = js.native
    
    def primary(character: String): String = js.native
    
    def primaryAlt(character: String): String = js.native
    
    def primaryShift(character: String): String = js.native
    
    def secondary(character: String): String = js.native
    
    def shift(character: String): String = js.native
    
    def shiftAlt(character: String): String = js.native
  }
}

package typings.wordpressKeycodes

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/keycodes", "ALT")
  @js.native
  val ALT: /* "alt" */ String = js.native
  
  @JSImport("@wordpress/keycodes", "BACKSPACE")
  @js.native
  val BACKSPACE: /* 8 */ Double = js.native
  
  @JSImport("@wordpress/keycodes", "COMMAND")
  @js.native
  val COMMAND: /* "meta" */ String = js.native
  
  @JSImport("@wordpress/keycodes", "CTRL")
  @js.native
  val CTRL: /* "ctrl" */ String = js.native
  
  @JSImport("@wordpress/keycodes", "DELETE")
  @js.native
  val DELETE: /* 46 */ Double = js.native
  
  @JSImport("@wordpress/keycodes", "DOWN")
  @js.native
  val DOWN: /* 40 */ Double = js.native
  
  @JSImport("@wordpress/keycodes", "ENTER")
  @js.native
  val ENTER: /* 13 */ Double = js.native
  
  @JSImport("@wordpress/keycodes", "ESCAPE")
  @js.native
  val ESCAPE: /* 27 */ Double = js.native
  
  @JSImport("@wordpress/keycodes", "F10")
  @js.native
  val F10: /* 121 */ Double = js.native
  
  @JSImport("@wordpress/keycodes", "LEFT")
  @js.native
  val LEFT: /* 37 */ Double = js.native
  
  @JSImport("@wordpress/keycodes", "RIGHT")
  @js.native
  val RIGHT: /* 39 */ Double = js.native
  
  @JSImport("@wordpress/keycodes", "SHIFT")
  @js.native
  val SHIFT: /* "shift" */ String = js.native
  
  @JSImport("@wordpress/keycodes", "SPACE")
  @js.native
  val SPACE: /* 32 */ Double = js.native
  
  @JSImport("@wordpress/keycodes", "TAB")
  @js.native
  val TAB: /* 9 */ Double = js.native
  
  @JSImport("@wordpress/keycodes", "UP")
  @js.native
  val UP: /* 38 */ Double = js.native
  
  object displayShortcut {
    
    @JSImport("@wordpress/keycodes", "displayShortcut")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def access(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("access")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def alt(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def ctrl(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ctrl")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def ctrlShift(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ctrlShift")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def primary(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("primary")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def primaryAlt(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("primaryAlt")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def primaryShift(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("primaryShift")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def secondary(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("secondary")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def shift(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def shiftAlt(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shiftAlt")(character.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object displayShortcutList {
    
    @JSImport("@wordpress/keycodes", "displayShortcutList")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def access(character: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("access")(character.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @scala.inline
    def alt(character: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(character.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @scala.inline
    def ctrl(character: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("ctrl")(character.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @scala.inline
    def ctrlShift(character: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("ctrlShift")(character.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @scala.inline
    def primary(character: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("primary")(character.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @scala.inline
    def primaryAlt(character: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("primaryAlt")(character.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @scala.inline
    def primaryShift(character: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("primaryShift")(character.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @scala.inline
    def secondary(character: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("secondary")(character.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @scala.inline
    def shift(character: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(character.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @scala.inline
    def shiftAlt(character: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shiftAlt")(character.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  object isKeyboardEvent {
    
    @JSImport("@wordpress/keycodes", "isKeyboardEvent")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def access(event: Event, character: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(event.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def alt(event: Event, character: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("alt")(event.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def ctrl(event: Event, character: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ctrl")(event.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def ctrlShift(event: Event, character: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ctrlShift")(event.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def primary(event: Event, character: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("primary")(event.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def primaryAlt(event: Event, character: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("primaryAlt")(event.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def primaryShift(event: Event, character: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("primaryShift")(event.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def secondary(event: Event, character: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("secondary")(event.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def shift(event: Event, character: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shift")(event.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def shiftAlt(event: Event, character: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shiftAlt")(event.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object modifiers {
    
    @JSImport("@wordpress/keycodes", "modifiers")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def access(isApple: js.Function0[Boolean]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("access")(isApple.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @scala.inline
    def alt(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")().asInstanceOf[js.Array[String]]
    
    @scala.inline
    def ctrl(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("ctrl")().asInstanceOf[js.Array[String]]
    
    @scala.inline
    def ctrlShift(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("ctrlShift")().asInstanceOf[js.Array[String]]
    
    @scala.inline
    def primary(isApple: js.Function0[Boolean]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("primary")(isApple.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @scala.inline
    def primaryAlt(isApple: js.Function0[Boolean]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("primaryAlt")(isApple.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @scala.inline
    def primaryShift(isApple: js.Function0[Boolean]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("primaryShift")(isApple.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @scala.inline
    def secondary(isApple: js.Function0[Boolean]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("secondary")(isApple.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @scala.inline
    def shift(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[js.Array[String]]
    
    @scala.inline
    def shiftAlt(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("shiftAlt")().asInstanceOf[js.Array[String]]
  }
  
  object rawShortcut {
    
    @JSImport("@wordpress/keycodes", "rawShortcut")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def access(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("access")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def alt(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def ctrl(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ctrl")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def ctrlShift(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ctrlShift")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def primary(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("primary")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def primaryAlt(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("primaryAlt")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def primaryShift(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("primaryShift")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def secondary(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("secondary")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def shift(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def shiftAlt(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shiftAlt")(character.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object shortcutAriaLabel {
    
    @JSImport("@wordpress/keycodes", "shortcutAriaLabel")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def access(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("access")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def alt(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def ctrl(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ctrl")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def ctrlShift(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ctrlShift")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def primary(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("primary")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def primaryAlt(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("primaryAlt")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def primaryShift(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("primaryShift")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def secondary(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("secondary")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def shift(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(character.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def shiftAlt(character: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shiftAlt")(character.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}

package typings.atWordpressKeycodes

import typings.atWordpressKeycodes.atWordpressKeycodesNumbers.`121`
import typings.atWordpressKeycodes.atWordpressKeycodesNumbers.`13`
import typings.atWordpressKeycodes.atWordpressKeycodesNumbers.`27`
import typings.atWordpressKeycodes.atWordpressKeycodesNumbers.`32`
import typings.atWordpressKeycodes.atWordpressKeycodesNumbers.`37`
import typings.atWordpressKeycodes.atWordpressKeycodesNumbers.`38`
import typings.atWordpressKeycodes.atWordpressKeycodesNumbers.`39`
import typings.atWordpressKeycodes.atWordpressKeycodesNumbers.`40`
import typings.atWordpressKeycodes.atWordpressKeycodesNumbers.`46`
import typings.atWordpressKeycodes.atWordpressKeycodesNumbers.`8`
import typings.atWordpressKeycodes.atWordpressKeycodesNumbers.`9`
import typings.atWordpressKeycodes.atWordpressKeycodesStrings.alt
import typings.atWordpressKeycodes.atWordpressKeycodesStrings.ctrl
import typings.atWordpressKeycodes.atWordpressKeycodesStrings.meta
import typings.atWordpressKeycodes.atWordpressKeycodesStrings.shift
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/keycodes", JSImport.Namespace)
@js.native
object atWordpressKeycodesMod extends js.Object {
  val ALT: alt = js.native
  val BACKSPACE: `8` = js.native
  val COMMAND: meta = js.native
  val CTRL: ctrl = js.native
  val DELETE: `46` = js.native
  val DOWN: `40` = js.native
  val ENTER: `13` = js.native
  val ESCAPE: `27` = js.native
  val F10: `121` = js.native
  val LEFT: `37` = js.native
  val RIGHT: `39` = js.native
  val SHIFT: shift = js.native
  val SPACE: `32` = js.native
  val TAB: `9` = js.native
  val UP: `38` = js.native
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


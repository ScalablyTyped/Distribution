package typings.wordpressKeycodes

import typings.std.Event_
import typings.wordpressKeycodes.wordpressKeycodesNumbers.`121`
import typings.wordpressKeycodes.wordpressKeycodesNumbers.`13`
import typings.wordpressKeycodes.wordpressKeycodesNumbers.`27`
import typings.wordpressKeycodes.wordpressKeycodesNumbers.`32`
import typings.wordpressKeycodes.wordpressKeycodesNumbers.`37`
import typings.wordpressKeycodes.wordpressKeycodesNumbers.`38`
import typings.wordpressKeycodes.wordpressKeycodesNumbers.`39`
import typings.wordpressKeycodes.wordpressKeycodesNumbers.`40`
import typings.wordpressKeycodes.wordpressKeycodesNumbers.`46`
import typings.wordpressKeycodes.wordpressKeycodesNumbers.`8`
import typings.wordpressKeycodes.wordpressKeycodesNumbers.`9`
import typings.wordpressKeycodes.wordpressKeycodesStrings.alt
import typings.wordpressKeycodes.wordpressKeycodesStrings.ctrl
import typings.wordpressKeycodes.wordpressKeycodesStrings.meta
import typings.wordpressKeycodes.wordpressKeycodesStrings.shift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/keycodes", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
    def access(event: Event_, character: String): Boolean = js.native
    def alt(event: Event_, character: String): Boolean = js.native
    def ctrl(event: Event_, character: String): Boolean = js.native
    def ctrlShift(event: Event_, character: String): Boolean = js.native
    def primary(event: Event_, character: String): Boolean = js.native
    def primaryAlt(event: Event_, character: String): Boolean = js.native
    def primaryShift(event: Event_, character: String): Boolean = js.native
    def secondary(event: Event_, character: String): Boolean = js.native
    def shift(event: Event_, character: String): Boolean = js.native
    def shiftAlt(event: Event_, character: String): Boolean = js.native
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


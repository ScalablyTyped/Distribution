package typings
package atWordpressKeycodesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/keycodes", JSImport.Namespace)
@js.native
object atWordpressKeycodesMod extends js.Object {
  val ALT: atWordpressKeycodesLib.atWordpressKeycodesLibStrings.alt = js.native
  val BACKSPACE: atWordpressKeycodesLib.atWordpressKeycodesLibNumbers.`8` = js.native
  val COMMAND: atWordpressKeycodesLib.atWordpressKeycodesLibStrings.meta = js.native
  val CTRL: atWordpressKeycodesLib.atWordpressKeycodesLibStrings.ctrl = js.native
  val DELETE: atWordpressKeycodesLib.atWordpressKeycodesLibNumbers.`46` = js.native
  val DOWN: atWordpressKeycodesLib.atWordpressKeycodesLibNumbers.`40` = js.native
  val ENTER: atWordpressKeycodesLib.atWordpressKeycodesLibNumbers.`13` = js.native
  val ESCAPE: atWordpressKeycodesLib.atWordpressKeycodesLibNumbers.`27` = js.native
  val F10: atWordpressKeycodesLib.atWordpressKeycodesLibNumbers.`121` = js.native
  val LEFT: atWordpressKeycodesLib.atWordpressKeycodesLibNumbers.`37` = js.native
  val RIGHT: atWordpressKeycodesLib.atWordpressKeycodesLibNumbers.`39` = js.native
  val SHIFT: atWordpressKeycodesLib.atWordpressKeycodesLibStrings.shift = js.native
  val SPACE: atWordpressKeycodesLib.atWordpressKeycodesLibNumbers.`32` = js.native
  val TAB: atWordpressKeycodesLib.atWordpressKeycodesLibNumbers.`9` = js.native
  val UP: atWordpressKeycodesLib.atWordpressKeycodesLibNumbers.`38` = js.native
  @js.native
  object displayShortcut extends js.Object {
    def access(character: java.lang.String): java.lang.String = js.native
    def alt(character: java.lang.String): java.lang.String = js.native
    def ctrl(character: java.lang.String): java.lang.String = js.native
    def ctrlShift(character: java.lang.String): java.lang.String = js.native
    def primary(character: java.lang.String): java.lang.String = js.native
    def primaryAlt(character: java.lang.String): java.lang.String = js.native
    def primaryShift(character: java.lang.String): java.lang.String = js.native
    def secondary(character: java.lang.String): java.lang.String = js.native
    def shift(character: java.lang.String): java.lang.String = js.native
    def shiftAlt(character: java.lang.String): java.lang.String = js.native
  }
  
  @js.native
  object displayShortcutList extends js.Object {
    def access(character: java.lang.String): js.Array[java.lang.String] = js.native
    def alt(character: java.lang.String): js.Array[java.lang.String] = js.native
    def ctrl(character: java.lang.String): js.Array[java.lang.String] = js.native
    def ctrlShift(character: java.lang.String): js.Array[java.lang.String] = js.native
    def primary(character: java.lang.String): js.Array[java.lang.String] = js.native
    def primaryAlt(character: java.lang.String): js.Array[java.lang.String] = js.native
    def primaryShift(character: java.lang.String): js.Array[java.lang.String] = js.native
    def secondary(character: java.lang.String): js.Array[java.lang.String] = js.native
    def shift(character: java.lang.String): js.Array[java.lang.String] = js.native
    def shiftAlt(character: java.lang.String): js.Array[java.lang.String] = js.native
  }
  
  @js.native
  object isKeyboardEvent extends js.Object {
    def access(event: stdLib.Event, character: java.lang.String): scala.Boolean = js.native
    def alt(event: stdLib.Event, character: java.lang.String): scala.Boolean = js.native
    def ctrl(event: stdLib.Event, character: java.lang.String): scala.Boolean = js.native
    def ctrlShift(event: stdLib.Event, character: java.lang.String): scala.Boolean = js.native
    def primary(event: stdLib.Event, character: java.lang.String): scala.Boolean = js.native
    def primaryAlt(event: stdLib.Event, character: java.lang.String): scala.Boolean = js.native
    def primaryShift(event: stdLib.Event, character: java.lang.String): scala.Boolean = js.native
    def secondary(event: stdLib.Event, character: java.lang.String): scala.Boolean = js.native
    def shift(event: stdLib.Event, character: java.lang.String): scala.Boolean = js.native
    def shiftAlt(event: stdLib.Event, character: java.lang.String): scala.Boolean = js.native
  }
  
  @js.native
  object modifiers extends js.Object {
    def access(isApple: js.Function0[scala.Boolean]): js.Array[java.lang.String] = js.native
    def alt(): js.Array[java.lang.String] = js.native
    def ctrl(): js.Array[java.lang.String] = js.native
    def ctrlShift(): js.Array[java.lang.String] = js.native
    def primary(isApple: js.Function0[scala.Boolean]): js.Array[java.lang.String] = js.native
    def primaryAlt(isApple: js.Function0[scala.Boolean]): js.Array[java.lang.String] = js.native
    def primaryShift(isApple: js.Function0[scala.Boolean]): js.Array[java.lang.String] = js.native
    def secondary(isApple: js.Function0[scala.Boolean]): js.Array[java.lang.String] = js.native
    def shift(): js.Array[java.lang.String] = js.native
    def shiftAlt(): js.Array[java.lang.String] = js.native
  }
  
  @js.native
  object rawShortcut extends js.Object {
    def access(character: java.lang.String): java.lang.String = js.native
    def alt(character: java.lang.String): java.lang.String = js.native
    def ctrl(character: java.lang.String): java.lang.String = js.native
    def ctrlShift(character: java.lang.String): java.lang.String = js.native
    def primary(character: java.lang.String): java.lang.String = js.native
    def primaryAlt(character: java.lang.String): java.lang.String = js.native
    def primaryShift(character: java.lang.String): java.lang.String = js.native
    def secondary(character: java.lang.String): java.lang.String = js.native
    def shift(character: java.lang.String): java.lang.String = js.native
    def shiftAlt(character: java.lang.String): java.lang.String = js.native
  }
  
  @js.native
  object shortcutAriaLabel extends js.Object {
    def access(character: java.lang.String): java.lang.String = js.native
    def alt(character: java.lang.String): java.lang.String = js.native
    def ctrl(character: java.lang.String): java.lang.String = js.native
    def ctrlShift(character: java.lang.String): java.lang.String = js.native
    def primary(character: java.lang.String): java.lang.String = js.native
    def primaryAlt(character: java.lang.String): java.lang.String = js.native
    def primaryShift(character: java.lang.String): java.lang.String = js.native
    def secondary(character: java.lang.String): java.lang.String = js.native
    def shift(character: java.lang.String): java.lang.String = js.native
    def shiftAlt(character: java.lang.String): java.lang.String = js.native
  }
  
}


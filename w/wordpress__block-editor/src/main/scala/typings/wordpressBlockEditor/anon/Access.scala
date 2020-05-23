package typings.wordpressBlockEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Access extends js.Object {
  def access(character: String): String
  def alt(character: String): String
  def ctrl(character: String): String
  def ctrlShift(character: String): String
  def primary(character: String): String
  def primaryAlt(character: String): String
  def primaryShift(character: String): String
  def secondary(character: String): String
  def shift(character: String): String
  def shiftAlt(character: String): String
}

object Access {
  @scala.inline
  def apply(
    access: String => String,
    alt: String => String,
    ctrl: String => String,
    ctrlShift: String => String,
    primary: String => String,
    primaryAlt: String => String,
    primaryShift: String => String,
    secondary: String => String,
    shift: String => String,
    shiftAlt: String => String
  ): Access = {
    val __obj = js.Dynamic.literal(access = js.Any.fromFunction1(access), alt = js.Any.fromFunction1(alt), ctrl = js.Any.fromFunction1(ctrl), ctrlShift = js.Any.fromFunction1(ctrlShift), primary = js.Any.fromFunction1(primary), primaryAlt = js.Any.fromFunction1(primaryAlt), primaryShift = js.Any.fromFunction1(primaryShift), secondary = js.Any.fromFunction1(secondary), shift = js.Any.fromFunction1(shift), shiftAlt = js.Any.fromFunction1(shiftAlt))
    __obj.asInstanceOf[Access]
  }
}


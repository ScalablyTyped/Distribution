package typings.wordpressBlockEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Access extends js.Object {
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
  @scala.inline
  implicit class AccessOps[Self <: Access] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccess(value: String => String): Self = this.set("access", js.Any.fromFunction1(value))
    @scala.inline
    def setAlt(value: String => String): Self = this.set("alt", js.Any.fromFunction1(value))
    @scala.inline
    def setCtrl(value: String => String): Self = this.set("ctrl", js.Any.fromFunction1(value))
    @scala.inline
    def setCtrlShift(value: String => String): Self = this.set("ctrlShift", js.Any.fromFunction1(value))
    @scala.inline
    def setPrimary(value: String => String): Self = this.set("primary", js.Any.fromFunction1(value))
    @scala.inline
    def setPrimaryAlt(value: String => String): Self = this.set("primaryAlt", js.Any.fromFunction1(value))
    @scala.inline
    def setPrimaryShift(value: String => String): Self = this.set("primaryShift", js.Any.fromFunction1(value))
    @scala.inline
    def setSecondary(value: String => String): Self = this.set("secondary", js.Any.fromFunction1(value))
    @scala.inline
    def setShift(value: String => String): Self = this.set("shift", js.Any.fromFunction1(value))
    @scala.inline
    def setShiftAlt(value: String => String): Self = this.set("shiftAlt", js.Any.fromFunction1(value))
  }
  
}


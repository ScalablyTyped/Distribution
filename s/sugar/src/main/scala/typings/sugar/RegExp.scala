package typings.sugar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExp extends js.Object {
  def addFlags(flags: java.lang.String): RegExp = js.native
  def getFlags(): java.lang.String = js.native
  def removeFlags(flags: java.lang.String): RegExp = js.native
  def setFlags(flags: java.lang.String): RegExp = js.native
}

object RegExp {
  @scala.inline
  def apply(
    addFlags: java.lang.String => RegExp,
    getFlags: () => java.lang.String,
    removeFlags: java.lang.String => RegExp,
    setFlags: java.lang.String => RegExp
  ): RegExp = {
    val __obj = js.Dynamic.literal(addFlags = js.Any.fromFunction1(addFlags), getFlags = js.Any.fromFunction0(getFlags), removeFlags = js.Any.fromFunction1(removeFlags), setFlags = js.Any.fromFunction1(setFlags))
    __obj.asInstanceOf[RegExp]
  }
  @scala.inline
  implicit class RegExpOps[Self <: RegExp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddFlags(value: java.lang.String => RegExp): Self = this.set("addFlags", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFlags(value: () => java.lang.String): Self = this.set("getFlags", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveFlags(value: java.lang.String => RegExp): Self = this.set("removeFlags", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFlags(value: java.lang.String => RegExp): Self = this.set("setFlags", js.Any.fromFunction1(value))
  }
  
}


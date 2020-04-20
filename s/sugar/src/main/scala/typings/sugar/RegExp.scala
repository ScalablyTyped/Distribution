package typings.sugar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExp extends js.Object {
  def addFlags(flags: java.lang.String): RegExp
  def getFlags(): java.lang.String
  def removeFlags(flags: java.lang.String): RegExp
  def setFlags(flags: java.lang.String): RegExp
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
}


package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberName extends js.Object {
  var prefix: String = js.native
  var suffix: String = js.native
  def isArray(): Boolean = js.native
  def isMarker(): Boolean = js.native
  def isString(): Boolean = js.native
}

object MemberName {
  @scala.inline
  def apply(
    isArray: () => Boolean,
    isMarker: () => Boolean,
    isString: () => Boolean,
    prefix: String,
    suffix: String
  ): MemberName = {
    val __obj = js.Dynamic.literal(isArray = js.Any.fromFunction0(isArray), isMarker = js.Any.fromFunction0(isMarker), isString = js.Any.fromFunction0(isString), prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberName]
  }
  @scala.inline
  implicit class MemberNameOps[Self <: MemberName] (val x: Self) extends AnyVal {
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
    def setIsArray(value: () => Boolean): Self = this.set("isArray", js.Any.fromFunction0(value))
    @scala.inline
    def setIsMarker(value: () => Boolean): Self = this.set("isMarker", js.Any.fromFunction0(value))
    @scala.inline
    def setIsString(value: () => Boolean): Self = this.set("isString", js.Any.fromFunction0(value))
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
  }
  
}


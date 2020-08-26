package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberNameString extends MemberName {
  var text: String = js.native
}

object MemberNameString {
  @scala.inline
  def apply(
    isArray: () => Boolean,
    isMarker: () => Boolean,
    isString: () => Boolean,
    prefix: String,
    suffix: String,
    text: String
  ): MemberNameString = {
    val __obj = js.Dynamic.literal(isArray = js.Any.fromFunction0(isArray), isMarker = js.Any.fromFunction0(isMarker), isString = js.Any.fromFunction0(isString), prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberNameString]
  }
  @scala.inline
  implicit class MemberNameStringOps[Self <: MemberNameString] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}


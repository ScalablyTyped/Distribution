package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberNameArray extends MemberName {
  var delim: String = js.native
  var entries: js.Array[MemberName] = js.native
  def add(entry: MemberName): Unit = js.native
  def addAll(entries: js.Array[MemberName]): Unit = js.native
}

object MemberNameArray {
  @scala.inline
  def apply(
    add: MemberName => Unit,
    addAll: js.Array[MemberName] => Unit,
    delim: String,
    entries: js.Array[MemberName],
    isArray: () => Boolean,
    isMarker: () => Boolean,
    isString: () => Boolean,
    prefix: String,
    suffix: String
  ): MemberNameArray = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAll = js.Any.fromFunction1(addAll), delim = delim.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], isArray = js.Any.fromFunction0(isArray), isMarker = js.Any.fromFunction0(isMarker), isString = js.Any.fromFunction0(isString), prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberNameArray]
  }
  @scala.inline
  implicit class MemberNameArrayOps[Self <: MemberNameArray] (val x: Self) extends AnyVal {
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
    def setAdd(value: MemberName => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setAddAll(value: js.Array[MemberName] => Unit): Self = this.set("addAll", js.Any.fromFunction1(value))
    @scala.inline
    def setDelim(value: String): Self = this.set("delim", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntriesVarargs(value: MemberName*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[MemberName]): Self = this.set("entries", value.asInstanceOf[js.Any])
  }
  
}


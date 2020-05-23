package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberNameArray extends MemberName {
  var delim: String
  var entries: js.Array[MemberName]
  def add(entry: MemberName): Unit
  def addAll(entries: js.Array[MemberName]): Unit
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
}


package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberName extends js.Object {
  var prefix: String
  var suffix: String
  def isArray(): Boolean
  def isMarker(): Boolean
  def isString(): Boolean
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
}


package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Value names for recursive matching parts.
  */
trait MatchRecursiveValueNames extends js.Object {
  /**
    * Name for the unmatched portion of string leading up to `left` delimiter.
    */
  var `0`: String | Null
  /**
    * Name for the `left` delimiter.
    */
  var `1`: String | Null
  /**
    * Name for the portion of the string inside the `left` and `right` delimiters.
    */
  var `2`: String | Null
  /**
    * Name for the `right` delimiter.
    */
  var `3`: String | Null
}

object MatchRecursiveValueNames {
  @scala.inline
  def apply(`0`: String = null, `1`: String = null, `2`: String = null, `3`: String = null): MatchRecursiveValueNames = {
    val __obj = js.Dynamic.literal()
    if (`0` != null) __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    if (`2` != null) __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    if (`3` != null) __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchRecursiveValueNames]
  }
}


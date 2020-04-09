package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for when doing recursive matching.
  */
trait MatchRecursiveOptions extends js.Object {
  /**
    * The escape character to use.
    *
    * **Must be exactly one character long.**
    */
  var escapeChar: js.UndefOr[String | Null] = js.undefined
  /**
    * The value names to associate with the matches.
    *
    * Specifying a value here will cause the `XRegExp.matchRecursive` method to
    * return and array of `XRegExp.MatchRecursiveValueNameMatch`
    */
  var valueNames: js.UndefOr[MatchRecursiveValueNames | Null] = js.undefined
}

object MatchRecursiveOptions {
  @scala.inline
  def apply(escapeChar: String = null, valueNames: MatchRecursiveValueNames = null): MatchRecursiveOptions = {
    val __obj = js.Dynamic.literal()
    if (escapeChar != null) __obj.updateDynamic("escapeChar")(escapeChar.asInstanceOf[js.Any])
    if (valueNames != null) __obj.updateDynamic("valueNames")(valueNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchRecursiveOptions]
  }
}


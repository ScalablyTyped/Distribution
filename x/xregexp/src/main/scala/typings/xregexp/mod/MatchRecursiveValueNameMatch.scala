package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A match to a defined value name during a recursive match.
  */
trait MatchRecursiveValueNameMatch extends js.Object {
  /**
    * The end index of the string portion.
    */
  var end: Double
  /**
    * The value name as specified in the `XRegExp.MatchRecursiveOptions`
    */
  var name: String
  /**
    * The start index of the string portion.
    */
  var start: Double
  /**
    * The portion of the string that corresponds to the value name,
    */
  var value: String
}

object MatchRecursiveValueNameMatch {
  @scala.inline
  def apply(end: Double, name: String, start: Double, value: String): MatchRecursiveValueNameMatch = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchRecursiveValueNameMatch]
  }
}


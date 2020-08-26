package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A match to a defined value name during a recursive match.
  */
@js.native
trait MatchRecursiveValueNameMatch extends js.Object {
  /**
    * The end index of the string portion.
    */
  var end: Double = js.native
  /**
    * The value name as specified in the `XRegExp.MatchRecursiveOptions`
    */
  var name: String = js.native
  /**
    * The start index of the string portion.
    */
  var start: Double = js.native
  /**
    * The portion of the string that corresponds to the value name,
    */
  var value: String = js.native
}

object MatchRecursiveValueNameMatch {
  @scala.inline
  def apply(end: Double, name: String, start: Double, value: String): MatchRecursiveValueNameMatch = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchRecursiveValueNameMatch]
  }
  @scala.inline
  implicit class MatchRecursiveValueNameMatchOps[Self <: MatchRecursiveValueNameMatch] (val x: Self) extends AnyVal {
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}


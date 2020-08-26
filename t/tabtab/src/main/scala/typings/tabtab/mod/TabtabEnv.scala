package typings.tabtab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabtabEnv extends js.Object {
  /**
    * A Boolean indicating whether we act in "plumbing mode" or not
    */
  var complete: Boolean = js.native
  /**
    * The last String word of the line
    */
  var last: String = js.native
  /**
    * The last word String of partial
    */
  var lastPartial: String = js.native
  /**
    * The String input line
    */
  var line: String = js.native
  /**
    * The String part of line preceding cursor position
    */
  var partial: String = js.native
  /**
    * A Number indicating cursor position
    */
  var point: Double = js.native
  /**
    * The String word preceding last
    */
  var prev: String = js.native
  /**
    * The Number of words in the completed line
    */
  var words: Double = js.native
}

object TabtabEnv {
  @scala.inline
  def apply(
    complete: Boolean,
    last: String,
    lastPartial: String,
    line: String,
    partial: String,
    point: Double,
    prev: String,
    words: Double
  ): TabtabEnv = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], lastPartial = lastPartial.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabtabEnv]
  }
  @scala.inline
  implicit class TabtabEnvOps[Self <: TabtabEnv] (val x: Self) extends AnyVal {
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
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast(value: String): Self = this.set("last", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastPartial(value: String): Self = this.set("lastPartial", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartial(value: String): Self = this.set("partial", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoint(value: Double): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrev(value: String): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def setWords(value: Double): Self = this.set("words", value.asInstanceOf[js.Any])
  }
  
}


package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
@js.native
trait Location extends js.Object {
  /** The element's `begin` index. */
  var begin: Double = js.native
  /** The element's `end` index. */
  var end: Double = js.native
}

object Location {
  @scala.inline
  def apply(begin: Double, end: Double): Location = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
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
    def setBegin(value: Double): Self = this.set("begin", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
  }
  
}


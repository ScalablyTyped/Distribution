package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overloads extends js.Object {
  var overloads: Type = js.native
  var privacies: Enum = js.native
  var tags: Properties = js.native
}

object Overloads {
  @scala.inline
  def apply(overloads: Type, privacies: Enum, tags: Properties): Overloads = {
    val __obj = js.Dynamic.literal(overloads = overloads.asInstanceOf[js.Any], privacies = privacies.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overloads]
  }
  @scala.inline
  implicit class OverloadsOps[Self <: Overloads] (val x: Self) extends AnyVal {
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
    def setOverloads(value: Type): Self = this.set("overloads", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivacies(value: Enum): Self = this.set("privacies", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Properties): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}


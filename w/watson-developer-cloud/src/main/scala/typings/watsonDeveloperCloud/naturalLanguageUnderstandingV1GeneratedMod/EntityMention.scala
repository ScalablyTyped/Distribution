package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** EntityMention. */
@js.native
trait EntityMention extends js.Object {
  /** Character offsets indicating the beginning and end of the mention in the analyzed text. */
  var location: js.UndefOr[js.Array[Double]] = js.native
  /** Entity mention text. */
  var text: js.UndefOr[String] = js.native
}

object EntityMention {
  @scala.inline
  def apply(): EntityMention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityMention]
  }
  @scala.inline
  implicit class EntityMentionOps[Self <: EntityMention] (val x: Self) extends AnyVal {
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
    def setLocationVarargs(value: Double*): Self = this.set("location", js.Array(value :_*))
    @scala.inline
    def setLocation(value: js.Array[Double]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}


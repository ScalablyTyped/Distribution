package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The relations between entities found in the content. */
@js.native
trait RelationsResult extends js.Object {
  /** Entity mentions that are involved in the relation. */
  var arguments: js.UndefOr[js.Array[RelationArgument]] = js.native
  /** Confidence score for the relation. Higher values indicate greater confidence. */
  var score: js.UndefOr[Double] = js.native
  /** The sentence that contains the relation. */
  var sentence: js.UndefOr[String] = js.native
  /** The type of the relation. */
  var `type`: js.UndefOr[String] = js.native
}

object RelationsResult {
  @scala.inline
  def apply(): RelationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationsResult]
  }
  @scala.inline
  implicit class RelationsResultOps[Self <: RelationsResult] (val x: Self) extends AnyVal {
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
    def setArgumentsVarargs(value: RelationArgument*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[RelationArgument]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    @scala.inline
    def setSentence(value: String): Self = this.set("sentence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentence: Self = this.set("sentence", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


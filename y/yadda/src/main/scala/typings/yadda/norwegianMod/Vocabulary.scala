package typings.yadda.norwegianMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vocabulary
  extends typings.yadda.englishMod.Vocabulary {
  var gitt: String = js.native
  var når: String = js.native
  var så: String = js.native
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[String],
    background: String,
    examples: String,
    feature: String,
    gitt: String,
    given: String,
    når: String,
    only: String,
    pending: String,
    scenario: String,
    så: String,
    `then`: String,
    when: String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], gitt = gitt.asInstanceOf[js.Any], given = given.asInstanceOf[js.Any], når = når.asInstanceOf[js.Any], only = only.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], så = så.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vocabulary]
  }
  @scala.inline
  implicit class VocabularyOps[Self <: Vocabulary] (val x: Self) extends AnyVal {
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
    def setGitt(value: String): Self = this.set("gitt", value.asInstanceOf[js.Any])
    @scala.inline
    def setNår(value: String): Self = this.set("n\u00E5r", value.asInstanceOf[js.Any])
    @scala.inline
    def setSå(value: String): Self = this.set("s\u00E5", value.asInstanceOf[js.Any])
  }
  
}


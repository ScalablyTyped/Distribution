package typings.yadda.polishMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vocabulary
  extends typings.yadda.englishMod.Vocabulary {
  var gdy: String = js.native
  var jesli: String = js.native
  var jezeli: String = js.native
  var kiedy: String = js.native
  var majac: String = js.native
  var wtedy: String = js.native
  var zakladajac: String = js.native
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[String],
    background: String,
    examples: String,
    feature: String,
    gdy: String,
    given: String,
    jesli: String,
    jezeli: String,
    kiedy: String,
    majac: String,
    only: String,
    pending: String,
    scenario: String,
    `then`: String,
    when: String,
    wtedy: String,
    zakladajac: String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], gdy = gdy.asInstanceOf[js.Any], given = given.asInstanceOf[js.Any], jesli = jesli.asInstanceOf[js.Any], jezeli = jezeli.asInstanceOf[js.Any], kiedy = kiedy.asInstanceOf[js.Any], majac = majac.asInstanceOf[js.Any], only = only.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any], wtedy = wtedy.asInstanceOf[js.Any], zakladajac = zakladajac.asInstanceOf[js.Any])
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
    def setGdy(value: String): Self = this.set("gdy", value.asInstanceOf[js.Any])
    @scala.inline
    def setJesli(value: String): Self = this.set("jesli", value.asInstanceOf[js.Any])
    @scala.inline
    def setJezeli(value: String): Self = this.set("jezeli", value.asInstanceOf[js.Any])
    @scala.inline
    def setKiedy(value: String): Self = this.set("kiedy", value.asInstanceOf[js.Any])
    @scala.inline
    def setMajac(value: String): Self = this.set("majac", value.asInstanceOf[js.Any])
    @scala.inline
    def setWtedy(value: String): Self = this.set("wtedy", value.asInstanceOf[js.Any])
    @scala.inline
    def setZakladajac(value: String): Self = this.set("zakladajac", value.asInstanceOf[js.Any])
  }
  
}


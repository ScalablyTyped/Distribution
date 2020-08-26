package typings.vexdb.responseObjectsMod

import typings.vexdb.requestObjectsMod.Programs
import typings.vexdb.requestObjectsMod.SkillsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkillsResponseObject extends ResponseObject {
  var attempts: Double = js.native
  var program: Programs = js.native
  var rank: Double = js.native
  var score: Double = js.native
  var sku: String = js.native
  var team: String = js.native
  var `type`: SkillsType = js.native
}

object SkillsResponseObject {
  @scala.inline
  def apply(
    attempts: Double,
    program: Programs,
    rank: Double,
    score: Double,
    sku: String,
    team: String,
    `type`: SkillsType
  ): SkillsResponseObject = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkillsResponseObject]
  }
  @scala.inline
  implicit class SkillsResponseObjectOps[Self <: SkillsResponseObject] (val x: Self) extends AnyVal {
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
    def setAttempts(value: Double): Self = this.set("attempts", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgram(value: Programs): Self = this.set("program", value.asInstanceOf[js.Any])
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def setSku(value: String): Self = this.set("sku", value.asInstanceOf[js.Any])
    @scala.inline
    def setTeam(value: String): Self = this.set("team", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: SkillsType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


package typings.vexdb.outConstantsResponseObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkillsResponseObject extends ResponseObject {
  var attempts: Double
  var program: String
  var rank: Double
  var score: Double
  var sku: String
  var team: String
  var `type`: Double
}

object SkillsResponseObject {
  @scala.inline
  def apply(
    attempts: Double,
    program: String,
    rank: Double,
    score: Double,
    sku: String,
    team: String,
    `type`: Double
  ): SkillsResponseObject = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkillsResponseObject]
  }
}


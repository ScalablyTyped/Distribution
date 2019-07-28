package typings.vexdb.vexdbMod

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
    val __obj = js.Dynamic.literal(attempts = attempts, program = program, rank = rank, score = score, sku = sku, team = team)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SkillsResponseObject]
  }
}


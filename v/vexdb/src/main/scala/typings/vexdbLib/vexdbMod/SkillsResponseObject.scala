package typings
package vexdbLib.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkillsResponseObject extends ResponseObject {
  var attempts: scala.Double
  var program: java.lang.String
  var rank: scala.Double
  var score: scala.Double
  var sku: java.lang.String
  var team: java.lang.String
  var `type`: scala.Double
}

object SkillsResponseObject {
  @scala.inline
  def apply(
    attempts: scala.Double,
    program: java.lang.String,
    rank: scala.Double,
    score: scala.Double,
    sku: java.lang.String,
    team: java.lang.String,
    `type`: scala.Double
  ): SkillsResponseObject = {
    val __obj = js.Dynamic.literal(attempts = attempts, program = program, rank = rank, score = score, sku = sku, team = team)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SkillsResponseObject]
  }
}


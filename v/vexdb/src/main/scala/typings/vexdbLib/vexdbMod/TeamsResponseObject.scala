package typings
package vexdbLib.vexdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsResponseObject extends ResponseObject {
  var city: java.lang.String
  var country: java.lang.String
  var grade: java.lang.String
  var is_registered: vexdbLib.vexdbLibNumbers.`0` | vexdbLib.vexdbLibNumbers.`1`
  var number: java.lang.String
  var organisation: java.lang.String
  var program: java.lang.String
  var region: java.lang.String
  var robot_name: java.lang.String
  var team_name: java.lang.String
}

object TeamsResponseObject {
  @scala.inline
  def apply(
    city: java.lang.String,
    country: java.lang.String,
    grade: java.lang.String,
    is_registered: vexdbLib.vexdbLibNumbers.`0` | vexdbLib.vexdbLibNumbers.`1`,
    number: java.lang.String,
    organisation: java.lang.String,
    program: java.lang.String,
    region: java.lang.String,
    robot_name: java.lang.String,
    team_name: java.lang.String
  ): TeamsResponseObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("grade")(grade)
    __obj.updateDynamic("is_registered")(is_registered.asInstanceOf[js.Any])
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("organisation")(organisation)
    __obj.updateDynamic("program")(program)
    __obj.updateDynamic("region")(region)
    __obj.updateDynamic("robot_name")(robot_name)
    __obj.updateDynamic("team_name")(team_name)
    __obj.asInstanceOf[TeamsResponseObject]
  }
}


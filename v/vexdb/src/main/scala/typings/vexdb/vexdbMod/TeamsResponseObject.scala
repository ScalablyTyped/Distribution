package typings.vexdb.vexdbMod

import typings.vexdb.vexdbNumbers.`0`
import typings.vexdb.vexdbNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsResponseObject extends ResponseObject {
  var city: String
  var country: String
  var grade: String
  var is_registered: `0` | `1`
  var number: String
  var organisation: String
  var program: String
  var region: String
  var robot_name: String
  var team_name: String
}

object TeamsResponseObject {
  @scala.inline
  def apply(
    city: String,
    country: String,
    grade: String,
    is_registered: `0` | `1`,
    number: String,
    organisation: String,
    program: String,
    region: String,
    robot_name: String,
    team_name: String
  ): TeamsResponseObject = {
    val __obj = js.Dynamic.literal(city = city, country = country, grade = grade, is_registered = is_registered.asInstanceOf[js.Any], number = number, organisation = organisation, program = program, region = region, robot_name = robot_name, team_name = team_name)
  
    __obj.asInstanceOf[TeamsResponseObject]
  }
}


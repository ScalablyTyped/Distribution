package typings.vexdb.responseObjectsMod

import typings.vexdb.requestObjectsMod.Grades
import typings.vexdb.requestObjectsMod.Programs
import typings.vexdb.vexdbNumbers.`0`
import typings.vexdb.vexdbNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamsResponseObject extends ResponseObject {
  
  var city: String = js.native
  
  var country: String = js.native
  
  var grade: Grades = js.native
  
  var is_registered: `0` | `1` = js.native
  
  var number: String = js.native
  
  var organisation: String = js.native
  
  var program: Programs = js.native
  
  var region: String = js.native
  
  var robot_name: String = js.native
  
  var team_name: String = js.native
}
object TeamsResponseObject {
  
  @scala.inline
  def apply(
    city: String,
    country: String,
    grade: Grades,
    is_registered: `0` | `1`,
    number: String,
    organisation: String,
    program: Programs,
    region: String,
    robot_name: String,
    team_name: String
  ): TeamsResponseObject = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], grade = grade.asInstanceOf[js.Any], is_registered = is_registered.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], organisation = organisation.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], robot_name = robot_name.asInstanceOf[js.Any], team_name = team_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsResponseObject]
  }
  
  @scala.inline
  implicit class TeamsResponseObjectOps[Self <: TeamsResponseObject] (val x: Self) extends AnyVal {
    
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrade(value: Grades): Self = this.set("grade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_registered(value: `0` | `1`): Self = this.set("is_registered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganisation(value: String): Self = this.set("organisation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgram(value: Programs): Self = this.set("program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRobot_name(value: String): Self = this.set("robot_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam_name(value: String): Self = this.set("team_name", value.asInstanceOf[js.Any])
  }
}

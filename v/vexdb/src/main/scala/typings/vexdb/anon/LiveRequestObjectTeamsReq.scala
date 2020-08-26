package typings.vexdb.anon

import typings.vexdb.requestObjectsMod.Filter
import typings.vexdb.requestObjectsMod.Grades
import typings.vexdb.requestObjectsMod.Programs
import typings.vexdb.responseObjectsMod.TeamsResponseObject
import typings.vexdb.vexdbNumbers.`0`
import typings.vexdb.vexdbNumbers.`1`
import typings.vexdb.vexdbStrings.city
import typings.vexdb.vexdbStrings.country
import typings.vexdb.vexdbStrings.number
import typings.vexdb.vexdbStrings.organisation
import typings.vexdb.vexdbStrings.program
import typings.vexdb.vexdbStrings.region
import typings.vexdb.vexdbStrings.robot_name
import typings.vexdb.vexdbStrings.team_name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vexdb.vexdb/out/methods/live.LiveRequestObject<vexdb.vexdb/out/constants/RequestObjects.TeamsRequestObject> */
@js.native
trait LiveRequestObjectTeamsReq extends js.Object {
  var city: js.UndefOr[Filter[TeamsResponseObject, typings.vexdb.vexdbStrings.city, String]] = js.native
  var country: js.UndefOr[Filter[TeamsResponseObject, typings.vexdb.vexdbStrings.country, String]] = js.native
  var grade: js.UndefOr[Filter[TeamsResponseObject, country, Grades]] = js.native
  var is_registered: js.UndefOr[`0` | `1`] = js.native
  var limit_number: js.UndefOr[Double] = js.native
  var limit_start: js.UndefOr[Double] = js.native
  var number: js.UndefOr[Filter[TeamsResponseObject, typings.vexdb.vexdbStrings.number, String]] = js.native
  var organisation: js.UndefOr[Filter[TeamsResponseObject, typings.vexdb.vexdbStrings.organisation, String]] = js.native
  var prefetch: js.UndefOr[Boolean] = js.native
  var program: js.UndefOr[Filter[TeamsResponseObject, typings.vexdb.vexdbStrings.program, Programs]] = js.native
  var region: js.UndefOr[Filter[TeamsResponseObject, typings.vexdb.vexdbStrings.region, String]] = js.native
  var robot_name: js.UndefOr[Filter[TeamsResponseObject, typings.vexdb.vexdbStrings.robot_name, String]] = js.native
  var sku: js.UndefOr[String] = js.native
  var team: js.UndefOr[String] = js.native
  var team_name: js.UndefOr[Filter[TeamsResponseObject, typings.vexdb.vexdbStrings.team_name, String]] = js.native
}

object LiveRequestObjectTeamsReq {
  @scala.inline
  def apply(): LiveRequestObjectTeamsReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveRequestObjectTeamsReq]
  }
  @scala.inline
  implicit class LiveRequestObjectTeamsReqOps[Self <: LiveRequestObjectTeamsReq] (val x: Self) extends AnyVal {
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
    def setCityFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("city", js.Any.fromFunction2(value))
    @scala.inline
    def setCity(value: Filter[TeamsResponseObject, city, String]): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    @scala.inline
    def setCountryFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("country", js.Any.fromFunction2(value))
    @scala.inline
    def setCountry(value: Filter[TeamsResponseObject, country, String]): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setGradeFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("grade", js.Any.fromFunction2(value))
    @scala.inline
    def setGrade(value: Filter[TeamsResponseObject, country, Grades]): Self = this.set("grade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrade: Self = this.set("grade", js.undefined)
    @scala.inline
    def setIs_registered(value: `0` | `1`): Self = this.set("is_registered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs_registered: Self = this.set("is_registered", js.undefined)
    @scala.inline
    def setLimit_number(value: Double): Self = this.set("limit_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit_number: Self = this.set("limit_number", js.undefined)
    @scala.inline
    def setLimit_start(value: Double): Self = this.set("limit_start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit_start: Self = this.set("limit_start", js.undefined)
    @scala.inline
    def setNumberFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("number", js.Any.fromFunction2(value))
    @scala.inline
    def setNumber(value: Filter[TeamsResponseObject, number, String]): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setOrganisationFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("organisation", js.Any.fromFunction2(value))
    @scala.inline
    def setOrganisation(value: Filter[TeamsResponseObject, organisation, String]): Self = this.set("organisation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganisation: Self = this.set("organisation", js.undefined)
    @scala.inline
    def setPrefetch(value: Boolean): Self = this.set("prefetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefetch: Self = this.set("prefetch", js.undefined)
    @scala.inline
    def setProgramFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("program", js.Any.fromFunction2(value))
    @scala.inline
    def setProgram(value: Filter[TeamsResponseObject, program, Programs]): Self = this.set("program", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgram: Self = this.set("program", js.undefined)
    @scala.inline
    def setRegionFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("region", js.Any.fromFunction2(value))
    @scala.inline
    def setRegion(value: Filter[TeamsResponseObject, region, String]): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setRobot_nameFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("robot_name", js.Any.fromFunction2(value))
    @scala.inline
    def setRobot_name(value: Filter[TeamsResponseObject, robot_name, String]): Self = this.set("robot_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRobot_name: Self = this.set("robot_name", js.undefined)
    @scala.inline
    def setSku(value: String): Self = this.set("sku", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSku: Self = this.set("sku", js.undefined)
    @scala.inline
    def setTeam(value: String): Self = this.set("team", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeam: Self = this.set("team", js.undefined)
    @scala.inline
    def setTeam_nameFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, TeamsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("team_name", js.Any.fromFunction2(value))
    @scala.inline
    def setTeam_name(value: Filter[TeamsResponseObject, team_name, String]): Self = this.set("team_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeam_name: Self = this.set("team_name", js.undefined)
  }
  
}


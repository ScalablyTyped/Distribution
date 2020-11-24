package typings.vexdb.requestObjectsMod

import typings.vexdb.responseObjectsMod.SkillsResponseObject
import typings.vexdb.vexdbStrings.`type`
import typings.vexdb.vexdbStrings.attempts
import typings.vexdb.vexdbStrings.program
import typings.vexdb.vexdbStrings.rank
import typings.vexdb.vexdbStrings.score
import typings.vexdb.vexdbStrings.sku
import typings.vexdb.vexdbStrings.team
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkillsRequestObject extends RequestObject {
  
  var attempts: js.UndefOr[Filter[SkillsResponseObject, typings.vexdb.vexdbStrings.attempts, Double]] = js.native
  
  var limit_number: js.UndefOr[Double] = js.native
  
  var limit_start: js.UndefOr[Double] = js.native
  
  var program: js.UndefOr[Filter[SkillsResponseObject, typings.vexdb.vexdbStrings.program, Programs]] = js.native
  
  var rank: js.UndefOr[Filter[SkillsResponseObject, typings.vexdb.vexdbStrings.rank, Double]] = js.native
  
  var score: js.UndefOr[Filter[SkillsResponseObject, typings.vexdb.vexdbStrings.score, Double]] = js.native
  
  var season: js.UndefOr[Seasons] = js.native
  
  var season_rank: js.UndefOr[Double] = js.native
  
  var sku: js.UndefOr[Filter[SkillsResponseObject, typings.vexdb.vexdbStrings.sku, String]] = js.native
  
  var team: js.UndefOr[Filter[SkillsResponseObject, typings.vexdb.vexdbStrings.team, String]] = js.native
  
  var `type`: js.UndefOr[Filter[SkillsResponseObject, typings.vexdb.vexdbStrings.`type`, SkillsType]] = js.native
}
object SkillsRequestObject {
  
  @scala.inline
  def apply(): SkillsRequestObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkillsRequestObject]
  }
  
  @scala.inline
  implicit class SkillsRequestObjectOps[Self <: SkillsRequestObject] (val x: Self) extends AnyVal {
    
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
    def setAttemptsFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SkillsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("attempts", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAttempts(value: Filter[SkillsResponseObject, attempts, Double]): Self = this.set("attempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttempts: Self = this.set("attempts", js.undefined)
    
    @scala.inline
    def setLimit_number(value: Double): Self = this.set("limit_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit_number: Self = this.set("limit_number", js.undefined)
    
    @scala.inline
    def setLimit_start(value: Double): Self = this.set("limit_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit_start: Self = this.set("limit_start", js.undefined)
    
    @scala.inline
    def setProgramFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SkillsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("program", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProgram(value: Filter[SkillsResponseObject, program, Programs]): Self = this.set("program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgram: Self = this.set("program", js.undefined)
    
    @scala.inline
    def setRankFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SkillsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("rank", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRank(value: Filter[SkillsResponseObject, rank, Double]): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
    
    @scala.inline
    def setScoreFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SkillsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("score", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScore(value: Filter[SkillsResponseObject, score, Double]): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    
    @scala.inline
    def setSeason(value: Seasons): Self = this.set("season", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeason: Self = this.set("season", js.undefined)
    
    @scala.inline
    def setSeason_rank(value: Double): Self = this.set("season_rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeason_rank: Self = this.set("season_rank", js.undefined)
    
    @scala.inline
    def setSkuFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SkillsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("sku", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSku(value: Filter[SkillsResponseObject, sku, String]): Self = this.set("sku", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSku: Self = this.set("sku", js.undefined)
    
    @scala.inline
    def setTeamFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SkillsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("team", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTeam(value: Filter[SkillsResponseObject, team, String]): Self = this.set("team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeam: Self = this.set("team", js.undefined)
    
    @scala.inline
    def setTypeFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, SkillsResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("type", js.Any.fromFunction2(value))
    
    @scala.inline
    def setType(value: Filter[SkillsResponseObject, `type`, SkillsType]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

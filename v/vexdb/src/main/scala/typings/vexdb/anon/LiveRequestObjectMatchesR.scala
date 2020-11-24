package typings.vexdb.anon

import typings.vexdb.requestObjectsMod.Filter
import typings.vexdb.requestObjectsMod.Seasons
import typings.vexdb.responseObjectsMod.MatchesResponseObject
import typings.vexdb.vexdbNumbers.`0`
import typings.vexdb.vexdbNumbers.`16`
import typings.vexdb.vexdbNumbers.`1`
import typings.vexdb.vexdbNumbers.`2`
import typings.vexdb.vexdbNumbers.`3`
import typings.vexdb.vexdbNumbers.`4`
import typings.vexdb.vexdbNumbers.`5`
import typings.vexdb.vexdbStrings.blue1
import typings.vexdb.vexdbStrings.blue2
import typings.vexdb.vexdbStrings.blue3
import typings.vexdb.vexdbStrings.bluescore
import typings.vexdb.vexdbStrings.bluesit
import typings.vexdb.vexdbStrings.division
import typings.vexdb.vexdbStrings.field
import typings.vexdb.vexdbStrings.instance
import typings.vexdb.vexdbStrings.matchnum
import typings.vexdb.vexdbStrings.red1
import typings.vexdb.vexdbStrings.red2
import typings.vexdb.vexdbStrings.red3
import typings.vexdb.vexdbStrings.redscore
import typings.vexdb.vexdbStrings.redsit
import typings.vexdb.vexdbStrings.scheduled
import typings.vexdb.vexdbStrings.sku
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vexdb.vexdb/out/methods/live.LiveRequestObject<vexdb.vexdb/out/constants/RequestObjects.MatchesRequestObject> */
@js.native
trait LiveRequestObjectMatchesR extends js.Object {
  
  var blue1: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.blue1, String]] = js.native
  
  var blue2: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.blue2, String]] = js.native
  
  var blue3: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.blue3, String]] = js.native
  
  var bluescore: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.bluescore, Double]] = js.native
  
  var bluesit: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.bluesit, String]] = js.native
  
  var division: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.division, String]] = js.native
  
  var field: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.field, String]] = js.native
  
  var instance: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.instance, Double]] = js.native
  
  var limit_number: js.UndefOr[Double] = js.native
  
  var limit_start: js.UndefOr[Double] = js.native
  
  var matchnum: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.matchnum, Double]] = js.native
  
  var prefetch: js.UndefOr[Boolean] = js.native
  
  var red1: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.red1, String]] = js.native
  
  var red2: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.red2, String]] = js.native
  
  var red3: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.red3, String]] = js.native
  
  var redscore: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.redscore, Double]] = js.native
  
  var redsit: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.redsit, String]] = js.native
  
  var round: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `16`] = js.native
  
  var scheduled: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.scheduled, String]] = js.native
  
  var scored: js.UndefOr[`0` | `1`] = js.native
  
  var season: js.UndefOr[Seasons] = js.native
  
  var sku: js.UndefOr[Filter[MatchesResponseObject, typings.vexdb.vexdbStrings.sku, String]] = js.native
  
  var team: js.UndefOr[String] = js.native
}
object LiveRequestObjectMatchesR {
  
  @scala.inline
  def apply(): LiveRequestObjectMatchesR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveRequestObjectMatchesR]
  }
  
  @scala.inline
  implicit class LiveRequestObjectMatchesROps[Self <: LiveRequestObjectMatchesR] (val x: Self) extends AnyVal {
    
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
    def setBlue1Function2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("blue1", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBlue1(value: Filter[MatchesResponseObject, blue1, String]): Self = this.set("blue1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlue1: Self = this.set("blue1", js.undefined)
    
    @scala.inline
    def setBlue2Function2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("blue2", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBlue2(value: Filter[MatchesResponseObject, blue2, String]): Self = this.set("blue2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlue2: Self = this.set("blue2", js.undefined)
    
    @scala.inline
    def setBlue3Function2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("blue3", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBlue3(value: Filter[MatchesResponseObject, blue3, String]): Self = this.set("blue3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlue3: Self = this.set("blue3", js.undefined)
    
    @scala.inline
    def setBluescoreFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("bluescore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBluescore(value: Filter[MatchesResponseObject, bluescore, Double]): Self = this.set("bluescore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBluescore: Self = this.set("bluescore", js.undefined)
    
    @scala.inline
    def setBluesitFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("bluesit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBluesit(value: Filter[MatchesResponseObject, bluesit, String]): Self = this.set("bluesit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBluesit: Self = this.set("bluesit", js.undefined)
    
    @scala.inline
    def setDivisionFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("division", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDivision(value: Filter[MatchesResponseObject, division, String]): Self = this.set("division", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivision: Self = this.set("division", js.undefined)
    
    @scala.inline
    def setFieldFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("field", js.Any.fromFunction2(value))
    
    @scala.inline
    def setField(value: Filter[MatchesResponseObject, field, String]): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setInstanceFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("instance", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInstance(value: Filter[MatchesResponseObject, instance, Double]): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setLimit_number(value: Double): Self = this.set("limit_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit_number: Self = this.set("limit_number", js.undefined)
    
    @scala.inline
    def setLimit_start(value: Double): Self = this.set("limit_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit_start: Self = this.set("limit_start", js.undefined)
    
    @scala.inline
    def setMatchnumFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("matchnum", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMatchnum(value: Filter[MatchesResponseObject, matchnum, Double]): Self = this.set("matchnum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchnum: Self = this.set("matchnum", js.undefined)
    
    @scala.inline
    def setPrefetch(value: Boolean): Self = this.set("prefetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefetch: Self = this.set("prefetch", js.undefined)
    
    @scala.inline
    def setRed1Function2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("red1", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRed1(value: Filter[MatchesResponseObject, red1, String]): Self = this.set("red1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRed1: Self = this.set("red1", js.undefined)
    
    @scala.inline
    def setRed2Function2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("red2", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRed2(value: Filter[MatchesResponseObject, red2, String]): Self = this.set("red2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRed2: Self = this.set("red2", js.undefined)
    
    @scala.inline
    def setRed3Function2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("red3", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRed3(value: Filter[MatchesResponseObject, red3, String]): Self = this.set("red3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRed3: Self = this.set("red3", js.undefined)
    
    @scala.inline
    def setRedscoreFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("redscore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRedscore(value: Filter[MatchesResponseObject, redscore, Double]): Self = this.set("redscore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedscore: Self = this.set("redscore", js.undefined)
    
    @scala.inline
    def setRedsitFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("redsit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRedsit(value: Filter[MatchesResponseObject, redsit, String]): Self = this.set("redsit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedsit: Self = this.set("redsit", js.undefined)
    
    @scala.inline
    def setRound(value: `1` | `2` | `3` | `4` | `5` | `16`): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    
    @scala.inline
    def setScheduledFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("scheduled", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScheduled(value: Filter[MatchesResponseObject, scheduled, String]): Self = this.set("scheduled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduled: Self = this.set("scheduled", js.undefined)
    
    @scala.inline
    def setScored(value: `0` | `1`): Self = this.set("scored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScored: Self = this.set("scored", js.undefined)
    
    @scala.inline
    def setSeason(value: Seasons): Self = this.set("season", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeason: Self = this.set("season", js.undefined)
    
    @scala.inline
    def setSkuFunction2(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, MatchesResponseObject) => js.Promise[Boolean] | Boolean
    ): Self = this.set("sku", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSku(value: Filter[MatchesResponseObject, sku, String]): Self = this.set("sku", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSku: Self = this.set("sku", js.undefined)
    
    @scala.inline
    def setTeam(value: String): Self = this.set("team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeam: Self = this.set("team", js.undefined)
  }
}

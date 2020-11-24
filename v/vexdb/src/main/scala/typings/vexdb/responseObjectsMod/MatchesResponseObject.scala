package typings.vexdb.responseObjectsMod

import typings.vexdb.vexdbNumbers.`0`
import typings.vexdb.vexdbNumbers.`16`
import typings.vexdb.vexdbNumbers.`1`
import typings.vexdb.vexdbNumbers.`2`
import typings.vexdb.vexdbNumbers.`3`
import typings.vexdb.vexdbNumbers.`4`
import typings.vexdb.vexdbNumbers.`5`
import typings.vexdb.vexdbNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchesResponseObject extends ResponseObject {
  
  var blue1: String = js.native
  
  var blue2: String = js.native
  
  var blue3: String = js.native
  
  var bluescore: Double = js.native
  
  var bluesit: String = js.native
  
  var division: String = js.native
  
  var field: String = js.native
  
  var instance: Double = js.native
  
  var matchnum: Double = js.native
  
  var red1: String = js.native
  
  var red2: String = js.native
  
  var red3: String = js.native
  
  var redscore: Double = js.native
  
  var redsit: String = js.native
  
  var round: `1` | `2` | `3` | `4` | `5` | `6` | `16` = js.native
  
  var scheduled: String = js.native
  
  var scored: `0` | `1` = js.native
  
  var sku: String = js.native
}
object MatchesResponseObject {
  
  @scala.inline
  def apply(
    blue1: String,
    blue2: String,
    blue3: String,
    bluescore: Double,
    bluesit: String,
    division: String,
    field: String,
    instance: Double,
    matchnum: Double,
    red1: String,
    red2: String,
    red3: String,
    redscore: Double,
    redsit: String,
    round: `1` | `2` | `3` | `4` | `5` | `6` | `16`,
    scheduled: String,
    scored: `0` | `1`,
    sku: String
  ): MatchesResponseObject = {
    val __obj = js.Dynamic.literal(blue1 = blue1.asInstanceOf[js.Any], blue2 = blue2.asInstanceOf[js.Any], blue3 = blue3.asInstanceOf[js.Any], bluescore = bluescore.asInstanceOf[js.Any], bluesit = bluesit.asInstanceOf[js.Any], division = division.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], matchnum = matchnum.asInstanceOf[js.Any], red1 = red1.asInstanceOf[js.Any], red2 = red2.asInstanceOf[js.Any], red3 = red3.asInstanceOf[js.Any], redscore = redscore.asInstanceOf[js.Any], redsit = redsit.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], scored = scored.asInstanceOf[js.Any], sku = sku.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchesResponseObject]
  }
  
  @scala.inline
  implicit class MatchesResponseObjectOps[Self <: MatchesResponseObject] (val x: Self) extends AnyVal {
    
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
    def setBlue1(value: String): Self = this.set("blue1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlue2(value: String): Self = this.set("blue2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlue3(value: String): Self = this.set("blue3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluescore(value: Double): Self = this.set("bluescore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluesit(value: String): Self = this.set("bluesit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivision(value: String): Self = this.set("division", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: Double): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchnum(value: Double): Self = this.set("matchnum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRed1(value: String): Self = this.set("red1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRed2(value: String): Self = this.set("red2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRed3(value: String): Self = this.set("red3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedscore(value: Double): Self = this.set("redscore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedsit(value: String): Self = this.set("redsit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRound(value: `1` | `2` | `3` | `4` | `5` | `6` | `16`): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduled(value: String): Self = this.set("scheduled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScored(value: `0` | `1`): Self = this.set("scored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSku(value: String): Self = this.set("sku", value.asInstanceOf[js.Any])
  }
}

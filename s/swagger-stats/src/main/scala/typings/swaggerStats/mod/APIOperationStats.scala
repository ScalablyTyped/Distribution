package typings.swaggerStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIOperationStats extends js.Object {
  
  var defs: js.UndefOr[APIOperationDefinition] = js.native
  
  var details: js.UndefOr[APIOperationDefinition] = js.native
  
  var stats: js.UndefOr[APIOperationDefinition] = js.native
}
object APIOperationStats {
  
  @scala.inline
  def apply(): APIOperationStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APIOperationStats]
  }
  
  @scala.inline
  implicit class APIOperationStatsOps[Self <: APIOperationStats] (val x: Self) extends AnyVal {
    
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
    def setDefs(value: APIOperationDefinition): Self = this.set("defs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefs: Self = this.set("defs", js.undefined)
    
    @scala.inline
    def setDetails(value: APIOperationDefinition): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setStats(value: APIOperationDefinition): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
  }
}
